package com.UserManagement.demo.service;

import com.UserManagement.demo.model.User;
import com.UserManagement.demo.repository.DataSource;
import com.UserManagement.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    // Get All User

    public List<User> getAllUser() {
        return userRepo.getUserList();
    }

    // Add User

    public String inputUser(User user) {
        List<User> users = getAllUser();

        Integer userId = user.getUserId();

        for (User existingUser : users) {
            if (existingUser.getUserId().equals(userId)) {
                return "User with the same userId already exists.";
            }
        }

        users.add(user);
        return "User Added Successfully";
    }

    // Add All User
    public String addAllUser(List<User> user) {
        List<User> users = getAllUser();
        users.addAll(user);
        return "All Users added";
    }

    // Get User
    public User getUser(Integer userId) {
        List<User> users = getAllUser();

        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                System.out.println("User found: " + user.getUserName());
                return user;
            }
        }

        System.out.println("User not found for userId: " + userId);
        return null;
    }


    // Update user
    public String updateInfo(Integer userId, User updatedUser) {
        List<User> users = getAllUser();
        User existingUser = null;
        for(User user : users){
            if(user.getUserId().equals(userId)){
                existingUser = user;
                break;
            }
        }

        if(existingUser == null){
            return "User Not Found!";
        }

        existingUser.setName(updatedUser.getName());
        existingUser.setUserName(updatedUser.getUserName());
        existingUser.setAddress(updatedUser.getAddress());
        existingUser.setPhoneNumber(updatedUser.getPhoneNumber());

        return "User Info Updated Successfully";
    }

    // Delete User

    public String deleteUser(Integer userId) {
        List<User> users = getAllUser();
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                users.remove(user);
                return "User deleted Successfully";
            }
        }

        return "User not found";
    }

}
