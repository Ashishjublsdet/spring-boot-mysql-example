# spring-boot-mysql-example

# Spring Boot, MySQL, JPA, Hibernate Rest

Build Restful CRUD API using Spring boot

## Requirements

Create project from https://start.spring.io

Add dependency :

Spring Boot DevTools DEVELOPER TOOLS
Spring Data JPA SQL
Spring Web WEB
MySQL Driver SQL
Spring Security SECURITY
jakarta validation

## Steps to Setup

**1. Clone the application**

```bash

git clone 

```

**2. Create Mysql database**

```bash

create database yourdatabaseName

```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`


+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

 you can run the app without packaging it using -

```bash

mvn spring-boot:run

```

The app will start running at <http://localhost:8080>.

## Rest APIs

GET API :

```bash

/users : Fetch all the users present in database

```

Post API 

   ```bash
   
   /create : Create an user and stored in mysql
   
   ```



