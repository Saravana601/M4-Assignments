package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    // Get All User
    public List<User> getAllUser(){
        return userRepo.getUserList();
    }

    // Add User
    public String addUser(User user) {
        List<User> users = getAllUser();
        users.add(user);
        return "User Added";
    }

    // Add Users
    public String addUsers(List<User> users) {
        List<User> userList = getAllUser();
        userList.addAll(users);
        return "Users added successfully";
    }

    // Get User By Id
    public User getUserById(Integer userId) {
        List<User> users = getAllUser();

        for(User user : users){
            if((user.getUserId()).equals(userId)) return user;
        }
        return null;
    }

    public String updateUserInformation(Integer userId, String emailId) {
        List<User> userList = getAllUser();
        for(User user : userList) {
            if(userId.equals(user.getUserId())) {
                user.setUserEmail(emailId);
                return "User Information for ID : " + userId + " Successfully Updated!!";
            }
        }
        return "User ID " + userId + " not found so user information not updated";
    }


    // Delete User By Id
    public String removeUserById(Integer userId) {
        List<User> users = getAllUser();
        for(User user : users){
            if(user.getUserId().equals(userId)) return user.getUserName() + " got deleted";
        }
        return "userId not found";
    }

}
