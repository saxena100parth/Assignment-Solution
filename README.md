# Assignment-Solution
## Spring Boot Security with JWT Implementation using H2 database

<br>

## APIs End Points:

### * http://localhost:8080/api/auth/signup
(POST API) It will create new user in the database <br>
use below JSON body for testing <br>
<br>
```json
{
"firstname": "user",
"lastname" : "one",
"email" : "example@gmail.com",
"password" : "1234"
}
``` 
<br>

### * http://localhost:8080/api/auth/login
(POST API) It will return JWT token if the user is created in the database using signup API <br>
use below JSON body for testing <br>
<br>

```json
{
  "email" : "example@gmail.com",
  "password" : "1234"
}

```

<br>
I have created one extra end-point which work as a protected resources end-point. (It is just for demo)
<br>

### * http://localhost:8080/api/protected-resources
(GET API) This is a secure end-point:- It can access only with the JWT token.<br>
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
 
## Installation and Setup
To get started with this project, you will need to have the following installed on your local machine:

* JDK 17+
* Maven 3+



```bash

# Clone the repository
git clone https://github.com/saxena100parth/Assignment-Solution.git

```


* The application will start running on http://localhost:8080.







