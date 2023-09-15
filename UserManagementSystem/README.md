# User Management System - README

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-purple.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-blue.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-yellow.svg" />
</p>


## Frameworks and Language Used
- Framework: Spring Boot
- Language: Java
- Build Tool: Maven


## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Add User:** `POST /user`
2. **Add Users:** `POST /users`
3. **Get All Users:** `GET /users`
4. **Get User by ID:** `GET /user/{userID}`
5. **Update User Info** `PUT /user/{userId}`
6. **Delete User by ID:** `DELETE /user/{userID}`

## Services

The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

- Validating input data.
- Performing CRUD operations on user data.
- Handling data transformations and interactions with external systems (if applicable).

## Data Structures Used
- List: Used to store user objects in memory.

## Project Summary
This project is a User Management System implemented using Spring Boot and Java. It provides a set of RESTful endpoints to perform CRUD (Create, Read, Update, Delete) operations on user data. Users have attributes such as userId, name, userName, address, and phoneNumber.

### Endpoints
- `POST /user`: Adds a new user to the system.
- `POST /users`: Adds all users to the system.
- `GET /user/{userId}`: Retrieves a user by their userId.
- `GET/ users`: Retrieves a list of all users.
- `PUT /user/{userId}`: Updates user information.
- `DELETE /user/{userId}`: Deletes a user by their userId.

The project also includes error handling, ensuring that proper status codes and error messages are returned when needed. Additionally, validation has been implemented to ensure data integrity.
