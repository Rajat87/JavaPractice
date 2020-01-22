import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//class SampleThread extends Thread{
//	public void run() {
//		System.out.println("Rajat's Thread");
//	}
//}
//OR
 class MyThread implements Runnable{
	public void run() {
		System.out.println("Rajat's Thread");
	}
}
 
 class MyTask extends Thread{
	synchronized public void run() {
		 for(int i=1;i<=10;i++) {
			 System.out.println(" ^^ Printing Document from Printer2 #"+ i);
		 }	
		}

 }

class WildDog{
	 int size;
	 String name;
	 WildDog(){
		
	}
	
	static void bark() {
		System.out.println("Ruff Ruff");
	}
	void Roam() {
		System.out.println("Looking For Food");
	}
	void Eat() {
		System.out.println("Feast");
	}
}
   
class SampleException{
	
}


public class Practice2 {

	public static void main(String[] args) {
//		try {
//			throw new Exception();
//		}catch(Exception e){
//			
//		}
//		
//		int x;
//		Scanner input=new Scanner(System.in);
//		System.out.println("Enter Your Choice of Number:");
//		x=input.nextInt();
//		MyThread mt1=new MyThread();
//		Thread thread1=new Thread(mt1);
//		thread1.start();
		//Job1
		//System.out.println("Application Started");
		//Job2
	//	MyTask mRef=new MyTask();
//		try {
//			mRef.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//mRef.start();
		//Job3
//		for(int i=1;i<=10;i++) {
//			 System.out.println(" @@ Printing Document from Printer1 #"+ i);
//		}
		//Job4
//			 System.out.println("Application Finished"); 
//		     JFrame frame=new JFrame();
//		     JButton button=new JButton("Click ME");
//		     frame.getContentPane().add(BorderLayout.NORTH, button);
//		     frame.setSize(500,500);
//		     frame.setVisible(true);
		     //Practice2 obj=new Practice2();
		    // obj.go();
		     
		     int x=10;
		     System.out.println(x++);//10 (11)  
		     System.out.println(++x);//12  
		     System.out.println(x--);//12 (11)  
		     System.out.println(--x);//10
		     
		     char c='d';
		     char [] arr1=new char[7];
		     arr1[0]=c;
		     
		     //Strings are immutable except builder and buffer
		     String s1="John";
		     s1.toUpperCase();//Won't change as it is immutable
		     System.out.println(s1);
		     String s2=s1.toUpperCase();//A new string will need to be created
		     System.out.println(s2);
	}
	
	public void go() {
		JFrame frame=new JFrame();
		JButton button1=new JButton("EAST");
		JButton button2=new JButton("WEST");
		JButton button3=new JButton("NORTH");
		JButton button4=new JButton("SOUTH");
		JButton button5=new JButton("CENTER");
		JPanel panel=new JPanel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		//frame.getContentPane().add(BorderLayout.EAST,button1);
		frame.getContentPane().add(BorderLayout.WEST,button2);
		frame.getContentPane().add(BorderLayout.NORTH,button3);
		frame.getContentPane().add(BorderLayout.SOUTH,button4);
		frame.getContentPane().add(BorderLayout.CENTER,button5);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	
		
	}
	


}

