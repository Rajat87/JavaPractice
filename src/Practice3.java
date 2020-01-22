import java.util.Scanner;

class constr{
	
	constr(){
		super();
		System.out.println("Constr1 object created");
	}
}

class constr2 extends constr{
	constr2(){
		System.out.println("Constr2 object created");
	}
}

public class Practice3 {

	public static void main(String[] args) {
		
		constr2 cref=new constr2();
		
		//Swapping Using three variables
		int x,y,z;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter x:");
		x=input.nextInt();
		System.out.println("Enter y:");
		y=input.nextInt();
		System.out.println("Before Swapping  "+x +" "+ y);
		z=x;
		x=y;
		y=z;
		System.out.println("After Swapping   "+x+" "+ y);
		
		//Swapping using two variables
		 int a, b;
		 
		       System.out.println("Enter x and y");
		 
		       Scanner in = new Scanner(System.in);
		       a = in.nextInt();
		       b = in.nextInt(); 
		       System.out.println("Before Swapping\nx = "+a+"\ny = "+b); 
		       a = a + b; 
		       b = a - b;
		       a = a - b;
		       System.out.println("After Swapping without third variable\nx = "+a+"\ny = "+b);
		       
		       //Strings
		       StringBuilder  w=new StringBuilder("Hello");
		       //System.out.println("Enter the number or string:");
		       w.append("Java");
		       System.out.println(w.toString());
		       String s1=new String();
		       System.out.println(s1);
		       
		       
		       
		       
		       
	
	}

}
