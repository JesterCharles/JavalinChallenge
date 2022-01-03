# JavalinChallenge

-   This is to test your skills with javalin

# What you need to setup!

-   I've provided for you the EVERYTHING but the javalin implementation.
-   Have ONE individual (driver) run the javalinChallenge.sql script in DBeaver.
    -   Once this is done! REMIND the individual to change the password to their postgresqlDB and check for a connection.\
-   After this everything should be fair game!

# What you need to do!

-   **_THERE ARE ONLY TWO FILES YOU NEED TO EDIT_**
    -   **MainDriver.java**
    -   **ChallengeEmployeeController.java**
-   **_PLEASE START WITH THE GETALL REQUEST_**
    -   if you run into issues please summon me!!!
-   I want to you to create these endpoints for me
    -   localhost:3000/employees
        -   GET request that returns all employees (returns status code 200)
        -   POST request that creates an employees (returns status code 201)
    -   localhost:3000/employees/e_id
        -   GET request that returns on individuals ID (returns a status code 200)
        -   PUT request that updates the current employee information provided (returns status code 200)
        -   DELETE request that removes the employee information (returns status code 202)
-   Be mindful I've taught the GET and POST requests. PLEASE PLEASE PLEASE be mindful of how the JSON objects are being passed in the body to and from the server.

# EXTRA:

-   Incorporate exception/error handling!
-   try various query/parameter methods
