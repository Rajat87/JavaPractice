import static java.lang.System.out;
//Demo For Constructor Chaining
class Animal {
static int objectCount;
public Animal() {
System.out.println("Making an Animal");
objectCount++;
}
}
class Hippo extends Animal {
public Hippo() {
System.out.println("Making a Hippo");
}
 }
public  class Chaining {

	public static void main(String[] args) {
		
		Hippo hippo1=new Hippo();
		System.out.println(""+Math.min(52, 46));
		System.out.println(""+Animal.objectCount);
		Animal obj1=new Animal();
		out.println(""+Animal.objectCount);//Using Static Import
		Animal obj2=new Animal();
		System.out.println(""+Animal.objectCount);
		
		
		
	}

}
 
