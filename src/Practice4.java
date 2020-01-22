
public class Practice4 {
	

	public static void main(String[] args) {
		String s1=new String("s");
		System.out.println(s1);
		String s2=new String ("s");
		System.out.println(s1);
		String s3="s";
		String s4="s";
		if(s1==s2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		if(s3==s4) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		String str = new String("Hello");//Will not work because strings are immutable
		str.concat(" World");
		System.out.println("str is: "+str);
		

	}

	

}
