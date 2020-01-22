package com.home.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//POJO
class Employee implements Serializable{
	int empID;
	String name;
	int salary;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}


public class SerializationDemo {
	//Important topics of Serialization Concept
/*	Persistance
	Serialization
	ObjectOutputStream 
	ObjectOutputStream
	transient keyword */
// Saving an object in a file or database is important because it is created in the heap area of the RAM and the moment the program is finished
// the data is lost.
// With the help of serialization we are going to save the state also called instance variables value of the object in a file.
// On the other hand with the help of deserialization we can read the state of an object from a file or database.	
// Persistance means save the state of an object in a file or database.
	
	//Also read this concept from Head First Java
	
	public static void main(String[] args) {
		Employee eRef1=new Employee();
		eRef1.setEmpID(1);
		eRef1.setName("John");
		eRef1.setSalary(60000);
		System.out.println(eRef1);
		
		File file=new File("C:/Users/Rajat Pandey/Downloads/MyEmployees.dat");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		FileInputStream fis=null;
		try {
			//fos = new FileOutputStream(file);
			//To perform serialization we use ObjectOutputStream
			// oos=new ObjectOutputStream(fos);
			//oos.writeObject(eRef1);
			fis=new FileInputStream(file);
			//To perform deserialization we use ObjectInputStream
			ois=new ObjectInputStream(fis);
			ois.readObject();
			//System.out.println("Object Written");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {			
			try {
				//fos.close();
				//oos.close();
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
