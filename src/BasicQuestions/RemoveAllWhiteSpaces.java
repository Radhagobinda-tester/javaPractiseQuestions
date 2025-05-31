package BasicQuestions;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the word which do you want remove spaces  : ");
		     
		     String theword = sc.nextLine();// take input from the console
		   // String trimstr = theword.trim(); it will remove before after spaces from a word //s is used to remove the white space from all the word 
		     String w = theword ;
		    String trimstr= w.replaceAll("\\s", "");
		     
		    System.out.println("The word is  : "+ trimstr);
		// trim method is to remove the space from start and end 
		String trim = w.trim();
		
		  System.out.println("After removing the space from start and end the word become  : "+ trimstr);
		
	}

}
