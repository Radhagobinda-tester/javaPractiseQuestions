package LeetCodeProblem;

import java.util.Arrays;

public class LongestCommonPrefix {
// creating a method 
	public static String longestPrefix(String[] strs) {
//		 Creating string builder 
		StringBuilder result = new StringBuilder();
//		 Soting the word alphabatically 
		Arrays.sort(strs);
//		get the first and last strings after sorting 
		char [] first = strs[0].toCharArray();
		char[] last = strs[strs.length-1].toCharArray();
		for(int i=0;i<first.length;i++) {
			if(first[i]!=last[i]) 
				break;
				result.append(first[i]);
			
		}
		return result.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"club", "clap", "clove"};  

         System.out.println("the prefix string is :"+ longestPrefix(strs) );
	}

}
