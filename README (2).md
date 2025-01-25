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
- rs2xml.jar for generating result tables
- rcalender.jar  for showing date.


## Prerequisites
- JDK: Version 8 or higher
- MySQL Server
- Net Beans IDE (optional, for project development)
- Required JAR Files:
		- mysql-connector-java-<version>.jar
- rs2xml.jar
- jcalender.jar
## Setup Instructions
- Clone the Repository:
```bash
git clone https://github.com/YourGitHubUsername/AirlineManagementSystem.git
```

- Database Setup:
- Create a MySQL database for the project.
```sql
1- Create a database with name airlinemanagementsystem;

create database airlinemanagementsystem;

2- Use the database you have just created

use airlinemanagementsystem;

3 - Create first table login inside the airlinemanagementsystem database;

create table login(username varchar(20), password varchar(20));

4 - Insert value in the login table for the admin to login

insert into login values('admin', 'pswd');

5 - Create next table passenger to store user values;

create table passenger (name varchar(20), nationality varchar(20), phone varchar(15), address varchar(50), aadhar varchar(20), gender varchar(20));

6 - Create table to store flight information

create table flight(f_code varchar(20), f_name varchar(20), source varchar(40), destination varchar(40));

7 - Insert some flight information in the flight table

insert into flight values("1001", "AI-1212", "Delhi", "Mumbai");
insert into flight values("1002", "AI-1453", "Delhi", "Goa");
insert into flight values("1003", "AI-1112", "Mumbai", "Chennai");
insert into flight values("1004", "AI-3222", "Delhi", "Amritsar");
insert into flight values("1005", "AI-1212", "Delhi", "Ayodhya");


8 - Create reservation table to store user ticket booking information

create table reservation(PNR varchar(15), TICKET varchar(20), aadhar varchar(20), name varchar(20), nationality varchar(30), flightname varchar(15), flightcode varchar(20), src varchar(30), des varchar(30), ddate varchar(30));

9 - Create table cancel to store cancel tickets information

create table cancel(pnr varchar(20), name varchar(40), cancelno varchar(20), fcode varchar(20), ddate varchar(30));    
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
            s = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagementsysstem", "root", "yourpassword");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

- Run the Project:
- Open the project in your IDE(Net Beans).
-Run the application  to start the application.
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
Boarding Pass Generation: ticket detail will  show.
 #### Demo
 https://github.com/Vartikasingh28/AirlineManagementSystem/blob/75aae4a550a21c4a5fc98b5b6c6c7cc4fd82dc2d/AirlineManagementSystem1.jar

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


