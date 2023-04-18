# Project Outline: Log Management Application

![](image.png)


In this project, you will be building a log management application using Java and Spring Boot.   
The application will be a simple RESTful API that accepts log entries, stores them, and provides basic 
search and retrieval functionality. 
The front end will be minimal, using basic HTML and JavaScript to interact with the API.

The project will be broken down into the following deliverables:

1. Setup and create a "Hello, World!" Spring Boot application.
2. Design and implement a basic log entry data model.
3. Create a simple in-memory storage for log entries.
4. Implement RESTful API endpoints for adding, retrieving, and searching log entries.
5. Add basic exception handling and validation for the API.
6. Implement persistence using a database (e.g., MySQL or PostgreSQL).
7. Add authentication and authorization to the API.
8. Create a minimal front end to interact with the API.




# Deliverable 1: Setup and create a "Hello, World!" Spring Boot application

As your teacher, I recommend you to learn and complete the following tasks for this deliverable:

1. Install Java Development Kit (JDK) and set up your Java environment.
2. Familiarize yourself with Java syntax and basic concepts, such as classes, objects, and methods.
3. Set up a development environment (e.g., IntelliJ IDEA or Eclipse).
4. Learn the basics of Spring Boot and its advantages over traditional Java web applications.
5. Create a new Spring Boot project using Spring Initializr (https://start.spring.io/).
6. Add a "Hello, World!" RESTful API endpoint to the project.
7. Run the application locally and test the "Hello, World!" endpoint using a tool like Postman or curl.
8. Once you have completed these tasks, provide the source code for the "Hello, World!" Spring Boot application, and we will move on to the next deliverable.


**SOLUTION**

Create `HelloWorldController.java` at same level
right click, add javaclass 

```java
package com.example.logManagerApp; // annotation indicates that this class is a RESTful controller. 
import org.springframework.web.bind.annotation.GetMapping; //annotation maps HTTP GET requests 
import org.springframework.web.bind.annotation.RestController; // 

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}

```


Now i can hit localhost:8090/hello 

hello is defined in hte `@GetMapping("/hello")`  


## Changing port 

Do this in application.properties file   

server.port=8090
  
