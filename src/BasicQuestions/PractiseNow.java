package BasicQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PractiseNow {
	
	
	public static void main(String[] args) {
		System.out.println("sorting alphabatical order");
		
		String s = "Radha";
		s =s.toLowerCase();
		char [] ch = s.toCharArray();
		char temp;
		for(int i=0; i<ch.length;i++) {
			for(int j= i+1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
					temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(new String(ch));
		
}
}
