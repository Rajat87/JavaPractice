package com.home.randompractice;

import java.math.BigInteger;
import java.util.Scanner;

interface infDemo{
	int a=10;
}

class trydemo implements infDemo{
	
}
public class RandomPracticeCode {

	public static void main(String[] args) {
	/*	Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        int reqLength=15;
        int zeros;
        int column=1;
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            System.out.print(s1);
            if(s1.length()<=10) {
            	reqLength=reqLength-s1.length();
            	while(reqLength==0) {
            		System.out.print("");
            		reqLength--;
            	}
            }else {
            	System.out.println("Wrong Input");
            }
            
            int x=sc.nextInt();
            Integer integer=new Integer(x);
            String digits=integer.toString();
            if(digits.length()!=3) {
            	zeros=3-digits.length();
            	while(zeros!=0) {
            		System.out.print("0");
            		zeros--;
            	}
            }
        }
        System.out.println("================================");  */
		
		//Formatting in Java
		int y=12;
		String s="java";
		String c="hello";
		System.out.println((s.length()+c.length()));
		//compareTo() method is used to compare two strings alphabetically i.e which comes first in dictionary
		if(s.compareTo(c)<0) {
			
		}
	/*	StringBuffer buffer=new StringBuffer(s);
        Character v= buffer.charAt(0);
        String k=v.toString();
        k=k.toUpperCase();
        v=k
        buffer.setCharAt(0, k);*/
		String substr=s.substring(0, 1); // 1- 0 = 0 thus it return the char at 0th index
		System.out.println(substr.toUpperCase()+s.substring(1));
		System.out.println((s.substring(0,1).toUpperCase())+s.substring(1)+" "+(c.substring(0,1).toUpperCase())+c.substring(1));
        
		//s= String.format("%s---------%0d", s,x); 
		//System.out.println(s);
		
		//Two different Syntaxes to write the same thing
		System.out.format("%-15s%03d", s,y); //-(minus is used for left Justification) i.e Specifying a width
		System.out.println();
		System.out.printf("%15s%03d", s,y);// For Right Justification i.e Specifying a width
		
		System.out.println();
		/*Scanner scanner=new Scanner(System.in);
		int N = scanner.nextInt();
		 for(int i=1;i<=10;i++){
			    int mul=N*i;
	            System.out.println(N+"*"+i+"="+mul);
	                        
	        } */
		 //Explore Big Integer
		 
		 RandomPracticeCode code=new RandomPracticeCode();
		 int z=code.divisor_sum(6);
		 System.out.println(code.divisor_sum(6));
		 
		 
		
		 

	}
	int x=0;
	 int divisor_sum(int n){
	        for(int i=1;i<=n;i++){
	            if(n%i==0){
	                 x=x+i;
	            }
	            
	            
	        }
	        return x;
	    }
	 
	 //Abstract methods are public by default

}
