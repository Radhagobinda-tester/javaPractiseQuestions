package BasicQuestions;

import java.util.Scanner;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("enter the word which you want reverse the vowels : ");
 String s = sc.nextLine();
 int left = 0;
 int right = s.length()-1;
 String vowels = "aeiouAEIOU";
 char [] ch = s.toCharArray();
 while(left<right) {
	 if(vowels.indexOf(ch[left]) == -1){
		 left++;
	 }
 else if(vowels.indexOf(ch[right]) == -1) {
	 right--;
 }else {
	 char temp ;
	 temp = ch[left];
	 ch[left] = ch[right];
	 ch[right]=temp;
	 left++;
	 right--;
 }
 }
 
 System.out.println("output : " + new String(ch));
 sc.close();
	}

}
