package LeetCodeProblem;

import java.util.HashSet;
import java.util.Scanner;
/* 
 * we have to count even pair like 2 
 * simply add 1 
 * because the logisc is add all the even pairs and only add one odd 
 * */

public class ThelengthOfThelongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();
		
		ThelengthOfThelongestSubstring nw = new ThelengthOfThelongestSubstring();
		int countOflongestPelindrome = nw.LongestPalindromeSubstring(s);
		System.out.println(countOflongestPelindrome);

	}
	
	public int LongestPalindromeSubstring(String s) {
//		res means adding the result 
		int res =0;
		
//		Writting hash set to add unque character 
		HashSet <Character> set = new HashSet<>();
		
		for(Character ch: s.toCharArray()) {
//			Writting the concept that set contains et then add even number and remove
			if(set.contains(ch)) {
				// if it contains the same charcter then add apir menas 2 
				res +=2;
//				Then remove than last char 
				set.remove(ch);
			}else {
				set.add(ch);
			}
			
			
		}
//		Writting the concept that set contains et then add even number and remove
		if(set.size()>0) {
//			If size is greater than zero then odd is present on size then add omn res
			res+=1;
		}
		
		return res ;
		
		
	}

}
// https://www.youtube.com/watch?v=Rbf3StOcRo0 - refernce you tube channel link 
