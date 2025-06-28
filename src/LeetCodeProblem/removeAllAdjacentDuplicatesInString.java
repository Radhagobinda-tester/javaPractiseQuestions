package LeetCodeProblem;

public class removeAllAdjacentDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbaca";
//		Using string builder 
		StringBuilder sb = new StringBuilder();
//		for loop traversing from first to last string 
		for(int i=0; i<s.length(); i++) {
			if(sb.length()>0 && sb.charAt(sb.length()-1)== s.charAt(i)) {
				sb.deleteCharAt(sb.length()-1);
			}else {
				sb.append(s.charAt(i));
			}
			
		}
      System.out.println("After removinfg adjacent character : "+sb.toString());

	}

}
