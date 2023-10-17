# HotelManagement

## Overview
The Hotel Management project is a web application developed using Spring Boot and Java. It provides a RESTful API for managing hotel rooms. The system consists of various components, including a controller, service, and repository, to handle operations related to hotel rooms. Key features of the project include the ability to add, update, delete, and retrieve hotel rooms, as well as the ability to query rooms based on different criteria.

## Frameworks and Language Used

- Framework: Spring Boot
- Language: Java

## Data Flow

### 1. Model

The `HotelRoom` class represents a hotel room entity. It is annotated with `@Entity` and corresponds to the "Room" table in the database. This class includes fields like `roomId`, `roomNumber`, `roomType`, `roomPrice`, and `roomStatus`. 

The `RoomType` enum defines the types of hotel rooms: AC, NON_AC, and DELUXE.

### 2. Controller

The `RoomController` class is responsible for handling HTTP requests related to hotel rooms. It uses Spring annotations like `@RestController`, `@PostMapping`, `@GetMapping`, `@PutMapping`, and `@DeleteMapping` to define RESTful API endpoints. The controller interacts with the `RoomService` to perform various operations on rooms.

## Endpoints

- `POST /room`: Adds a single hotel room to the database.
- `POST /rooms`: Adds a list of hotel rooms to the database.
- `GET /room/{id}`: Retrieves a hotel room by its ID.
- `GET /rooms`: Retrieves all hotel rooms.
- `GET /room/{id}/exists`: Checks if a room with a specific ID exists.
- `GET /rooms/count`: Returns the total number of rooms.


### 3. Service

The `RoomService` class is a service layer that handles business logic for hotel rooms. It communicates with the `IRoomRepository` for data access. It contains methods for adding, updating, deleting, and fetching rooms, as well as querying rooms by various criteria.

### 4. Repository

The `IRoomRepository` is a Spring Data JPA repository interface that provides database access for hotel rooms. It includes custom query methods to retrieve rooms based on different criteria.

## Data Structures Used in Your Project

- Entity: `HotelRoom` represents a hotel room with its attributes.
- Enum: `RoomType` defines the different types of hotel rooms.

## Project Summary

This project, the Hotel Management system, is developed using Spring Boot and Java. It offers a RESTful API for managing hotel rooms. Key components include the controller, service, and repository. Rooms are stored in a database, and the system provides functionalities like adding, updating, deleting, and fetching rooms. It also supports various queries to find rooms based on their status, type, price range, and more.

## How to Run

To run the Hotel Management system, follow these steps:

1. Clone the repository.
2. Navigate to the project directory.
3. Build the project using your preferred build tool (e.g., Maven).
4. Run the application.
5. Access the API endpoints as defined in the `RoomController`.


## Contact

If you have any questions or suggestions, feel free to contact me at the following
- [Gmail](saravanad2401@gmail.com).
- [LinkedIn](https://www.linkedin.com/in/saravanad2401/).
