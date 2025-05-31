package BasicQuestions;

import java.util.Scanner;

public class CheckTheStringisPelindrumornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to check pelindrum or not  : "  );

		String wd = sc.nextLine();
		
		// Creating the reversed with default
		String reversed ="";
		
	// Using for loop 
		for(int i= wd.length()-1; i>=0; i--) {
			//Reversing the word 
			reversed = reversed+wd.charAt(i);
		}
		if(wd.equalsIgnoreCase(reversed)) {
			System.out.print("The string is pelindrum :" + wd );
		}
		else {
			System.out.print("The string is not a pelindrum : " + wd );
		}
		sc.close();
	}

}
