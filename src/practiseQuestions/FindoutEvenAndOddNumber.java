package practiseQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindoutEvenAndOddNumber {
	// Creating a method 
	
public static void main(String[]args) {
	
	int[] array = {15, 30, 20, 10, 50};
//      Declaring th efirst and second value 
	int fistLargestnumber = Integer.MIN_VALUE;
	int secondLargestnumber = Integer.MIN_VALUE;
	
//	Wrting a for lop traversing from left to wite
	for(int i =0; i<=array.length; i++) {
		// writingif condition tofind the first and second largest number 
//		int[] array = {15, 30, 20, 10, 50};
		if(array[i]>fistLargestnumber) {
			secondLargestnumber = fistLargestnumber;
			fistLargestnumber = array[i];
			
		}else if(array[i]> secondLargestnumber && array[i] != fistLargestnumber ) {
		
			secondLargestnumber = array[i];
		
	}
		
}
	if (secondLargestnumber == Integer.MIN_VALUE) {
        System.out.println("No second largest number found.");
    } else {
        System.out.println("The second largest number is: " + secondLargestnumber);
    }
	

}

}
