package com.home.practice;

import java.util.Scanner;

class Counter{
	int count;
}

class CounterTask1{
	Counter cRef;
	CounterTask1(Counter cRef){
		this.cRef=cRef;
	}
	
	void increment1() {
		cRef.count++;
		System.out.println(cRef.count);
	}
}

class CounterTask2{
	Counter cRef;
	CounterTask2(Counter cRef){
		this.cRef=cRef;
	}
	
	void increment2() {
		cRef.count++;
		System.out.println(cRef.count);
	}
}

public class importantPrograms {
	void swap(int a,int b) {
		int x=a; //10
		int y=b; //15
		System.out.println("Before Swapping");
		System.out.println(x);
		System.out.println(y);
		//Logic
		x=x+y;//16
		y=x-y;//16-6=10 Swapped
		x=x-y;//6 Swapped
		System.out.println("After Swapping");
		System.out.println(x);
		System.out.println(y);
		
		//Shortest Approach
		//y=y+x-(x=y);
	}
	
	void perfectNumber(int n) {
		int a=n;
		int sum=0;
		for(int i=1;i<=n/2;i++){
		    if(n%i==0){
		        sum=sum+i;
		    }
		}
		if(sum==n){
		    System.out.print("Perfect No.");
		}else{
		    System.out.print("Not Perfect");
		}
	}

	public static void main(String[] args) {
		//Swapping
		//Fibonacci Series
		//Factorial
		//Recursion Approach
		//Stack Program for push and pop
		//Queue Program for enqueue and dequeue
		//Armstrong Number
		//Palindrome
		//Sorting
		//Perfect No.
		
		//Swapping Operation
	/*	int a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		a=input.nextInt();
		b=input.nextInt();
		importantPrograms iRef=new importantPrograms();
		iRef.swap(a, b);
		input.close();   */
		
		//Fibonacci Series Operation
		//Without Recursion i.e Using Loops for iteration
		int n1, //Used to store 0
		n2,//Used to store 1
		sum,//Used to store the sum
		count=10,//The no. of elements you want to display in the series it can also be taken as input using scanner
		i;//Variable to initialize loop
		n1=0;
		n2=1;
		System.out.print(n1+" "+n2);
		for(i=2;i<count;i++) {     //Started from 2 because two numbers n1 and n2 are already printed and we want to print only 10 numbers
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
		}
		
		System.out.println();
		
		//Factorial Operation
		int factNum=7;
		int num=1;
		for(int j=1;j<=factNum;j++) {
			num=num*j;
			//System.out.println(num);
		}
		System.out.println(num);
		
		String sRef="Malyalam";
		String reverse="";
		int length=sRef.length();
		char [] container=new char[length];
		container=sRef.toCharArray();
		for(int z=0;z<sRef.length();z++) {
			
		}
		
		Counter counter=new Counter();
		CounterTask1 task1=new CounterTask1(counter);
		CounterTask2 task2=new CounterTask2(counter);
		task1.increment1();
		task2.increment2();
	}

}
