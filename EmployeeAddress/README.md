# <p align = "center">Employee Address </p>

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
The Employee Address is a Java-based application designed to manage Employee and their address. This README provides an overview of the project structure, key components, and how to use the system.

## Framework and language used
- Framework: Spring Boot
- Language: Java
- Database: SQL (Relational Database)

## Project Structure
The project follows a structured approach with various components:
- `com.geekster.EmployeeAddress.controller`: Contains controllers for handling HTTP requests.
- `com.geekster.EmployeeAddress.repository`: Includes repositories for data access.
- `com.geekster.EmployeeAddress.service`: Houses service classes for business logic.
- `com.geekster.EmployeeAddress.model`: Defines data models and entities.

## Data Flow

### Controller

### EmployeeController
Handles employee-related operations.

- `POST /employee`: Adds an employee.
- `GET /employee/{employeeId}`: Retrieves an employee by ID.
- `GET /employee`: Retrieves all employees.
- `PUT /employee/{employeeId}`: Updates an employee by ID.
- `DELETE /employee/{employeeId}`: Deletes an employee by ID.

### AddressController
Handles address-related operations.

- `POST /addresses`: Adds an address.
- `GET /addresses/{addressId}`: Retrieves an address by ID.
- `GET /addresses`: Retrieves all addresses.
- `PUT /addresses/{addressId}`: Updates an address by ID.
- `DELETE /addresses/{addressId}`: Deletes an address by ID.

### Services

- `EmployeeService`: Provides services for employee-related operations.
- `AddressService`: Provides services for address-related operations.

### Repository

- `IEmployeeRepository`: JPA repository for Employee entities.
- `IAddressRepository`: JPA repository for Address entities.

### Model

- `Employee`: Represents employee data, including first name, last name, and address.
- `Address`: Represents address data, including street, city, state, and zipcode.

## Data Structure Used

- MySQL database for data storage.

### How to Run

To run the project, follow these steps:

1. Clone this repository.
2. Configure your MySQL database connection properties in the application.properties.
3. Run the `EmployeeAddressApplication` class as the main entry point.

## Project Summary

This project implements an Employee and Address Management System using Java and Spring Boot. It enables the management of employee records and associated addresses. Employees can be added, updated, and deleted, and addresses can be associated with employees, allowing for efficient data organization.

This README provides a comprehensive overview of the project's structure and components, including controllers, repositories, services, models, and the technologies utilized. It serves as a reference and guide for developers involved in the development or utilization of this system.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your improvements.

## Contact
If you have any questions or suggestions, feel free to contact me at [Gmail](saravanad2401@gmail.com).
