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
	- On a browser (e.g Chrome, Mozilla, Opera), trye to access the URLs below:
		localhost:8080 				(should give you an error from Spring)
		localhost:8080/users 			(to see all users)
		localhost:8080/users/{number_ID}	(if 'number' is a legit ID on the database, it will return the corresponding user 
							(Legit numbers are 1-4)

# To insert a new user, try using Postman/Imsomnia to do a request POST with the following, changing the entities:
{
"name":"your_name",
"email":"your_email@example.com",
"department":{
	"id":1,
	"name":"TI"
	}
}


###
##### ISSUES
### 

TO FIX: 
-> Lots of weird interactions when registering a department with the POST request. Also, it can't create a new user while defining a new department in the message body (SHOULD IT, THOUGH?) 
? Check if department is correctly informed and register it before registering the user as a whole

-> It is possible to have 2 (or more) users claiming the same e-mail, which should be unique
? Check if there's such email in the database and ignore the request if the email is already registered there

FIXED: 
-> It was possible to register users with name and/or email with null values
=> It will not register new users with null values for name or email anymore; also, it returns HTTP status 400 when it happens so.

-> HTTP Status code returns as 200, it should be 201
=> Fixed in the proper method by changing its type and return type