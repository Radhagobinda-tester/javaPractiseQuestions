package constructorExamples;

class B1 {   // ✅ Parent class (superclass)
    B1() {
        System.out.println("This is the superclass constructor of B1");
    }
}

class c1 extends B1{
	c1(){
		super();
        System.out.println("This is the superclass constructor of c1");

	}
}

public class SuperClassExamples extends c1 {

	public static void main(String[] args) {
		SuperClassExamples c = new SuperClassExamples();

	}
	

}
