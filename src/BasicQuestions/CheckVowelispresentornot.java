package BasicQuestions;

import java.util.Scanner;

public class CheckVowelispresentornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word which you want to check vowel is present or not :");
	   String wd = sc.nextLine();
	   // Converting the word to lowercase 
	   String word = wd.toLowerCase();	   
	   char[] ch = word.toCharArray();
	   
	   /* Declaring the boolean is false because multiple times the output is showing Enter the word which you want to check vowel is present or not :
	   sh
	   Vowel is not present on this word : 
	   Vowel is not present on this word : 
	   Vowel is not present on this word :
*/
boolean vowelfound = false;
// using for loop
	   for(int i =0; i<ch.length; i++) {
		   
		 if(ch[i]== 'a'|| ch[i]== 'e' || ch[i]== 'i' ||ch[i]== 'o' || ch[i]== 'u') {
			  vowelfound = true;
			  break;
			 
			  
		 }
		 
	   }
		 if (vowelfound) {
	            System.out.println("vowel is present in the word.");
	        } else {
	            System.out.println("No vowel found in the word.");
	        }
	        
	        sc.close();	 
	        }

	}


