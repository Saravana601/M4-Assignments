# <p align = "center"> Restaurant Management System </p>
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

## Overview

This is a Restaurant Management System built in Java using the Spring Boot framework. The system provides features for managing users, food items, orders, and user authentication tokens.

## Frameworks and Technologies

- Spring Boot
- Jakarta Persistence (JPA)
- Lombok
- MySQL

## Language Used

- Java

## API Endpoints

### AdminController

- `POST /foodItem`: Creates a new food item.
- `DELETE /foodItem/{email}/{foodId}`: Deletes a food item by ID.
- `GET /users`: Retrieves a list of all users.

### UserController

- `POST /user/signUp`: Allows users to sign up.
- `POST /user/signIn`: Allows users to sign in and generate an authentication token.
- `DELETE /user/signOut`: Allows users to sign out using an authentication token.
- `POST /user/order`: Allows users to place an order for food items.
- `GET /foods`: Retrieves a list of available food items.

### VisitorController

- `GET /visitor/foods/`: Retrieves a list of available food items for visitors.

## Database Design

- The system uses MySQL as the database to store user data, food items, orders, and authentication tokens.

## Data Structures

- Entity classes for User, Order, Food, and UserAuthenticationToken.
- Enumerations for UserRole and OrderStatus.
- Custom data structures for managing user authentication tokens.

## Services

### FoodService

- `createFoodItem(String email, Food foodItem)`: Creates a new food item if the user has admin privileges.
- `deleteFoodItem(String email, Long foodId)`: Deletes a food item by ID if the user has admin privileges.
- `getAllFoodItems()`: Retrieves a list of all food items.

### OrderService

- `addOrder(Order order, String email)`: Allows users to place an order for a food item, with validation and order creation.

### UserService

- `userSignUp(User user)`: Allows users to sign up and stores user data in the database.
- `userSignIn(SignInInput sign)`: Allows users to sign in and generates an authentication token.
- `userSignOut(AuthenticationInput authenticationInput)`: Allows users to sign out using an authentication token.
- `getAllUser()`: Retrieves a list of all users.

### UserTokenService

- `createToken(UserAuthenticationToken token)`: Creates an authentication token for a user upon successful sign-in.
- `authenticate(AuthenticationInput authenticationInput)`: Validates the user's token during requests.
- `deleteToken(String tokenValue)`: Deletes a user's authentication token during sign-out.

## Project Security

Security is a top priority in this project. To ensure the safety of user data, password hashing is implemented. When users sign up or change their passwords, the system securely hashes their passwords using industry-standard encryption algorithms. This means that plaintext passwords are never stored, adding an additional layer of protection to user accounts.


## Project Summary

The Restaurant Management System is designed to efficiently manage restaurant operations. Users can sign up, sign in, place food orders, and manage food items. The system ensures data security through the use of authentication tokens and supports different user roles, such as admin and user.

This README provides an overview of the project's architecture, features, and functionality. For detailed documentation, please refer to the source code and comments in the project files.

## Contributing

Contributions are welcome! Feel free to open issues or pull requests for any improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or suggestions, feel free to contact me at the following
- [Gmail](saravanad2401@gmail.com).
- [LinkedIn](https://www.linkedin.com/in/saravanad2401/).
