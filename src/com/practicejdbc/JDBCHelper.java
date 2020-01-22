package com.practicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//This class has been created to follow te DAO pattern which is a design pattern for OOPS.
public class JDBCHelper {
	Connection connection;// inbuilt class(API) imported from java.sql.Connection package
	Statement statement;
	
	JDBCHelper(){
		//All JDBC code goes in try catch because many methods used throw checked exception 
		try {
			//Load the driver after linking it to the project
			Class.forName("com.mysql.cj.jdbc.Driver");/*This static method of class Class automatically loads the driver class in the 
			JDBCHelper class */
			System.out.println(">> Driver Loaded");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	



	void createConnection(){
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost/employee_db_jdbc_practice", "root", "");
			//The URL for jdbc is same for every database except the database name 
			//Localhost is the ip address of my computer and since the wampp server is installed on my local machine 
			//Protocol for url -> "jdbc:mysql://localhost/whatever your database name is"
			System.out.println("Connection Created");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Write and execute SQL Query
	void insertEmployeeUsingSQL(Employee eRef) {
		try {
			//The first column of the table is pid which is a not null auto increment primary key
			//So we can either pass null or "".
			//I am passing null
			//passing a value for the primary key is mandatory for only the first row
			//After that we can pass the value if we want but it is not required
			//Object to be saved in the database 
			//Employee employee1=new Employee(0, "John", 21, "john@example.com", "777 Brockton Avenue, Abington MA 2351");
			Employee employee=eRef;
			System.out.println(employee);
			//Sql Query
			String sql=
			"insert into Employee values(null,"+employee.getEid()+",'"+employee.getName()+"',"+employee.getAge()+",'"+employee.getEmail()+"','"+employee.getAddress()+"');";
			statement=connection.createStatement();
			int i=statement.executeUpdate(sql);//This function will give a number based on the no. of rows inserted if data is inserted and 0 if vice versa
			//for e.g if 1 row is inserted then i=1
			if(i>0) {
						System.out.println(i+" Row(s) Inserted");
			}else {
						System.out.println("Data not Inserted");
			}
			//PreparedStatement can be used also
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void closeConnection() {
		try {
			connection.close();
			System.out.println("Connection Closed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}



}
