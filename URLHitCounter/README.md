# URL Hit Counter - README

<p align="center">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-purple.svg" />
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-2.5.3-yellow.svg" />
</p>

## Frameworks and Language Used
- Framework: Spring Boot
- Language: Java


### Endpoints
1. **Get Hit Count**: Retrieve the hit count without specifying a username.

   Example URL: `http://localhost:8081/api/v1/visitor-count-app/count`

2. **Get Hit Count with Username**: Retrieve the hit count associated with a username.

   Example URL: `http://localhost:8081/api/v1/visitor-count-app/username/{yourusername}/count`

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Get Hit Count:** `GET /api/v1/visitor-count-app/count`

   This endpoint retrieves the hit count without specifying a username.

2. **Get Hit Count with Username:** `GET /api/v1/visitor-count-app/username/{yourusername}/count`

   This endpoint retrieves the hit count associated with a username.

### Services

The Services layer in this project is minimal but essential. It contains the `UrlHitService` class responsible for managing hit counts. Key responsibilities include:

- Maintaining an internal count variable.
- Providing a method to increment and retrieve the hit count.

### Data Structures Used
- `int count`: An integer variable used to store the hit count in memory. It starts at 0 and is incremented with each request.

## Project Structure

The project follows a structured organization:

- `com.geekster.urlhitcounter.api`: This package contains controller classes responsible for handling HTTP requests. You can extend these controllers or create new ones as needed.

- `com.geekster.urlhitcounter.service`: Inside this package, you'll find the service class `UrlHitService`, which is responsible for managing hit counts. You can customize this service to implement more complex counting logic if required.

- `com.geekster.urlhitcounter.model`: The model package includes the `UrlHitResponse` class, which structures the API responses. You can modify this class to include additional fields or customize the response format as needed for your application.

By adhering to this project structure, you can maintain a clean and organized codebase while implementing the URL hit counter feature in your web application.

## Project Summary
This project is a simple URL hit counter implemented using Spring Boot and Java. It provides two main RESTful API endpoints for tracking and retrieving hit counts.
