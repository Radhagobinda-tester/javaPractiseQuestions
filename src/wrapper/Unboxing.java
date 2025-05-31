package wrapper;

public class Unboxing {

	public static void main(String[] args) {
		String s1= "5";
		//unboxing the from object to string 
		int b =Integer.parseInt(s1);
		
		System.out.println(s1);
		System.out.println(b);
		
		// Unboxing integer class 
		Integer obj1=10;
		// forunboxing we have to write xxxvalue()
		int b1=obj1.intValue();
		System.out.println("after unboxing fro objevt to Premitive data type"+b1);
		
		System.out.println("obj data type"+obj1);
		
		// different way to unboxing 
		
		Integer obj2 = new Integer(20);
		int b3 = obj2.intValue();
		System.out.println("after unboxing fro objevt to Premitive data type"+b3);
		System.out.println("obj data type"+obj2);
		
		
		
	}

}
/* 

Output 
5
5
after unboxing fro objevt to Premitive data type10
obj data type10
after unboxing fro objevt to Premitive data type20
obj data type20

*/