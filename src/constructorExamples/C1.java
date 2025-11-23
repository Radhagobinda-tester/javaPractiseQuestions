package constructorExamples;

public class C1 {
	int d;
	C1(){
		System.out.print("I am non parrameterised constructor");
	}
	C1 (int d){
		System.out.println("I am non parameterisd constructor ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  C1 c =new C1(10);
	}

}
