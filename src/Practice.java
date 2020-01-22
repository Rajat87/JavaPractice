import java.util.ArrayList;

class Dog {
int size;
String name;
void bark() {
if (size > 60) {
System.out.println("Wooof! Wooof!");
} else if (size > 14) {
	System.out.println("Ruff Ruff");
} else {
	System.out.println("Yip Yip");
}
}
}

class Wolf extends Dog{
	
	void sleep()
	{
		
	}
}

class MyDogList{
	Dog[] dog=new Dog[5];
	int nextIndex=0;
	public void add(Dog d) {
		if (nextIndex < dog.length) {
		dog[nextIndex] = d;
		System.out.println("Dog added at" + nextIndex);
		nextIndex++;
		}
		}
}

interface abcd{
	
}
public class Practice {

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.size=40;
		dog1.name="Tiger";
		Dog dog2=new Dog();
		dog2.size=70;
		dog2.name="Rufus";
		
		int[] arr= {5,6,7,8};
		for(int i: arr) {
			System.out.println(i);
		}
		int[] arr1=new int[]{10,20,30,40};
		for(int c: arr1)
		{
			System.out.println(c);
		}
		
		int [][] arr2=new int[][] {{10,20,30,40},
				{20,30,40},
				{50,60,70},
				{80,90}};
	
	for(int j[]: arr2)
	{
		for(int k:j) {
			System.out.print(k+" ");
		}
		System.out.println();
			
	}
	
	Dog dog6=new Dog();
	Wolf wolf=new Wolf();
	if(dog6.equals(wolf)) {
		System.out.println("True");
	}else {
		System.out.println("False");
	}
	
	Object object=new Object();
	ArrayList<Dog> myDogArrayList=new ArrayList<Dog>();
	myDogArrayList.add(wolf);
	ArrayList<Wolf> myWolfArrayList=new ArrayList<Wolf>();
	ArrayList<Object> myObjectArrayList=new ArrayList<Object>();
	myObjectArrayList.add(wolf);
	myWolfArrayList.add((Wolf) myObjectArrayList.get(0));//TypeCasting From Object To Wolf
	
	
	

}
}
