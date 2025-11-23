package ExceptionExamples;

public class AllExceptionExamples {

	public static void main(String[] args) {
	
// ===     String idex out of boud exception =============
		String str = "Radha";
		try {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(5);
			
		}
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception : " + e.getMessage());
		}
//  ===========Index out of bound example =============
		int [] arr= {1,2};
		try {
		 int i = arr[5];
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception : "+e.getMessage());
	}
		
//		=== ArithMatic exception =====
		
		int z =10;
				try {
					int d =z/0;
				}catch(ArithmeticException e) {
					System.out.println("Exception :"+e.getMessage());
				}
//		=== Nullpointer exception ========
				
		int [] a =null;
		try {
		System.out.println(a.length);	
		}catch(NullPointerException e) {
			System.out.println("Exception :"+e.getMessage());
		}
		
//	 Number format exceptio =============
		
		String sh ="123q";
		try {
		int h = Integer.parseInt(sh);
	}catch(NumberFormatException e) {
		System.out.println("Excception : "+e.getMessage());
	}
		
	}
}
