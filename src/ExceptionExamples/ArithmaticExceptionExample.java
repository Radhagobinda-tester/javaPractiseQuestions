package ExceptionExamples;

public class ArithmaticExceptionExample {
 /*
  * The number which is divided by zero then we get  ArithmaticException*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a =12;
 int b =0;
 try {
	 int c =a/b;
	 System.out.println(c);
 }catch (ArithmeticException  e) {
	 
	 System.out.println("Arithmatic exception " + e.getMessage());
	 
 }
	}

}
