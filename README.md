# Cornell Notes Backend

[![Build Status](https://travis-ci.org/your-username/Cornell-Notes-Backend.svg?branch=main)](https://travis-ci.org/your-username/Cornell-Notes-Backend)
[![Java Version](https://img.shields.io/badge/java-21-blue.svg)](https://openjdk.java.net/projects/jdk/21/)
[![Spring Boot Version](https://img.shields.io/badge/spring--boot-3.2.1-brightgreen.svg)](https://spring.io/projects/spring-boot)


## Description

This project serves as the backend for the Chingu Voyages collaborative note-taking application. It is built using Java, Spring Boot, Spring Data JPA, and Postgre.

## Prerequisites

- Java 21
- PostgreSQL (for local development)

## Getting Started

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/Cornell-Notes-Backend.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd Cornell-Notes-Backend
   ```
3. **create Database**
   If you already have psql installed can be done in terminal with
   ```bash
   createdb <database name>
   ```
4. **setup application-dev.properties**
   In order for spring-boot to connect to your database you will need to add a file application-dev.properties in `src/main/resources/`
   in this file will need the following properties to be added and updated to with your information
   ```bash
   DATABASE=jdbc:postgresql://localhost:5432/<database name>
   USERNAME=<your username>
   PASSWORD=<your password>
   spring.jpa.hibernate.ddl-auto=update
   ```
   double check that application-dev.properties is in you gitignore file before pushing anything to git

5. **Build and run the application:**
   ```bash
    ./mvnw spring-boot:run
   ```
   The application will be accessible at http://localhost:8080.

