package com.home.practice;
class stringTester{
	StringBuffer buffer;
	stringTester(){
		this.buffer=new StringBuffer();
	}
	
	void appendDemo() {
		
	}
}


class myThread implements Runnable{
	StringBuffer buffer;
	myThread(StringBuffer buffer){
		this.buffer=buffer;
	}
	@Override
	synchronized public void run() {
		buffer.append(" MyThread");
		System.out.println(buffer);
	}
	
	
	
}

class yourThread implements Runnable{
	StringBuffer buffer;
	yourThread(StringBuffer buffer){
		this.buffer=buffer;
	}
	@Override
	synchronized  public void run() {
			buffer.append(" YourThread");
			System.out.println(buffer);
		}
	
}
public class SyncDemo {
	
	
	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("Hello");
		Thread mRef=new Thread(new myThread(buffer));
		Thread yRef=new Thread(new yourThread(buffer));
		mRef.start();
		yRef.start();
		
		
		//System.out.println(StringTester.builder);
//Answer Should Be 	"Accessed By Thread 1 By Thread 1 again By Thread 2 By Thread 2 again.
		
	
		
		
		
		


}
}