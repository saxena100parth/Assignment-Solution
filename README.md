# Assignment-Solution
## Spring Boot Security with JWT Implementation using H2 database
<br><br>
## APIs End Points:
* ### /api/v1/auth/register
POST Api which is use to register usesr. It will create user in the database <br>
use below JSON body for testing <br>
this will return  JWT token
<br>
{<br>
    "firstname": "parth", <br>
    "lastname" : "saxena", <br>
    "email" : "saxena100parth@gmail.com", <br>
    "password" : "1234"  <br>
}  <br>
<br>
  
* ### /api/v1/auth/authenticate
POST Api which is use to authenticate user if the user is already created in the database it reture JWT token as response. <br>
use below JSON body for testing <br>
<br>
{<br>
    "email" : "saxena100parth@gmail.com", <br>
    "password" : "1234"  <br>
}  <br>
<br>

* ### /api/v1/demo-controller

GET Api, This is a secure end-point:- It can access only with the JWT token.<br>
pass Bearer tocken with Api call which we received from the above APIs endpoint.<br>


## Features
* User registration and login with JWT authentication
* Storing user data in H2 Database
* Password encryption using BCrypt
* Role-based authorization with Spring Security


## Technologies
* Spring Boot 3.0
* Spring Security
* H2 database
* JSON Web Tokens (JWT)
* BCrypt
* Maven
 
## Getting Started
To get started with this project, you will need to have the following installed on your local machine:

* JDK 17+
* Maven 3+


To build and run the project, follow these steps:
<br>
 Clone the repository -> Navigate to the project directory -> Add database -> Build the project -> Run the project

-> The application will be available at http://localhost:8080.

