package BasicQuestions;

import java.util.Scanner;

public class ArmstrongNumbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check the number id armstrong number or not : ");
		int num = sc.nextInt();
		// intialize the values
		int sum =0,temp,res;
		// Comparing the num with temp 
		temp = num;
		
		/*
         * Concept of Armstrong Number:
         * An Armstrong number (also known as a Narcissistic number) is a number
         * that is equal to the sum of the cubes of its digits.
         * 
         * Example: 153
         * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 (Armstrong Number)
         */
        
        // Extract digits and compute the sum of cubes 
		while(num>0) {
			
			// Extracting the last num by using modulus 
			res = num%10;
			// removing last num 
			num=num/10;
			 sum = sum + (res * res * res); // Add the cube of the extracted digit to sum
			// checking the number is armstrong number or not 
			 
			  /*
		         * Concept of Armstrong Number:
		         * An Armstrong number (also known as a Narcissistic number) is a number
		         * that is equal to the sum of the cubes of its digits.
		         * 
		         * Example: 153
		         * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 (Armstrong Number)
		         */
			
			
		}
		
		if(temp==sum) {
			System.out.print("The number is armostrong number "+temp );
		}
		else {
			System.out.print("The number is not armostrong number bcause the sum of all the numbers :  "+sum );
		}
         sc.close();
	}

}
