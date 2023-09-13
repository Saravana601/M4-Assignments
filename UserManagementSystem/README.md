# User Management System - README

## Frameworks and Language Used
- Framework: Spring Boot
- Language: Java

## Data Flow

### Controller
1. `addUser`: POST endpoint to add a new user.
2. `getUser/{userId}`: GET endpoint to retrieve a user by their userId.
3. `getAllUser`: GET endpoint to retrieve all users.
4. `updateUserInfo/{userId}`: PUT endpoint to update user information.
5. `deleteUser/{userId}`: DELETE endpoint to delete a user by their userId.

## Data Structures Used
- List: Used to store user objects in memory.

## Project Summary
This project is a User Management System implemented using Spring Boot and Java. It provides a set of RESTful endpoints to perform CRUD (Create, Read, Update, Delete) operations on user data. Users have attributes such as userId, name, userName, address, and phoneNumber.

### Endpoints
- `addUser`: Adds a new user to the system.
- `getUser/{userId}`: Retrieves a user by their userId.
- `getAllUser`: Retrieves a list of all users.
- `updateUserInfo/{userId}`: Updates user information.
- `deleteUser/{userId}`: Deletes a user by their userId.

The project also includes error handling, ensuring that proper status codes and error messages are returned when needed. Additionally, validation has been implemented to ensure data integrity.
