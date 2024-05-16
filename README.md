# Web Services Project with Spring Boot and JPA / Hibernate

This is a Java Spring Boot project that implements a Web Services system using JPA (Java Persistence API) and Hibernate. The main goal is to create an application with CRUD (Create, Retrieve, Update, Delete) functionalities, exception handling, and layered architecture.

## Technologies Used

- **Spring Boot**: A framework to simplify configuration and development of Java applications.
- **Spring Web**: A module of the Spring Framework for creating web applications.
- **Spring Data JPA**: Eases the implementation of JPA-based repositories.
- **Hibernate**: An object-relational mapping framework for Java.
- **H2 Database**: An in-memory database for testing.
- **Java 17**: The primary programming language.
- **Maven**: A dependency management tool.

## Application Features

### Domain Model

![image](https://github.com/marialuizaleitao/workshop-springboot3-jpa/assets/88951059/738d5306-10e8-41fa-95ef-e2fcb9bfa4b1)

![image](https://github.com/marialuizaleitao/workshop-springboot3-jpa/assets/88951059/9322e252-03e0-4b37-a043-46f0f4860a34)

### Logical Layers

![image](https://github.com/marialuizaleitao/workshop-springboot3-jpa/assets/88951059/ab6f951b-1213-4bde-923c-b7499a540e78)

### Checklist

- **Spring Initializr**: Used to configure the project with Maven, Java 17, and JAR packaging, along with the Spring Web dependency.
- **User Entity and Resource**: Implementation of the User entity with basic attributes, associations, constructors, getters, setters, hashCode, equals, and serialization.
- **H2 Database, Test Profile, and JPA**: Configuration of the H2 database for testing, test profile in the `application.properties` file, and JPA mapping for entities.
- **JPA Repository, Dependency Injection, and Database Seeding**: Use of `UserRepository` for CRUD operations, dependency injection, and seeding the database with users.
- **Service Layer and Component Registration**: Implementation of the service layer and registration of Spring components.
- **New Order Entity**: Implementation of the Order entity with associations and JPA mapping.
- **Order Status Enumeration**, **Category**, and **Product**: Implementation of entities related to orders, categories, and products.
- **Many-to-Many Association with JoinTable** and **One-to-Many Association**: Implementation of associations between Order and Product.
- **One-to-One Association with Payment**: Implementation of the association between Order and Payment.
- **Methods for Order Subtotal and Total**: Implementation of methods to calculate order subtotal and total.
- **User Insertion, Deletion, and Update**: Implementation of services and resources for inserting, deleting, and updating users.
- **Exception Handling**: Implementation of exception handling for user retrieval, deletion, and update operations.

## How to Run the Project

1. Clone this repository.
2. Import the project into your preferred IDE (recommended: IntelliJ IDEA, Eclipse).
3. Ensure that Java 17 and Maven are installed on your machine.
4. Run the project as a Spring Boot application.

## Test Examples

### User Insertion

```json
{
 "name": "Fernando Alonso",
 "email": "alonso33@gmail.com",
 "phone": "977557733",
 "password": "123456"
}
```

### User Update

```json
{
 "name": "Fernando Alonso",
 "email": "alonso14@gmail.com",
 "phone": "977557714"
}
```
## Contributing

Contributions are welcome! If you encounter any issues or have suggestions, please open an issue in this repository.
