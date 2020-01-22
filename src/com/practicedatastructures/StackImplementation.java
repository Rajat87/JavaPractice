package com.practicedatastructures;
class StackDemo{
	//Static Array
	int stack[]=new int[5];
	int top=0;
	public void push(int x) {
		if(top<stack.length){
			stack[top]=x;
			top++; //0+1,1+1,2+1,3+1,4+1
		}else {
			System.out.println("Stack is full");
		}
		
	}
	
	void show() {
		for(int a : stack) {
			System.out.print(a+" ");
		}
	}

	public int pop() {
		top--;  //5-1=4 i.e the topmost element of the stack
		if(top>=0){
			int data=stack[top];
			stack[top]=0;
			return data;
		}else {
			System.out.println("Stack is Empty");
			return 0;
		}
		
		
	}
	//Peek method is used to display the topmost element of the stack
	public int peek() {
		if(top>=0) {
			int data=stack[top-1];
			return data;
		}else {
			System.out.println("Stack is Empty");
			return 0;
		}
		
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty(){
		return top<=0; //return true if
	}
		
}
public class StackImplementation {
		
	public static void main(String[] args) {
		StackDemo demo=new StackDemo();
		demo.push(24);
		demo.push(65);
		demo.push(16);
		demo.push(45);
		demo.push(32);
		//demo.push(76);
		System.out.println("Before Popping");
		demo.show();
		System.out.println();
		System.out.println("Popped Value:"+demo.pop());//4
		System.out.println("Popped Value:"+demo.pop());//3
		System.out.println("Popped Value:"+demo.pop());//2
		System.out.println("Popped Value:"+demo.pop());//1
		System.out.println("Popped Value:"+demo.pop());//0
		
		System.out.println("Popped Value:"+demo.pop());
		System.out.println("After Popping");
		demo.show();
		System.out.println();
		System.out.println("Peek Executed");
		System.out.println(demo.peek());
	}

}
