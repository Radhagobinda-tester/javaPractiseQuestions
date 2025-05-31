package BasicQuestions;

import java.util.Scanner;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the word which do you want remove the special character : ");
	     
	     String word1 = sc.nextLine();// take input from the console
	     String w = word1;
	  String NewWord =   w.replaceAll("[^a-zA-Z0-9]","");// remove special character other than  a-z,Z-A,0-9. will remove
	  
	  System.out.println("The word is  : "+NewWord );
	  
	}
}
