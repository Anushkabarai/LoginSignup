This project is a simple login and signup page implemented using HTML, CSS, JavaScript, MySQL, and JSP (JavaServer Pages) for backend connectivity. It allows users to create an account, log in, and access authenticated content.

#Prerequisites
 MySQL server installed and running.
 Java Development Kit (JDK) installed.
 Apache Tomcat server installed.
 
#Setup Instructions
1.Database Setup:
 Create a MySQL database named userdb.
 Execute the userdb.sql script provided in the database folder to create the necessary tables and sample data.

2.Server Configuration:
 Deploy the project's WAR file (login-signup.war) to your Apache Tomcat server.
 Start the Tomcat server.
3.Configuration:
 Open the db.properties file located in the src directory.
 Update the database connection details (URL, username, password) according to your MySQL server configuration.
4.Accessing the Application:
 Once the Tomcat server is running, access the application at http://localhost:8080/login-signup.

#Project Structure
css

login-signup/
│
├── database/
│   ├── userdb.sql
│   └── README.md
│
├── src/
│   ├── META-INF/
│   ├── WEB-INF/
│   └── db.properties
│
├── web/
│   ├── css/
│   ├── js/
│   ├── images/
│   ├── signup.html
│   ├── login.html
│   └── README.md
│
├── login-signup.war
└── README.md
#database/: Contains the SQL script to create the necessary database and tables.
#src/: Contains Java source files, including the database configuration properties file (db.properties).
#web/: Contains HTML, CSS, JavaScript, and image files for the frontend.
#login-signup.war: WAR file for deployment.
#README.md: Project overview and setup instructions.

#Technologies Used
1.Frontend:

HTML: Structure and content.
CSS: Styling and layout.
JavaScript: Client-side validation and dynamic behavior.

2.Backend:
JavaServer Pages (JSP): Server-side scripting for dynamic content generation.
MySQL: Database management system for storing user information.

#Features
User Signup: Allows users to create a new account with a unique username and password.
User Login: Existing users can log in securely using their credentials.
Session Management: Uses sessions to maintain user authentication throughout the browsing session.
