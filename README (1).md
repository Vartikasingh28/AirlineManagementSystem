# Airline Management System

The Airline Management System is a Java-based application developed using Core Java, Swing for the graphical user interface (GUI), MySQL as the database, and JDBC for database connectivity. This system helps manage and store information related to airline operations, including customer details, flight bookings, ticket cancellations, etc.
## Features

- Login System: Secure user authentication to access the system.
-	Flight Details: View and manage flight schedules.
- Add Customer Details: Add new customer data to the system.
- Book Flight: Book a flight for a customer.
- Journey Details: View and manage journey details for customers.
- Cancel Ticket: Cancel an existing booking.
- Boarding Pass: Generate and view a boarding pass.


## Technologies Used
- 	Programming Language: Java (Core)
- UI Library: Swing (for graphical user interface)
- Database Connectivity: JDBC
- Database: MySQL
	- Dependencies:
	- MySQL Connector (mysql-connector-java)
- rs2xml for generating result tables


## Prerequisites
- JDK: Version 8 or higher
- MySQL Server
- Eclipse IDE (optional, for project development)
- Required JAR Files:
		- mysql-connector-java-<version>.jar
- rs2xml.jar
## Setup Instructions
- Clone the Repository:
```bash
git clone https://github.com/YourGitHubUsername/AirlineManagementSystem.git
```

- Database Setup:
- Create a MySQL database for the project.
```sql
CREATE DATABASE airline_management;

USE airline_management;

CREATE TABLE login (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50) NOT NULL
);

CREATE TABLE passenger (
    name VARCHAR(100),
    nationality VARCHAR(50),
    phone VARCHAR(15),
    address VARCHAR(255),
    aadhar VARCHAR(12) PRIMARY KEY,
    gender VARCHAR(10)
);

CREATE TABLE flight (
    flight_id INT PRIMARY KEY AUTO_INCREMENT,
    flight_name VARCHAR(100),
    departure VARCHAR(50),
    arrival VARCHAR(50),
    date DATE,
    available_seats INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id VARCHAR(12),
    flight_id INT,
    booking_date DATE,
    FOREIGN KEY (customer_id) REFERENCES passenger(aadhar),
    FOREIGN KEY (flight_id) REFERENCES flight(flight_id)
);
```
- Import the SQL dump file (if provided) or execute the required SQL queries to create necessary tables.
- Add JAR Files:
- Add the MySQL Connector and rs2xml.jar files to the project library.
- configure JDBC connectivity
```java
public class Conn {
    Connection s;
    public Conn() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection to the database
            s = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_management", "root", "yourpassword");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

- Run the Project:
- Open the project in your IDE(Net Beans).
- Compile and run the Main.java class to start the application.
## Application Workflow

#### Login Screen:
- Users are prompted for a username and password.
- On successful login, users are redirected to the main screen (Home).

#### Home Screen:
- From here, users can choose various actions like adding customer details, booking a flight, or canceling tickets.

#### Add Customer Details:
- Admin enters customer details such as name, nationality, phone, address, aadhar number, and gender.

#### Flight Booking:
- Admin can book flights for customers based on available flight options.

#### Ticket Cancellation:
- Admin can cancel flight bookings.
Boarding Pass Generation:


## Screenshots

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20152541.png)


![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20152613.png)

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20152654.png)

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20152736.png)

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20152801.png)

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20153221.png)

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20153330.png)

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20153411.png)

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20153424.png)

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20153508.png)

![App Screenshot](https://github.com/Vartikasingh28/AirlineManagementSystem/blob/3b49009c72439c62e0fb8b618de5bbfe8a99336b/Screenshot%202025-01-25%20153523.png)

You can adjust the content (e.g., database settings, paths, etc.) to better match your actual implementation.


