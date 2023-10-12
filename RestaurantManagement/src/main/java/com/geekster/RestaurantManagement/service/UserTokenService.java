package com.geekster.RestaurantManagement.service;

import com.geekster.RestaurantManagement.model.UserAuthenticationToken;
import com.geekster.RestaurantManagement.model.dto.AuthenticationInput;
import com.geekster.RestaurantManagement.repository.IUserTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTokenService {

    @Autowired
    IUserTokenRepository iUserTokenRepository;

    // It creates Token
    public void createToken(UserAuthenticationToken token) {
        iUserTokenRepository.save(token);
    }

    // This method checks email is valid or not
    public boolean authenticate(AuthenticationInput authenticationInput) {
        String existingEmail = authenticationInput.getEmail();
        String tokenValue = authenticationInput.getTokenValue();

        UserAuthenticationToken token = iUserTokenRepository.findFirstByTokenValue(tokenValue);

        if(token != null){
            return token.getUser().getEmail().equals(existingEmail);
        }
        else {
            return false;
        }
    }

    // This method delete the token
    public void deleteToken(String tokenValue) {

        UserAuthenticationToken existingToken = iUserTokenRepository.findFirstByTokenValue(tokenValue);
        iUserTokenRepository.delete(existingToken);

    }
}
