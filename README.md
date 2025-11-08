Ticket Booking System – Spring Boot Project
📖 Overview
The Ticket Booking System is a full-stack Java Spring Boot application that allows users to search, book, and manage event, show and movie ticket efficiently.
This project demonstrates the use of Spring Boot, REST APIs, MySQL, and JPA/Hibernate for backend development.

It’s designed with modular architecture and industry-level best practices, making it a great project.


🚀 Features
🔍 Search Event – by name or location.
🚆 View Available Events – check all events with details (name, location, time or seats).
🎫 Book Tickets – select event, enter user details, and confirm booking.
❌ Cancel Tickets – cancel previously booked tickets.
📧 View Bookings by Email – retrieve all bookings linked to a user email.
💳 Payment Simulation – mock payment for ticket booking.
📄 View Booked Ticket – see full details after booking.


🧩 Technologies Used
Backend: Framework	Spring Boot
Database: MySQL
ORM Framework: Spring Data JPA (Hibernate)
API Development: RESTful Web Services
Validation	Jakarta Validation
Build Tool	Maven
IDE	IntelliJ IDEA
Server	Embedded Tomcat
Testing Tool Postman


🗂️ Project Structure
ticket-booking-system/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/ticketbooking/
│   │   │   ├── controller/      # REST Controllers
│   │   │   ├── dto/             # Data Transfer Objects
│   │   │   ├── entity/          # Entity Classes (Event, Ticket, User)
│   │   │   ├── repository/      # JPA Repositories
│   │   │   ├── service/         # Business Logic Layer
│   │   │   └── TicketBookingSystemApplication.java
│   │   └── resources/
│   │       ├── application.properties  # Database configuration
│   │       ├── static/                 # (Optional) frontend assets
│   │       └── templates/              # (Optional) HTML templates
│   └── test/
│       └── java/...                    # Test classes
│
├── pom.xml
└── README.md
