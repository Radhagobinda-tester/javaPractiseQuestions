package BasicQuestions;

import java.util.Scanner;

public class factorialprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which yiu wanrto print :");
		int n = sc.nextInt();
		
		//int n=5;
		// Taking the first factioral equals to 1
		long factorial = 1;
		// writting a for loop
		
		for(int i =1; i<=n;i++) {
			
			//factorial *=i;
			
			factorial=factorial*i;
			
			
		}
		System.out.println("The factorial of "+n+"! is :"+factorial);
		sc.close();

	}

}
