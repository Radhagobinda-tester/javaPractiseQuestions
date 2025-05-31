package BasicQuestions;

import java.util.Scanner;
import java.lang.Character;
public class Swappingupercasetolowercaseorviceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating ascanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word : ");
		String wd = sc.nextLine();
		// Creating a string builder object 
		StringBuilder swappedch = new  StringBuilder();
		// Using for loop to get each characte of word
		for(int i=0;i<wd.length();i++ ) {
			// getting each index 
			char ch = wd.charAt(i);
			if(Character.isUpperCase(ch)) {
				
				//  method is to convert the uppercase tolowercase 
				
				swappedch.append(Character.toLowerCase(ch));				
				
			}
			else if(Character.isLowerCase(ch)) {
			//  method is to convert the lowercase  to uppercase
				swappedch.append(Character.toUpperCase(ch));
			}
			
			else {
				// Keep numbers and special characters unchanged
				swappedch.append(ch);
			}
		}
System.out.print("After swapping the lowercase to upper csae " + swappedch);
	}


}
