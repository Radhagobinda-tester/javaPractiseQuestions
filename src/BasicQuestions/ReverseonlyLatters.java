package BasicQuestions;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Character; // optional, as java.lang is imported by default

public class ReverseonlyLatters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Word : ");
String s = sc.nextLine();

 //Coverting String to charactrer Array

char [] ch = s.toCharArray();
// using two pointers method 
int left = 0;
int right = ch.length-1;
// Writting while 
while(left<right) {
//	Write if condition to check the left first index  is character or not 
	if(!Character.isLetter(ch[left])) {
//		If the left is character then pointer will move left forword 
		left++;
	}
//	Write if condition to check the right first index  is character or not 	
	else if(!Character.isLetter(ch[right])){
		right--;
	}
//	if found any letter swap from leftt o right 
	else {
		char temp;
		temp = ch[left];
		ch[left] = ch[right];
		ch[right] =  temp;
		left++;
		right--;
	}
}
System.out.println("Ouput"+ Arrays.toString(ch));
 System.out.println("Ouput"+ new String(ch));
		
	}

}
