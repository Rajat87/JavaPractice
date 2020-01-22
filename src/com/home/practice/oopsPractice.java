package com.home.practice;

import java.util.ArrayList;
 class person{
	String name;
	int age;
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
class vet{
	protected vet(){
		
	}
	void makeSound(doctor d) {     // Main Benefit Of Polymorphism
		d.treatPatient();
	}
}

abstract class doctor{
	boolean woksAtHospital;
	void treatPatient() {
		//Perform a Check
	}
}

class familyDoctor extends doctor{
	boolean makesHouseCalls;
	void treatPatient() {
		System.out.println("Family Doctor");
	}
	void giveAdvice() {
		
	}
}

class surgeon extends doctor{
void treatPatient() {
		//Perform a Surgery
	System.out.println("Surgeon");
	}
void makeIncision() {
	
}
}

class randomDoctor extends surgeon{
	void treatPatient(){
		System.out.println("Random Doctor");
	}
}
public class oopsPractice {
	
	ArrayList aRef=new ArrayList();

	public static void main(String[] args) {
		doctor sRef=new surgeon();
		doctor sRef2=new familyDoctor();
		vet vRef=new vet();
		vRef.makeSound(sRef);
		vRef.makeSound(sRef2);
		doctor [] dRef=new doctor[8];//This is possible because we are creating an array of dog references not objects
		//If Surgeon extended familyDoctor then it would have both the instance variables and methods of family doctor as well as of doctor because
		//as per rule of Inheritance if C is B and B is A then C is also A.
		//System.out.println(args[args.length-2]);
		//We can use class Object as a polymorphic type but it comes at a price i.e. 
	}

}
