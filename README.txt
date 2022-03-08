Here's an API REST that contains some users and departments, where you can:
- Find all users registered on the database;
- Find a single user by its id;
- Insert a new user (using POST request).

# How to see what happens:

- Open the project directory on an appropriate IDE (personal sugestion: VS Code, STS 4, IntelliJ)
- Run any .java

	* Checking the database:
	Use the link "http://localhost:8080/h2-console", type into the JDBC URL box "jdbc:h2:mem:testdb" and press connect.

	* Checking the functionalities
	- On a browser (e.g Chrome, Mozilla, Opera), try to access the URLs below:
		localhost:8080 				(should give you an error from Spring)
		localhost:8080/users 			(to see all users)
		localhost:8080/users/{number_ID}	(if 'number' is a legit ID on the database, it will return the corresponding user) 
							(Legit numbers from the get-go are 1-4)

# To insert a new user, try using Postman/Insomnia to do a request POST with the following, changing the entities:
{"id":some_number,"name":"your_name","email":"your_email@example.com","department":{"id":1,"name":"TI"}}
