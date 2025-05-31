package BasicQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class CheckaStringAnagramornot {
	
	// Creating a method 
	public static boolean isAnagram(String str1,String str2) {
		
		// Remove spaces and convert to lowercase
		 str1=str1.replaceAll("\\s", "").toLowerCase();
		 str2 = str2.replaceAll("\\s", "").toLowerCase();
		 
		 // First concept if the length is not same then these are notanagrams
		 if(str1.length()!=str2.length()) {
			 return false;
			 
		 }
		 
		// converting the string to character 
		 char[] ch = str1.toCharArray();
		 char[] ch1 = str2.toCharArray();
		 // sorting the array 
		 Arrays.sort(ch);
		 Arrays.sort(ch1);
		// checking the arrays are equal or not 
		return Arrays.equals(ch, ch1);
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// raeting to arrays 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String str1 = sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the second string : ");
		String str2 = sc.nextLine();
		// caling the method 
		if(isAnagram(str1,str2)) {
			System.out.print("String "+str1+" & "+str2+" are anagram");
		}
		else {
			System.out.print("String "+str1+" & "+str2+" are not anagram");
		}
		sc.close();
	}

}
