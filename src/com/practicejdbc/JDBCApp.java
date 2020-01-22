package com.practicejdbc;

public class JDBCApp {

	public static void main(String[] args) {	
		//Database Operation using a local WAMP Server installed on my system thus my computer acts as a local server and is called
		// localhost
		//First we have to link the mysql connector driver to the project in which we want to implement jdbc
		//It is a jar file.
		//Use the build path option by right clicking on the project
		//It imports all the libraries required in jdbc.
		//Libraries is a collection of related packages.
		
		//Rather then performing all the database operations in the main class we should create a database helper class which performs
		// all the database operations. This approach is called DAO approach
		
		//The steps required for jdbc are:
		/*
	 	JDBC Procedure:
	 	1. Link Jar File with your Project (Rt Click > Build Path > Configure > Libraries > Add External Jar)
	 		Download the jar file
	 	2. Load the Driver
	 	3. Create Connection
	 	4. Write SQL Statement to insert data
	 	5. Execute SQL Statement
	 	6. Close the Connection
	 */
		Employee employee=new Employee(1, "Jennie", 22, "jennie@example.com", "30 Memorial Drive, Avon MA 2322");
		JDBCHelper helper=new JDBCHelper();
		helper.createConnection();
		helper.insertEmployeeUsingSQL(employee);
		helper.closeConnection();

	}

}
