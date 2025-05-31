package BasicQuestions; // Declare that this class belongs to the 'BasicQuestions' package

import java.util.Scanner; // Import the Scanner class to allow user input

public class countEvenandOddnumber { // Define the public class 'countEvenandOddnumber'

    public static void main(String[] args) { // Main method: the entry point of the program
        
        // Create a Scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number as a string
        System.out.print("Enter the number you want to count how many odd and even digits are present inside the number: ");
        
        // Read the entire line of input from the user and store it in the String variable 'num'
        String num = sc.nextLine();
        
        // Initialize a counter for even digits
        int even = 0;
        // Initialize a counter for odd digits
        int odd = 0;
        
        // Define a string that contains all even digits
        String str1 = "02468";
        
        // Loop through each character in the string 'num'
        for (int i = 0; i < num.length(); i++) {
            // Get the character at index 'i' from the input string
            char chArr = num.charAt(i);
            
            // Check if the current character is one of the even digits by using indexOf.
            // indexOf returns -1 if the character is not found in 'str1'.
            if (str1.indexOf(chArr) != -1) {
                // If found, increment the even counter
                even++;
            } else {
                // Otherwise, assume the digit is odd and increment the odd counter
                odd++;
            }
        }
        
        // Print the results: count of even and odd digits found in the input
        System.out.println("Even number Count: " + even + " Odd number count: " + odd);
        
        // Close the Scanner object to prevent resource leaks
        sc.close();
    }
}
