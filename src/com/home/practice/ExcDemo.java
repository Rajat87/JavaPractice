package com.home.practice;

import java.io.IOException;

class MyBankingException extends Exception{      //Checked Exception
	public MyBankingException(String text){
		super(text);
	}
}

class MyBankingException2 extends RuntimeException{      //Unchecked Exception
	public MyBankingException2(String text){
		super(text);
	}
}
public class ExcDemo {
	
/*	void transaction() throws IOException {
		IOException ioRef=new IOException();   //Checked Exception
		throw ioRef;
	}
	
	void transactionAgain() {
		RuntimeException rRef=new RuntimeException();  //Unchecked Exception
		throw rRef;
	}
*/
	int balance=10000;
	int count=0;
	//throws keyword is required when the function throws a checked exception
	void withdraw(int amt) throws MyBankingException{
		if(balance>4000) {
			balance=balance-amt;
			System.out.println("Amount Withdrawn is: \u20b9"+ amt );
			System.out.println("Balance is: \u20b9"+ balance );
		}else {
			count++;
			System.out.println("Your balance is low!!");
			if(count>2) {
				//System.out.println("Illegal Attempts");
				MyBankingException mRef=new MyBankingException("This is illegal!!");
				throw mRef;
			}
		}
	}
	
	void withdrawAgain(int amt) {
		if(balance>4000) {
			balance=balance-amt;
			System.out.println("Amount Withdrawn is: \u20b9"+ amt );
			System.out.println("Balance is: \u20b9"+ balance );
		}else {
			count++;
			System.out.println("Your balance is low!!");
			if(count>2) {
				//System.out.println("Illegal Attempts");
				MyBankingException2 mbRef=new MyBankingException2("This is illegal!!");
				throw mbRef;
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			try {
			int [] arr= {1,2,3,4};
			System.out.println(arr[30]);
			}catch(Exception ex2){
				System.out.println(ex2);
			}
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}catch(RuntimeException rex){
			System.out.println("Something Happened!!!" + rex);
			//ex.printStackTrace();
		}catch(Exception ex){
			System.out.println("Something Happened!!! " + ex);
			//ex.printStackTrace();
		}
		
		ExcDemo eref=new ExcDemo();
	/*	try{
			eref.transaction();  //Program will not crash
		}catch(Exception e){
			System.out.println(e);
		}
		eref.transactionAgain(); //Program Will Crash -> Used when we need to terminate or abort the app
		*/
		for(int i=0;i<10;i++) {
		try { 
			eref.withdraw(3000);	//This will ensure the process finishes
		} catch (Exception e) {
			System.out.println("Some Exception"+e);
		}
		                      }
		
		for(int i=0;i<10;i++) {            //This will stop the process 
			eref.withdrawAgain(3000);
		}
		
		System.out.println("Program Finished");
		
		//Object
		//Throwable
		//Errors           Exceptions
	}

}
