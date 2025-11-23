package ExceptionExamples;

public class NumberFormatExceptionExample {
/*
 * while converting the string to premitive data type there is a posibility of obtain nuber format 
 * excepton because the string is not  valid premitive data type 
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="12q";
		try {
		 int v = Integer.parseInt(a);
		 System.out.println(v);

	}catch(NumberFormatException e) {
		System.out.println("Exception caught: " + e.getMessage());

	}
	}

}


