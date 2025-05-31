package BasicQuestions;

import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
//       creating a variable
		int num = sc.nextInt();
		int temp = num, cnt=0;
//		Writting a if else conditon to check if the temp =0 then it doesnot count 0 beacuase while loop does not count 
        if(temp==0) {
        	System.out.println("The enter digit is 0 :");
        	cnt =1;
        }else {
        	while(num>0) {
        		num = num/10;
        		cnt++;
        	}
        }
        
        System.out.println("The count is :"+cnt);
        sc.close();
	}

}
