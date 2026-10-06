🏦 Bank Management System

A desktop-based Bank Management System developed using Core Java, Java Swing, JDBC, and MySQL. This project provides a graphical interface for performing basic banking operations while storing customer and transaction data in a MySQL database.

📌 About the Project

The Bank Management System is a Java-based banking simulation designed to demonstrate how a desktop application can interact with a relational database.

Users can register their account, log in securely, and perform different banking operations such as depositing and withdrawing money, checking their balance, changing their PIN, and viewing transaction history.

The application uses JDBC to connect the Java application with MySQL and perform database operations dynamically.

✨ Key Features

Feature| Description
🔐 Login| Authenticates users using account credentials
📝 Account Registration| Allows new customers to create an account
💰 Deposit| Deposits money into the user's account
💸 Withdrawal| Withdraws money from the account
⚡ Fast Cash| Provides predefined quick withdrawal options
💳 Balance Enquiry| Displays the current account balance
🔑 PIN Change| Allows users to change their banking PIN
📄 Mini Statement| Displays recent account transactions
🚪 Logout| Safely exits the user's session

🛠️ Technologies Used

- Java – Application development
- Java Swing – Graphical User Interface
- JDBC – Database connectivity
- MySQL – Data storage and management
- SQL – Database queries and operations
- Git & GitHub – Version control and project management
- Visual Studio Code – Development environment


🔄 Application Flow

             ┌──────────────┐
             │    Login     │
             └──────┬───────┘
                    │
          ┌─────────┴─────────┐
          │                   │
     New User             Existing User
          │                   │
          ▼                   ▼
     Registration          Login
          │                   │
          └─────────┬─────────┘
                    ▼
          ┌───────────────────┐
          │ Transaction Menu  │
          └─────────┬─────────┘
                    │
       ┌────────────┼────────────┐
       ▼            ▼            ▼
    Deposit     Withdrawal   Fast Cash
       │            │            │
       └────────────┼────────────┘
                    │
          ┌─────────┴─────────┐
          ▼                   ▼
   Balance Enquiry       Mini Statement
          │                   │
          └─────────┬─────────┘
                    ▼
                PIN Change
                    │
                    ▼
                  Logout

🗄️ Database

The application uses MySQL as its relational database.

The database stores information related to:

- Customer details
- Account information
- Login credentials
- PIN
- Account balance
- Deposits
- Withdrawals
- Transaction history

JDBC is used to establish a connection between the Java application and MySQL database.

📂 Project Structure

Bank-Management-System/
│
├── src/
│   └── ASimulatorSystem/
│       ├── Login.java
│       ├── Signup.java
│       ├── Signup2.java
│       ├── Signup3.java
│       ├── Transactions.java
│       ├── Deposit.java
│       ├── Withdrawal.java
│       ├── FastCash.java
│       ├── BalanceEnquiry.java
│       ├── MiniStatement.java
│       └── Pin.java
│
├── icons/
│   └── Application images
│
├── database/
│   └── bank.sql
│
└── README.md

🖥️ Screenshots

🔐 Login Screen

 https://github.com/aparnatiwari166/Java_Project/blob/main/Screenshots/Login.png
 
💳 Transaction Screen

https://github.com/aparnatiwari166/Java_Project/blob/main/Screenshots/Transactions.png

💰 Deposit / Withdrawal

https://github.com/aparnatiwari166/Java_Project/blob/main/Screenshots/FastCash.png

📄 Mini Statement

https://github.com/aparnatiwari166/Java_Project/blob/main/Screenshots/MiniStatement.png


This project helped me gain practical experience with:

- Core Java and Object-Oriented Programming
- Java Swing GUI development
- Event handling
- JDBC connectivity
- MySQL database management
- SQL queries
- CRUD operations
- Exception handling
- Database-driven application development
- Git and GitHub


Possible improvements for future versions:

- 🔒 Secure PIN/password encryption
- 👨‍💼 Admin dashboard
- 📊 Advanced transaction reports
- 🧾 Transaction receipt generation
- 📧 Email/SMS transaction notifications
- 🎨 Improved user interface
- 🌐 Online banking functionality
👩‍💻 Author

Aparna Tiwari

Java Developer | Fresher
