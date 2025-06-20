# Logistic Automation G3

A Java-based logistics automation system for managing shipments, deliveries, and driver assignments. The system features a Swing-based GUI for scheduling deliveries, assigning drivers, and generating reports.

## Features
- **Delivery Scheduling:** Schedule deliveries for shipments and customers, with date/time slot selection.
- **Driver Assignment:** Assign the best available delivery personnel to shipments based on availability and location.
- **Shipment Management:** Add, edit, and track shipments with status and estimated delivery.
- **Personnel Management:** Manage delivery personnel, their schedules, and routes.
- **Reports:** Generate summary and detailed reports in PDF format.
- **Notifications:** Email and SMS notification services (see `notification/`).

## Project Structure
```
logistic_automationG3/
├── Database/                  # SQL schema and sample data
├── src/
│   └── main/
│       └── java/
│           ├── dao/          # Data access objects
│           ├── model/        # Data models (Delivery, Shipment, Personnel, etc.)
│           ├── notification/ # Email and SMS services
│           ├── report/       # Report generation
│           ├── ui/           # Swing UI panels
│           └── util/         # Utilities (DB connection, etc.)
├── pom.xml                   # Maven build file
└── README.md                 # This file
```

## Setup & Running
1. **Database:**
   - Import `Database/logisticautomationg3_db.sql` into your MySQL server.
   - Update DB credentials in `src/main/java/util/DBConnection.java` if needed.

2. **Build & Run:**
   - Use Maven: `mvn clean install`
   - Run the main class: `src/main/java/ui/Main.java`

3. **Requirements:**
   - Java 8+
   - Maven
   - MySQL

## Usage
- Launch the application and use the dashboard to manage deliveries, shipments, and personnel.
- Use the Delivery Scheduling panel to add or update delivery slots.
- Use the Driver Assignment panel to assign drivers to shipments.
- Generate reports from the Reports panel.

## Authors
- G3 Team

## License
This project is for educational purposes. 
