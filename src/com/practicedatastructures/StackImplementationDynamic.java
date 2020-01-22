package com.practicedatastructures;

import java.util.ArrayList;
import java.util.Stack;

class StackDemo2{
	//Dynamic Array
	 ArrayList<Integer> stack=new ArrayList<Integer>();
	 int top=0;
	//int stack[]=new int[5];
	public void push(int x) {
			//stack[top]=x;
			stack.add(top,x);
			top++; //0+1,1+1,2+1,3+1,4+1
	}
	
	void show() {
		if(stack.size()>0)
		for(int a : stack) {  //this basically means or(int a=0; a<stack.size; a++)
			System.out.print(a+" ");
		}else {
			System.out.println("The Stack has no elements to display!!! Try adding a few");
		}
	}

	public int pop() {
		top--;  //5-1=4 i.e the topmost element of the stack
		if(top>=0){
			int data=stack.get(top);
			stack.remove(top);
			return data;
		}else {
			System.out.println("Stack is Empty");
			return 0;
		}
			
	}
	
	void clearStack() {
		stack.clear();
		System.out.println(stack);
	}
	//Peek method is used to display the topmost element of the stack
	public int peek() {
		if(top>=0) {
			int data=stack.get(top-1);
			return data;
		}else {
			System.out.println("Stack is Empty");
			return 0;
		}
		
	}  
	
	public int size() {
		if(stack.isEmpty()) {
			System.out.println("Stack Is Empty");
			return 0;
		}else {
			return stack.size();
		}
		
	}
	
	public boolean isEmpty(){
		return top<=0; //return true if
		//top is 0 or -ve whe no element has been added
	}
		
}
public class StackImplementationDynamic {

	public static void main(String[] args) {
		StackDemo2 demo2=new StackDemo2();
		demo2.push(56);
		System.out.println(demo2.isEmpty());
		
		
		
	

	}

}
