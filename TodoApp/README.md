# TodoApp

## Frameworks and Language Used

- Framework: Spring Boot
- Language: Java

## Data Flow

### 1. Controller

- The `TodoController` class is responsible for handling HTTP requests related to todos.
- It uses Spring annotations like `@RestController`, `@PostMapping`, `@GetMapping`, `@PutMapping`, and `@DeleteMapping` to define RESTful API endpoints.
- The controller interacts with the `TodoService` to perform various operations on todos.

### 2. Services

- The `TodoService` class is a service layer that handles business logic for todos.
- It communicates with the `TodoRepository` for data access.
- It contains methods for adding, updating, deleting, and fetching todos.

### 3. Repository

- The `TodoRepository` class manages the data related to todos.
- It holds a list of todo items, which is injected as a bean using the `@Autowired` annotation.
- It provides access to the list of todos for the `TodoService`.

### 4. Database Design

- There is no explicit database in this application; instead, the data is stored in-memory as a list of `Todo` objects.
- The `Todo` class represents a todo item with properties like `todoId`, `todoName`, and `isTodoDone`.

## Data Structures Used in Your Project

- ArrayList: An ArrayList is used to store and manage the list of `Todo` objects.

## Project Summary

This project, known as `TodoApp`, is a web application built using Spring Boot and Java. It offers a simple RESTful API for managing todo items. The key components include the controller, service, and repository. Todos are stored in an in-memory ArrayList, eliminating the need for a traditional database. The application provides functionalities like adding, updating, deleting, and fetching todos based on their completion status.


## Contact

If you have any questions or suggestions, feel free to contact me at the following
- [Gmail](saravanad2401@gmail.com).
- [LinkedIn](https://www.linkedin.com/in/saravanad2401/).
