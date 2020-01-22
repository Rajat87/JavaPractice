package com.home.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class collectionsPractice {
	
	void takeNumber(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		int a=10;
		Integer iRef=new Integer(a);
		ArrayList aRef=new ArrayList();
		aRef.add(new Integer(10));
		collectionsPractice cRef=new collectionsPractice();
		cRef.takeNumber((int)aRef.get(0));
		String str=Integer.toString(a);
		System.out.println(str);
		// Different ways to get the elements of an ArrayList
		   /*   # For Loop
			    # Enhanced For Loop
			    # Iterator
			    # List Iterator
			    # Enumeration
			    */
				
	//The main drawback of ArrayList is that redundant data can be added to it as well as it is not thread safe or synchronized i.e in a sequence.
		
		//ArrayList <person> pRef=new ArrayList();
		
	/*	HashSet <String> hSet=new HashSet();
		hSet.add("Geeks");
		hSet.add("For");
		hSet.add("Geeks");
		hSet.add("Example");
		hSet.add("Set");
	
		System.out.println(hSet);
		System.out.println();
		
		Scanner scanner=new Scanner(System.in);
		//double d=scanner.nextDouble();
		String s=scanner.nextLine();
		StringBuffer buffer=new StringBuffer();
		buffer.append(s);
		System.out.println(buffer.toString());  */
		
		
		//Code for sorting
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> integers = new ArrayList<Integer>();
		System.out.println("No. of inputs:");
		int iRef2=scanner.nextInt();
		System.out.println("Enter the numbers");
		
		for(int y=0;y<iRef2;y++) {
			int updated=scanner.nextInt();
			integers.add(updated);
		}
		
	/*	integers.add(9);
		integers.add(10);
		integers.add(5);
		integers.add(4);
		integers.add(12);  */
		Collections.sort(integers);
		System.out.println(integers);
		
		
		
		
		 
	}

}
