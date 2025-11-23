package LeetCodeProblem;

import java.util.Scanner;



public class letterCombinationsofaPhoneNumberJava {
	
	static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
 public static  void possibleWords(String s, String ans) {
	 if(s.length()==0) {
		 System.out.println(ans);
		 return;
	 }
	String key = keypad[s.charAt(0)-48];
	
//	Writting a for loop 
	for(int i =0; i<key.length(); i++) {
		possibleWords(s.substring(1),ans+key.charAt(i));
		
	}
	 
 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		String s = sc.nextLine();
		
		possibleWords(s,"");

	}

}
