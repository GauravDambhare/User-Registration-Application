# User-Registration-Application
This project is a simple user registration application developed using Spring Boot. It provides a basic form for users to register by providing their username, password, mobile number, and email. The application saves user data in a MySQL database.

## Technologies Used

- Java 17
- Spring Boot 3.2.1
- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- Tomcat Embed Jasper
- Spring Boot DevTools
- MySQL Connector J
- Hibernate

## Project Structure

The project follows the MVC (Model-View-Controller) architecture to handle user registration:

- `Test1Controller`: Handles HTTP requests, serves the register form, and saves user data.
- `Test1Service`: Contains the business logic to register users.
- `Test1Dao`: Manages database operations and saves user data.

## How to Run

1. Clone the repository.
2. Open the project in your preferred IDE.
3. Configure the MySQL database settings in the `application.properties` file.
4. Run the `SaveUserApplication.java` file to start the Spring Boot application.
5. Access the application through a web browser at `http://localhost:8080/register`.

## Usage

Fill in the required details in the provided form fields and submit the form to register a new user.

Feel free to explore the code and contribute to this project!
