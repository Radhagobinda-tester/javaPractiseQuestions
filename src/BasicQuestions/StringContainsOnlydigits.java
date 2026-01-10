package BasicQuestions;

public class StringContainsOnlydigits {
 public static boolean onlyDigits(String num) {
	 for(int i=0; i<num.length(); i++) {
//		  Converting char to string 
		 
		 String ch = String.valueOf(num.charAt(i));

	        if (!"0123456789".contains(ch)) {
	            return false;
	        }
		}
	 return true;
 }
	public static void main(String[] args) {
		String num ="02345";
		String number ="0123456789";
		if(onlyDigits(num)) {
			System.out.println("Contains only digits");
		}else {
			System.out.println("Does not contains only digits");
		}
	}

}
