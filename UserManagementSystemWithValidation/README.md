# <p align="center">User Management System With Validation</p>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-purple.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-blue.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-yellow.svg" />
</p>

## Project Description
This Spring Boot project is a User Management System designed to manage user data efficiently. It provides RESTful API endpoints for various user-related operations, including adding users, retrieving user information, updating user details, and deleting users. The project incorporates data validation using Spring Boot annotations to ensure data integrity.

## Frameworks and Language Used
- Java
- Spring Boot
- Jakarta Validation API
- Lombok

## Data Structure Used
- User class with the following attributes:
  - userId (Integer)
  - userName (String)
  - userDOB (String)
  - userEmail (String)
  - phoneNumber (String)
  - userType (Type)
  - userCreateDate (LocalDate)
  - userCreateTime (LocalTime)
- List: Used to store user objects in memory.

## Functionality
### Controller
- `POST /user`: Add a user
- `POST /users`: Add multiple users
- `GET /user/id/{userId}`: Retrieve user by ID
- `GET /users`: Retrieve all users
- `PUT /user/{userId}/email/{userEmail}`: Update user's email
- `DELETE /users/{userId}`: Delete user by ID

## User Attributes
- **UserId**: Unique identifier for each user.
- **username**: User's name.
- **DateOfBirth**: Date of birth (validated with hyphen (-) format).
- **email**: User's email address.
- **PhoneNumber**: Phone number (12-digit format with the first two digits as the country code).
- **Date**: User creation date.
- **Time**: User creation time.

## Data Validation
Data validation is an essential part of this project. The following Spring Boot annotations have been used for validation:

- `@NotNull`: Ensures that the field is not null.
- `@NotBlank`: Ensures that the field is not blank.
- `@Pattern`: Validates fields using regular expressions.
- `@Email`: Validates email addresses.
- `@Size`: Validates the size of fields (e.g., phone number length).

## Usage
You can use this User Management System in your Java projects to manage user data efficiently. It includes validation for user inputs to ensure data integrity.

## Installation
To use this project, follow these steps:

1. Clone the repository.
2. Build the project using your preferred Java build tool.
3. Run the application.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your improvements.

## Contact
If you have any questions or suggestions, feel free to contact me at [Gmail](saravanad2401@gmail.com).


