package com.home.practice;

class Task {
	void performTask() {
		for(int i=1;i<=10;i++) {
			System.out.println("***Task***"+ i);
		}
	}
}

class MyTask extends Thread {
/*	void performTask() {
		for(int i=1;i<10;i++) {
			System.out.println("***Task***"+ i);
		}
	}*/
	//We need to override a method
	public void run(){
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000); //This is surrounded by try/catch because the sleep method in the thread class throws a checked exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("***MyTask***"+ i);
		} 
	}
}

class YourTask implements Runnable {
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000); //This is surrounded by try/catch because the sleep method in the thread class throws a checked exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("***YourTask***"+ i);
		}
	}
}

public class MultiThreading {
     // Main Thread
	public static void main(String[] args) {
		System.out.println("Main Started");       //J1
		
		/*Task tRef=new Task();
		tRef.performTask();  */       //J2  
		
		MyTask mRef=new MyTask();
		
		Runnable yRef=new YourTask();
		Thread tRef=new Thread(yRef);
		
		mRef.start();// The start method internally calls the run method
		tRef.start();
		//Thread tRef2=new Thread(new YourTask());    //Another way  # new YourTask() gives a reference 
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000); //This is surrounded by try/catch because the sleep method in the thread class throws a checked exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//When i call the sleep method the underlying code will be blocked i.e it is used to temporarily suspend the thread
			System.out.println("---Main Thread---"+ i);         //J3
		}
		
		//Thread.State.NEW
		
		//In built functions of Thread class to get names
		System.out.println("MyTask name is:"+ mRef.getName());
		System.out.println("YourTask name is:"+ tRef.getName());
		System.out.println("Main name is:"+ Thread.currentThread().getName());
		
		//In built functions of Thread class to change names
		mRef.setName("MyThread");
		
		//J2 and J3 are both time consuming Jobs i.e blocking jobs
		//In case your application's main thread is blocked the OS will figure it out and show the user that the application is not responding
		//The aim is to execute both jobs parallely
		//This can be done by using a child thread or worker thread
		//We will put the blocking job in the worker thread and create a small job in the main thread to call the worker thread
		//JVM does TimeSlicing i.e Sometimes the time is given to the main thread and sometimes to the user thread although it seems that both are executed parallely
		
		System.out.println("Main Finished");       //J4
	}

}
