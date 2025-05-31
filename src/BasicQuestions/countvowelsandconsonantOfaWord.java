



package BasicQuestions;

import java.util.Scanner;
import java.lang.Character; // optional, as java.lang is imported by default


public class countvowelsandconsonantOfaWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word :");
		String word = sc.nextLine();
		// Converting to lower case  
		String str1 =word.toLowerCase();
		// Writting all the vowels 
		String vowel = "aeiou";
		int vowel1=0,consonant=0;
		
		// using for each loop to itreate from left to right each character 
		for(char ch:str1.toCharArray()) {
			// writting if codition 
			if(Character.isLetter(ch)) {
//				idexogf method is used to check the element are present or not if present it will return -1 
				if(vowel.indexOf(ch)!=-1) {
					
					vowel1++;
				}
				else {
					consonant++;
				}
			}
			
		}
		
		System.out.println("Number of vowels: " + vowel1);
        System.out.println("Number of consonants: " + consonant);
		sc.close();

	}

}
