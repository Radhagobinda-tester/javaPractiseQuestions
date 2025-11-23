package practiseQuestions;

import java.util.HashSet;
import java.util.Set;

public class CountOfVowelsFromAString {

	public static void main(String[] args) {
	 String N ="Shanvi Sadhana Dash";
	 String n =N.toLowerCase();
	 String Vowel = "aeiou";
	 Set<String> set = new HashSet<>();
	 for(int i =0; i<n.length();i++) {
		 char ch1 = n.charAt(i);
		 if(Vowel.indexOf(ch1)!=-1) {
			 set.add(String.valueOf(ch1));
		 }
	 }
	 System.out.println("Unique vowels: " + set);	 
System.out.println(set.size());
	}

}
