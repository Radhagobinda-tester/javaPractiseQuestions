package BasicQuestions;

import java.util.Scanner;

public class checkthenumberisprimenumberornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the number : ");
       int num = sc.nextInt();
       
       // writting if condition to print the number is prime number
       if (isPrime(num)) {
           System.out.println(num + " is a Prime Number.");
       } else {
           System.out.println(num + " is NOT a Prime Number.");
       }

       sc.close();
	
   }
	// creating a method 
       public static boolean isPrime(int num) {
    	   if(num<=1) { //checking negative numbers 
    		   return false;
    	   }
       // writting for loop to check the square root
       for(int i =2; i<Math.sqrt(num);i++) {
    	   
    	   if(num % i ==0) { // Check divisibility from 2 to sqrt(num)
    		 return  false;
    		   
    	   }
    	   
    	   
       }
       return true;
	}

}

	

