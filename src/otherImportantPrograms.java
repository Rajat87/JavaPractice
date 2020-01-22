import java.util.Scanner;

class cat{
	cat(){
		System.out.println("CAT Object Created");
	}
}

class electricGuitar{
	private String name;
	int numOfPickups;
	boolean rockstarUsesIt;	
	String getName() {
	     return name;	
	}
	
	void setName(String aName) {
		name=aName;
	}

	@Override
	public String toString() {
		return "electricGuitar [name=" + name + ", numOfPickups=" + numOfPickups + ", rockstarUsesIt=" + rockstarUsesIt
				+ "]";
	}	
	void yahoo() {
		int x;
		//System.out.println(x);
		System.out.println(numOfPickups);
	}	
}

class doctor{
	
}


public class otherImportantPrograms {

	public static void main(String[] args) {
		//Program to check whether a number is Palindrome or not.
	/*	Scanner input=new Scanner(System.in);
		System.out.print("Enter a string or a number:");
        String sref=input.next();
        char arr[]=new char[50];
       // char arr2[]=new char[50];
        arr=sref.toCharArray();
        //int size=arr.length;
        String abcd="";  */
      /*  for(int i=0;i<arr.length;i++) {
        	if(arr[i]==arr[arr.length-(i+1)]) {
        		//System.out.println("Palindrome");
        		 arr2[i]=arr[arr.length-(i+1)];
        		 
        	}else {
        		//System.out.println("Nope");
        		abcd="";
        	}
        }
        if(arr==arr2) {
        	System.out.println("Palindrome");
        }else {
        	System.out.println("Nope");
        }*/
      /*  for(int i=0;i<arr.length;i++) {
        	//arr2[i]=arr[arr.length-i-1];
        	abcd=abcd+sref.charAt(arr.length-i-1);
        }
        //abcd=Arrays.toString(arr2);
        //System.out.println(abcd);
        if(sref.equals(abcd)) {
        	System.out.println("Palindrome");
        }else {
        	System.out.println("Nope");
        } */
        //input.close();
        
        System.out.println("Enter the number:");
        Scanner input2=new Scanner(System.in);
        int iref=input2.nextInt();
        char [] cref=new char[20];
        String arm=Integer.toString(iref);
        cref=arm.toCharArray();
        int arm1=cref.length;
        String result="";
        System.out.println(arm1);
        for(int i=0;i<cref.length;i++) {
        	
        }
        
        otherImportantPrograms oref=new otherImportantPrograms();
        
        cat dref[]=new cat[8];
        for(int i=0;i<dref.length;i++) {
        	dref[i]=new cat();
        }
        
        electricGuitar eRef=new electricGuitar();
        eRef.setName("Rocks");//Getters and Setters are used to provide encapsulation which means we cannot directly access the instance variables of an object
        System.out.println(eRef);
        
	}

}
