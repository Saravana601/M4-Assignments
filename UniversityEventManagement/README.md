# <p align = "center"> University Event Management System </p>

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

The University Event Management System is a Java-based application designed to manage university events and student data. This README provides an overview of the project structure, key components, and how to use the system.

## Table of Contents

- [Frameworks and Language Used](#frameworks-and-language-used)
- [Project Structure](#project-structure)
- [Endpoints](#endpoints)
- [Repositories](#repositories)
- [Services](#services)
- [Models](#models)
- [Getting Started](#getting-started)
- [Project Summary](#project-summary)

## Frameworks and Language Used

- Java
- Spring Boot
- Hibernate
- Jakarta Persistence API (JPA)

## H2 Database

I used the H2 database for local development. To access the H2 Console, follow these steps:

1. After starting the application, navigate to [http://localhost:8080/h2-console](http://localhost:8080/h2-console).

2. Use the following settings to connect:

   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: `ina728mg`

## Project Structure

The project follows a structured approach with various components:

- `com.geekster.UniversityEventManagement.controller`: Contains controllers for handling HTTP requests.
- `com.geekster.UniversityEventManagement.repository`: Includes repositories for data access.
- `com.geekster.UniversityEventManagement.service`: Houses service classes for business logic.
- `com.geekster.UniversityEventManagement.model`: Defines data models and entities.

## Endpoints

### Event Controller

- `POST /event`: Add a single event to the system.
- `POST /events`: Add multiple events to the system.
- `PUT /event/{eventId}`: Update an existing event by ID.
- `DELETE /event/{eventId}`: Delete an event by ID.
- `GET /events`: Retrieve a list of events based on a specified date.

### Student Controller

- `POST /student`: Add a new student to the system, performing validation on student data.
- `PUT /student/{studentId}/{departmentType}`: Update a student's department by ID.
- `DELETE /student/{studentId}`: Delete a student by ID.
- `GET /students`: Retrieve a list of all students.
- `GET /student/{studentId}`: Retrieve a student by ID.

## Repositories

### Event Repository

- `IEventRepository`: Extends Spring Data's `CrudRepository` to interact with the Event entity. Includes a custom method `findByEventDate` to query events by date.

### Student Repository

- `IStudentRepository`: Extends Spring Data's `JpaRepository` to interact with the Student entity.

## Services

### Event Service

- Contains business logic related to events, such as adding, updating, and deleting events, as well as querying events by date.

### Student Service

- Handles student-related operations, including adding, updating, and deleting students, as well as retrieving student information.

## Models

### Event Model

- Represents an event in the system. Includes properties like eventId, eventName, locationOfEvent, eventDate, startTime, and endTime.

### Student Model

- Represents a student in the system. Includes properties like studentId, firstName, lastName, age, and department.

### DepartmentType Enum

- Defines the possible department values for students, such as ME, ECE, CIVIL, and CSE.

## Getting Started

To get started with the University Event Management System, follow these steps:

1. Clone the repository to your local machine.

2. Set up a database for the application and configure the database properties in the application.properties file.

3. Build and run the application.
   

## Project Summary

This project implements a University Event Management System using Java and Spring Boot. It allows the management of events and students. Events can be added, updated, and deleted, and students can be added, updated, and deleted. Students are associated with specific departments defined by the `DepartmentType` enum.

This README provides an overview of the project's structure, controllers, repositories, services, models, and the technologies used. It serves as a guide for developers working on or using this system.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your improvements.

## Contact
If you have any questions or suggestions, feel free to contact me at [Gmail](saravanad2401@gmail.com).
