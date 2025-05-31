package BasicQuestions;

public class SwappingANumberwithoutCreatingThirdVariable {

	public static void main(String[] args) {
		
		// declaring two variable
		int a =10, b =20;
		System.out.println("Before swapping the a becomes : "+a+","+"Before swapping the b becomes"+b);
		// using swappin method 
		b = a+b;//b=30
		a=b-a;//a=20
		b=b-a;//b==10
		System.out.println("After swapping the a becomes : "+a+","+"After swapping the b becomes"+b);

	}

}
