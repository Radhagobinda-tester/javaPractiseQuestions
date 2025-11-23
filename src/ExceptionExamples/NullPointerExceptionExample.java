package ExceptionExamples;

public class NullPointerExceptionExample {
	
	/* if decalre array reference variable is null. it point not nothing since we are not pointing
	   to any of the array object. we cannot define its length , in such case we get null pointer exceptio.
	
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a =null;
		try {
			System.out.println(a.length);
		}catch(NullPointerException e ) {
			System.out.println("Exception  : "+e.getMessage());
		}

	}

}
