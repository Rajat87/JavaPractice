package com.home.randompractice;
//class Parent{
//	void fun() {
//		System.out.println("fun");
//	}
//}

interface Parent{
	 void fun();  //public abstract void fun();
		
	
}
//This is Extra overhead if we have to use the object only once so we can use anonymous class to decrease the overhead
//class Child extends Parent{
//	@Override
//	void fun(){
//		System.out.println("Fun of child!!!");
//	}
//}
public class AnonymousClassesDemo {
	public static void main(String [] args) {
//		Child child=new Child();
//		child.fun();
//		Parent parent=new Parent() {  //Anonymous Class
//			public void fun() {
//				System.out.println("This is fun of Anonymous classes!!!");
//			}
//		};
//		parent.fun();
		
		
//		Parent parent=new Parent() {
//			
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		
		
		
		
		//The above code can also be written as this using Lambda Expression
		Parent parent=() -> {  //Functional Interface
			
				System.out.println("This is fun of Anonymous classes!!!");
			
		};
		parent.fun();
		
		//Anonymous classes for Threads when Parent Class is Thread
		Thread thread1=new Thread() {
			public void run() {
				System.out.println("Inside Thread 1!!!");
			}
		};
		
		Thread thread2=new Thread() {
			public void run() {
				System.out.println("Inside Thread 2!!!");
			}
		};
		
		//Anonymous Thread Classes for Runnable Interface
		Thread thread3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable anonymous thread3!!!");
			}
		});
		
		Thread thread4=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable anonymous thread4!!!");
				
			}
		});
		
	}
	
}
