# Employee Todo Management System

A Full Stack Employee and Task Management application built using **Angular**, **Spring Boot**, and **MySQL**. This application enables administrators to manage employees and their assigned tasks through a responsive and user-friendly interface.

---

## 🚀 Features

### Employee Management

* Add Employee
* View Employee List
* Update Employee Details
* Delete Employee
* Search Employees

### Task Management

* Add Task
* View Task List
* Update Task
* Delete Task
* Search Tasks
* Assign Tasks to Employees
* Task Priority (High, Medium, Low)
* Task Status (Pending, In Progress, Completed)

---

## 🛠 Tech Stack

### Frontend

* Angular 20
* TypeScript
* HTML5
* CSS3
* Bootstrap 5
* Angular Reactive Forms

### Backend

* Java 24
* Spring Boot 3.5
* Spring Data JPA
* Hibernate
* Maven

### Database

* MySQL 8

### Tools

* IntelliJ IDEA
* Visual Studio Code
* Postman
* Git
* GitHub

---

## 📂 Project Structure

```
Employee-Todo
│
├── employee-todo-frontend
│   ├── src
│   ├── public
│   ├── package.json
│   ├── angular.json
│   └── ...
│
├── employee-todo-backend
│   ├── src
│   ├── pom.xml
│   ├── mvnw
│   └── ...
│
└── README.md
```

---

## ⚙️ Backend Setup

1. Open **employee-todo-backend** in IntelliJ IDEA.
2. Create a MySQL database:

```sql
CREATE DATABASE employee_todo_db;
```

3. Update the **application.properties** file.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_todo_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8081
```

4. Run the Spring Boot application.

Backend URL:

```
http://localhost:8081
```

---

## 💻 Frontend Setup

Open the frontend project.

```bash
cd employee-todo-frontend
```

Install dependencies.

```bash
npm install
```

Run Angular.

```bash
ng serve
```

Application URL

```
http://localhost:4200
```

---

## 🔗 REST APIs

### Employee APIs

| Method | Endpoint            | Description        |
| ------ | ------------------- | ------------------ |
| GET    | /api/employees      | Get All Employees  |
| GET    | /api/employees/{id} | Get Employee By ID |
| POST   | /api/employees      | Add Employee       |
| PUT    | /api/employees/{id} | Update Employee    |
| DELETE | /api/employees/{id} | Delete Employee    |

---

### Task APIs

| Method | Endpoint        | Description    |
| ------ | --------------- | -------------- |
| GET    | /api/tasks      | Get All Tasks  |
| GET    | /api/tasks/{id} | Get Task By ID |
| POST   | /api/tasks      | Add Task       |
| PUT    | /api/tasks/{id} | Update Task    |
| DELETE | /api/tasks/{id} | Delete Task    |

---

## 📸 Screenshots

Add screenshots here after uploading them to GitHub.

* Dashboard
* Employee Management
* Task Management
* Add Employee
* Add Task

---

## ✨ Highlights

* Full Stack CRUD Application
* Responsive UI
* RESTful APIs
* MySQL Database Integration
* Employee & Task Management
* Angular Reactive Forms
* Form Validation
* Search Functionality
* Layered Architecture
* Clean Code Structure
* Spring Boot + Angular Integration

---

## 🔮 Future Enhancements

* JWT Authentication
* Role-Based Access Control
* Dashboard Analytics
* Email Notifications
* Pagination
* Sorting & Filtering
* File Upload
* Docker Support
* CI/CD Pipeline
* Unit & Integration Testing

---

## 👨‍💻 Author

**Varun Rana**

* GitHub: https://github.com/varun1485

---

## 📄 License

This project is developed for learning, portfolio, and demonstration purposes.
