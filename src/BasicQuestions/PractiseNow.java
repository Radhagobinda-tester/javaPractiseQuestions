package BasicQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class PractiseNow {
//  Creating a method to check implement the string is anagram or not 
	
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        String wd = sc.nextLine();
        int count = 0;
        int lastCharacter = java.lang.Character.toLowerCase(wd.charAt(0));
        for(int i =1 ; i<wd.length(); i++) {
        	
        	int currentKey = java.lang.Character.toLowerCase(wd.charAt(i));
        	if(lastCharacter!=currentKey) {
        		count++;
        	}
        	lastCharacter = currentKey;
        }
       
      System.out.println(count);
       sc.close();
}
}
