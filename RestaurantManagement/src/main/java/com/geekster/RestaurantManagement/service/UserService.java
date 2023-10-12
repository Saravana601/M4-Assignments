package com.geekster.RestaurantManagement.service;

import com.geekster.RestaurantManagement.model.User;
import com.geekster.RestaurantManagement.model.UserAuthenticationToken;
import com.geekster.RestaurantManagement.model.dto.AuthenticationInput;
import com.geekster.RestaurantManagement.model.dto.SignInInput;
import com.geekster.RestaurantManagement.model.enums.UserRole;
import com.geekster.RestaurantManagement.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;

    @Autowired
    UserTokenService userTokenService;

    // SignUp User
    public String userSignUp(User user) {
        String email = user.getEmail();
        if (user.getRole() == UserRole.ADMIN_ROLE) {
            if (!email.endsWith("@admin.com")) {
                return "Email must end with @admin.com for ADMIN_ROLE.";
            }
        }
        User existingUser = iUserRepository.findFirstByEmail(email);
        if(existingUser != null){
            return "You're already signed up! Please sign in";
        }

        String signUpPassword = user.getPassword();
        try {
            String encryptedPassword = PasswordEncryptor.encrypt(signUpPassword);

            user.setPassword(encryptedPassword);
            iUserRepository.save(user);
            return "User registered successfully";
        }
        catch (NoSuchAlgorithmException e) {
            return "Sign up failed! Please try again later.";
        }
    }

    // Sign In User
    public String userSignIn(SignInInput sign) {
        User existingUser  = iUserRepository.findFirstByEmail(sign.getEmail());

        if(existingUser == null) {
            return "You're not signed up! Please sign up";
        }

        String password = sign.getPassword();

        try{
            String encryptedPassword = PasswordEncryptor.encrypt(password);

            if(existingUser.getPassword().equals(encryptedPassword)) {
                UserAuthenticationToken token = new UserAuthenticationToken(existingUser);
                userTokenService.createToken(token);
                return token.getTokenValue();
            }
            else{
                return "Username or password incorrect";
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // User Sign Out
    public String userSignOut(AuthenticationInput authenticationInput) {
        if(userTokenService.authenticate(authenticationInput)){
            String tokenValue = authenticationInput.getTokenValue();
            userTokenService.deleteToken(tokenValue);
            return "Sign out Successfully";
        }
        else{
            return "UnAuthorized access";
        }
    }

    // return all the users
    public List<User> getAllUser() {
        return iUserRepository.findAll();
    }
}
