package BasicQuestions;

import java.util.Scanner;

public class sotingAlphabaticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  word :");
		String word = sc.nextLine();
		// Converting the string to array
		String word1 = word.toLowerCase();
	char[] ch = word1.toCharArray();
	char temp;
	// by using for loop 
	
	for (int i =0; i<ch.length; i++) {
       
		for(int j = i+1; j<ch.length; j++) {
			if (ch[i] > ch[j]) {
			temp = ch[i];
			ch[i] = ch[j];
			ch[j]= temp;
		}
	}
	}
System.out.println(new String (ch));

}
}
