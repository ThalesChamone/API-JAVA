Employee Registration API
API for registering employees using Java and Spring Boot, designed for secure and organized employee management. This project includes CRUD operations, token-based authentication for specific endpoints, and is built with a modular architecture using best practices.

Technologies Used
Java: Core programming language for backend development.
Spring Boot: Framework for building and running the application.
Spring Data JPA: To manage database operations with an ORM approach.
MySQL: Database used to store employee information.
Lombok: For cleaner code by reducing boilerplate (e.g., getters, setters, constructors).
Swagger: For API documentation and interactive testing of endpoints.
Maven: Dependency management and project build automation.
Features
Employee management (CRUD operations)
Swagger integration for API documentation
Getting Started
Prerequisites
Java 17 or higher
MySQL (configure the database connection in application.properties)
Maven

The API will be accessible at http://localhost:8080.

API Documentation
Swagger documentation is available at:

http://localhost:8080/swagger-ui.html
API Endpoints
Employee CRUD:

POST /api/employees: Create an employee
GET /api/employees/{id}: Retrieve employee details
PUT /api/employees/{id}: Update employee information
DELETE /api/employees/{id}: Delete an employee
