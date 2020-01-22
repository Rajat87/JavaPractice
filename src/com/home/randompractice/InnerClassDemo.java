package com.home.randompractice;

public class InnerClassDemo {

	class InnerDemo{
	
	}
	public static void main(String[] args) {
		//InnerClassDemo.InnerDemo inner=new InnerClassDemo().new InnerDemo();
		InnerClassDemo outer=new InnerClassDemo();
		InnerDemo innerDemo=outer.new InnerDemo();
		
		outer.primeChecker(2);
		

	}

	void primeChecker(int num){
		
	}
}
