package LeetCodeProblem;

public class reverseAstringFromASentence {
	
	public static String reverseWords(String s) {
		
		
//		 Removing the spaces and split the word 
		
		String [] word = s.trim().split("\\s+");
		System.out.println("Now each word is stored in an index: " + java.util.Arrays.toString(word));

//		Using string builder to store the data 
		StringBuilder sb = new StringBuilder();
		
//		Writting a for loop to reverse a string 
		
		for(int i = word.length-1; i>=0; i--) {
			
			sb.append(word[i]);
//  Adding the spaces after every string 
			if(i>0) {
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "the sky is blue";
     
     String reverse = reverseWords(s);
     System.out.println(reverse);
     
	}

}
