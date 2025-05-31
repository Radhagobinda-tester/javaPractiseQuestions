package newpack;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
// creating a static method 
	
	public static boolean isAnagram(String str1,String str2) {
		str1 = str1.replaceAll("//s", "").toLowerCase();
		str2 = str2.replaceAll("//s", "").toLowerCase();
		if(str1.length()!=str2.length()) {
			
		
			return false;
		}
		
		// converting the string to character 
		char [] ch = str1.toCharArray();
		char [] ch1 = str2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		return Arrays.equals(ch, ch1);

		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String str1 = sc.nextLine();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the second string : ");
		String str2 = sc.nextLine();
		if(isAnagram(str1,str2)) {
			
			System.out.println("The enter string is Anagram ");
			
		}else {
			System.out.println("The enter string is not a anagram ");
		}
		
		sc.close();
		
}
}
