package BasicQuestions;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence or word you want to reverse: ");
        
        String input = sc.nextLine(); // Read the full input including spaces
        //reverse the string by using .toCharArray(); to covert string to array
       
        char [] ch = input.toCharArray();
        
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }
        // Reversing using a for loop
        System.out.print("Reversed using for loop by .charAt(int index): ");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
        
        // Reversing 0using StringBuilder
        StringBuilder sb = new StringBuilder(input);
        System.out.println("Reversed using StringBuilder: " + sb.reverse());
        
        // Reversing using StringBuffer
        StringBuffer sf = new StringBuffer(input);
        System.out.println("Reversed using StringBuffer: " + sf.reverse());
        
        sc.close();
    }
}
