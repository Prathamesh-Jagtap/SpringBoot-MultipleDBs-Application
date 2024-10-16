# Spring Boot Multiple Databases Application

# Overview
This is a Spring Boot application configured to use two different MySQL databases: one for managing **Customer** data and the other for managing **Product** data. The application demonstrates how to configure and manage multiple databases within a single Spring Boot project using **JPA** and **Hibernate**.

# Features
- Connect to two different MySQL databases.
- Use separate `EntityManagerFactory` and `TransactionManager` for each database.
- Perform CRUD operations on two separate databases.

# Technologies Used
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

# Prerequisites
Before you begin, ensure that you have the following installed on your machine:
- Java 11 or higher
- Maven
- MySQL

# Setup and Configuration

1. Clone the repository:
   
```bash
https://github.com/Prathamesh-Jagtap/SpringBoot-MultipleDBs-Application.git
cd SpringBoot-MultipleDBs-Application
```

2. Create Two Databases:
   
```bash
CREATE DATABASE customerdatabase;
CREATE DATABASE productdatabase;
```

3. Build and Run the Project:
   
```bash
mvn clean install
mvn spring-boot:run
```
  
