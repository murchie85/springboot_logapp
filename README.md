# Project Outline: Log Management Application

![](image.png)

## Other Java Tutorials 

- [javaBasics](https://github.com/murchie85/javaBasics-Again-)

## Contents  

- <a href="#deliverable-1">Link to Deliverable 1</a>
- <a href="#deliverable-2">Link to Deliverable 2</a>
- <a href="#deliverable-3">Link to Deliverable 3</a>


## SUMMARY OF WORK 
 
**NOTE** Anyone else reading this who isn't me, can treat the steps here as the stuff you should try out before looking at the solutions.  

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




<h1 id="deliverable-1">Deliverable 1: Setup and create a "Hello, World!" Spring Boot application</h1>

As your teacher, I recommend you to learn and complete the following tasks for this deliverable:

1. Install Java Development Kit (JDK) and set up your Java environment.
2. Familiarize yourself with Java syntax and basic concepts, such as classes, objects, and methods.
3. Set up a development environment (e.g., IntelliJ IDEA or Eclipse).
4. Learn the basics of Spring Boot and its advantages over traditional Java web applications.
5. Create a new Spring Boot project using Spring Initializr (https://start.spring.io/).
6. Add a "Hello, World!" RESTful API endpoint to the project.
7. Run the application locally and test the "Hello, World!" endpoint using a tool like Postman or curl.
8. Once you have completed these tasks, provide the source code for the "Hello, World!" Spring Boot application, and we will move on to the next deliverable.

<h1 id="deliverable-2">Deliverable 2: Design and implement a basic log entry data model</h1>

For this deliverable, you will need to create a data model to represent log entries in your application. Each log entry should have a timestamp, a log level (e.g., INFO, WARNING, ERROR), and a message.

As your teacher, I recommend you to learn and complete the following tasks for this deliverable:

1. Learn about Java classes, constructors, and getter/setter methods.
2. Familiarize yourself with Java Enums to represent the log levels.
3. Create a LogEntry class that contains the following fields:
4. A unique identifier (e.g., UUID or long)
5. A timestamp (e.g., LocalDateTime or Instant)
6. A log level (using an Enum)
7. A message (String)
8. Implement constructors, getters, and setters for the LogEntry class.

Once you have completed these tasks, provide the source code for the LogEntry class, and we will move on to the next deliverable.


<h1 id="deliverable-3">Deliverable 3: In-memory storage and RESTful API for log entries</h1>

Create a `LogService` class that will be responsible for managing log entries. In this class, define a `List<LogEntry>` as an in-memory storage for your log entries. Implement the following methods:

- `addLogEntry(LogEntry entry)`: Add a new log entry to the list.
- `List<LogEntry> getAllLogEntries()`: Return the list of all log entries.
- `Optional<LogEntry> getLogEntry(UUID id)`: Return a log entry by its UUID, wrapped in an `Optional` object.
- `boolean deleteLogEntry(UUID id)`: Delete a log entry by its UUID. Return `true` if the log entry was found and deleted, `false` otherwise.
- `Optional<LogEntry> updateLogEntry(UUID id, LogEntry newEntry)`: Update a log entry by its UUID with the new entry provided. Return the updated log entry wrapped in an `Optional` object if the update was successful, or an empty `Optional` if the log entry was not found.

Annotate the `LogService` class with `@Service` to mark it as a **Spring Service** component.

In your `HelloWorldController`, inject an instance of `LogService` using the `@Autowired` annotation.

Create new **RESTful API** endpoints in your `HelloWorldController` to perform the following operations:

- Add a new log entry (HTTP POST request)
- Get all log entries (HTTP GET request)
- Get a log entry by UUID (HTTP GET request)
- Delete a log entry by UUID (HTTP DELETE request)
- Update a log entry by UUID (HTTP PUT request)

For each endpoint, use appropriate request methods, paths, and path variables, and return appropriate **HTTP status codes** for the operation's result.



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
  





# GENERAL JAVA NOTES  

## Constructor 

Must have the same name as the class
Don't give it a type, its just 
`public Car(String make, String model, int year){}`

