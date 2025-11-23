package constructorExamples;

public class Overloading {
	String name ;
	int age;
	String place;
	
	public Overloading(int a, String b) {
	System.out.println("Integer and string is exected");
	name =b;
	age = a;
	}
	public Overloading(String p, String b) {
		System.out.println("String and string is exected");
		name =b;
		place = p;
		}
	public static void main(String[] args) {
		Overloading o = new Overloading(40,"Radha");
		System.out.println(o.age);

	}

}
