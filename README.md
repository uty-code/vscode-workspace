# Guest Book (Spring Boot)

A simple guest book web application built with Spring Boot, Spring MVC, Thymeleaf, and Spring Data JPA.
Users can view posts and write a new post through server-rendered pages.

## Features

- View guest book posts in descending order
- Write and save a new post
- Automatically store post creation timestamp
- Render pages with Thymeleaf templates

## Tech Stack

- Java 21
- Spring Boot 4.0.4
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

## Project Structure

src/main/java/com/uty/guestbook

- controller/BookController.java
- domain/GuestBook.java
- repository/GuestBookRepository.java
- service/GuestBookService.java

src/main/resources

- templates/list.html
- templates/write.html
- application.properties

## Prerequisites

- JDK 21
- Maven 3.9+
- MySQL server running locally

## Database Configuration

The app uses the following datasource values from application.properties:

- URL: jdbc:mysql://localhost:13306/gbook_db?allowPublicKeyRetrieval=true&useSSL=false&characterEncoding=UTF-8&serverTimezone=Asia/Seoul&allowMultiQueries=true
- Username: uty
- Password: 1234

If your environment is different, update src/main/resources/application.properties.

Example SQL to prepare the database:

```sql
CREATE DATABASE IF NOT EXISTS gbook_db
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;
```

Note: The table is created/updated automatically by JPA because spring.jpa.hibernate.ddl-auto=update.

## Run Locally

### 1. Build

```bash
./mvnw clean package
```

On Windows (PowerShell/CMD):

```bat
mvnw.cmd clean package
```

### 2. Start the app

```bash
./mvnw spring-boot:run
```

On Windows:

```bat
mvnw.cmd spring-boot:run
```

The server starts on port 8080.

## Usage

- List page: http://localhost:8080/book/list
- Write page: http://localhost:8080/book/add

Flow:

1. Open the list page.
2. Click the write link.
3. Enter post content and writer.
4. Submit to save and return to the list.

## HTTP Endpoints

- GET /book/list
- GET /book/
- GET /book/add
- POST /book/add

## Test

```bash
./mvnw test
```

On Windows:

```bat
mvnw.cmd test
```

## License

No license has been specified yet.
