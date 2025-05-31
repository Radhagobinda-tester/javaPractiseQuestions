package BasicQuestions;

import java.util.Scanner;

public class RemovingDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the word in which you want removing duplicate character   : ");
		     
		     String word = sc.nextLine();// take input from the console
		     
		     StringBuilder sb2 = new StringBuilder();
		     int count =0;
		     
		     for(int i=0;i<word.length();i++) { // traversing from left to right 
		    	 
		    	 char ch = word.charAt(i);// get the position of character
		    	 int idx = word.indexOf(ch,i+1); // this line it will check wheteher the same alphabet is present rest of the word 
		    	 
		    	 if(idx==-1) {
		    		 sb2.append(ch);// remove the character 
		    		 count++;
		    	 }
		    	 
		    	
		    	 
		    	 
		     }
		     
		     System.out.println("After removing repeated charcter/alphabet the wod remain  : "+sb2 + count );
	}

}
