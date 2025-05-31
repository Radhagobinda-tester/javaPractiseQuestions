package practsieClass;

import java.util.Arrays;
import java.util.Scanner;

public class practiseTheQuestionwhichHavenotscannerneeded {

	public static boolean isAnagarm(String s1, String s2) {
		s1= s1.toLowerCase();
		s2 = s2.toLowerCase();
	    if(s1.length()!=s2.length()) {
	    	return false;
	    }
	    char []ch1 = s1.toCharArray();
	    char []ch2 = s2.toCharArray();
	    
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    return Arrays.equals(ch1, ch2);


		 
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		if(isAnagarm(s1,s2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
		
		

	}

}
