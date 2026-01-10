package constructorExamples;

public class A {
	
	void A() {
		System.out.println("I am a non parameterised constructor");
	}
	
	void A(int a, int b) {
		System.out.println("I am a non parameterised construtor");
	}

	public static void main(String[] args) {
		A a = new A();
		a.A(12, 13);

	}

}
