package com.home.randompractice;

class A{
	//static block is the first thing that runs when a class is loaded so it can just be used like a constructor for giving 
	//a default value to instance variables.
	//Although it is mostly used to initialize a static final variable which basically means a constant.
	static {
		System.out.println("Class Loaded");
	}
}
public class StaticPractice {

	public static void main(String[] args) {
		A a=new A();

	}

}

//Declaring a method static states that it does not need to use any instance variables e.g. The methods in the Math class do not -
//- use any instance variables so they are marked static.
//Static methods can’t use non-static(instance) variables!
//Static methods can’t use non-static methods, either!
//The value of a static variable is same for all the objects of a class and is shared among all the objects.
//All static variables in a class are initialized before any object of that class can be created.
//Static variables in a class are initialized before any static method of the class runs.
//A final variable means you can’t change its value.
//A final method means you can’t override the method.
//A final class means you can’t extend the class (i.e.you can’t make a subclass).