# Cinema Shop app
A simple RESTful cinema web application with the ability to select a movie, add to cart and buy tickets.<br/>
Developed using popular frameworks such as Hibernate and Spring.

## Description
#### Application functionality:
Cinema app uses database to store information about users, tickets and movie sessions. It also has basic authentication and authorization features with two roles - admin and user.
Every user has a shopping cart and orders.
Movie session contains information about movie, cinema hall and showtime.
Every ticket contains information about a movie session and user.

User has an email and password. You can register new user(all roles) and find one by email(admin only).
Movie has a title and description. You can add a movie into database(admin only) or get a list of movies from DB.
Cinema hall has a capacity and description. Operations with cinema halls are similar to operations with movies.
Movie sessions can be added, updated, deleted by admin. User can get a list of available movie sessions for desired date and movie.
Shopping cart contains information about tickets user is willing to buy. User can add a ticket to shopping cart or get information about his shopping cart contents.
Orders contain information about purchased tickets with order date and user to whom they belong. User can complete his order or get his orders list. Completing order will clean users shopping cart.

#### Architecture:
* Controller - Presentation layer
* Service - Application logic layer
* DAO - Data access layer <br/>

#### Endpoints:
* POST: /register - all <br/>
* GET: /cinema-halls - user/admin <br/>
* GET: /movies - user/admin <br/>
* GET: /movie-sessions/available - user/admin <br/>
* POST: /cinema-halls - admin <br/>
* POST: /movies - admin <br/>
* POST: /movie-sessions - admin <br/>
* PUT: /movie-sessions/{id} - admin <br/>
* GET: /users/by-email - admin <br/>
* DELETE: /movie-sessions/{id} - admin <br/>
* GET: /orders - user <br/>
* POST: /orders/complete - user <br/>
* PUT: /shopping-carts/movie-sessions - user <br/>
* GET: /shopping-carts/by-user - user <br/>

## Technologies
* Java 11
* Hibernate
* Spring (Core, MVC, Security)
* MySql
* Apache Tomcat
* Apache Maven

## How to Run this Project
1. Install MySQL and Apache Tomcat. <br/>
2. Create empty database. <br/>
3. Clone this project. <br/>
4. Edit database connection information(URL, username, password) in db.properties in resources folder. <br/>
5. Run project using previously configured Tomcat running configuration and login as admin(admin@gmail.com, admin123) or user(user@gmail.com, user123). <br/>

## Project Author
#### Daniel Etezadi | [LinkedIn](https://www.linkedin.com/in/daniel-etezadi)
