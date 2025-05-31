package BasicQuestions;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number which you want to reverse :");
      int num = sc.nextInt();
      int org_num = num;
      int rev =0;
      
      while(num!=0) {
    	  rev=rev*10+num%10;
    	  num=num/10;
      }
      System.out.println("the reverse number is:"+ rev);
      
      
	
	if(org_num==rev) {
		System.out.println("This number is a pellindrum number");
		
	}
	else {
		System.out.println("This number is  not a pellindrum numbr");
	}
}
}
