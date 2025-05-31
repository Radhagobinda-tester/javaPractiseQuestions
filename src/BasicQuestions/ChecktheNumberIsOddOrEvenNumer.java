package BasicQuestions;

import java.util.Scanner;

public class ChecktheNumberIsOddOrEvenNumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creaing a scanner class
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
       int n = sc.nextInt();
       
       // by usng if condtion if a number is didvisible by 2 then it is oeven on else odd
       if(n%2==0) {
    	   System.out.print("The number is even number"+n);
       }
       else {
    	   System.out.print("The number is odd number"+n);
       }
       sc.close();
	}

}
