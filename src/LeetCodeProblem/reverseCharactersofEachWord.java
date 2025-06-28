package LeetCodeProblem;

public class reverseCharactersofEachWord {
	public static String reverseWords(String s) {
		
		String [] word = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		for(int i = word.length-1; i>=0;i--) {
			sb.append(word[i]);
			if(i>0) sb.append(" ");
			
		}
		
		String words = sb.toString();
		char[] Char = words.toCharArray();
		System.out.println(words);
		String reverse ="";
		for(int j =Char.length -1; j>=0; j--) {
			reverse = reverse + Char[j];
		}
		
		
		return reverse;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "hello world from java";
	     
	     String reversed = reverseWords(s);
	     System.out.println(reversed);

	}

}
