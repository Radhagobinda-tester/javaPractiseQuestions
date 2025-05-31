package BasicQuestions; // Declaring the package name

import java.util.Arrays;  // Importing Arrays class for array operations
import java.util.Scanner; // Importing Scanner class for taking user input

// Class name should follow CamelCase convention: "ReplaceTheCharacterWithItsOccurrence"
public class replaceTheCharacterWithItsOccurance {  

    public static void main(String[] args) {  // Main method, entry point of the program
        
        Scanner sc = new Scanner(System.in);  // Creating a Scanner object for user input
        System.out.print("Enter the word: "); // Prompting the user to enter a word
        String word = sc.nextLine();          // Reading user input as a string
        
        // Converting the input string to lowercase to handle case insensitivity
        String word1 = word.toLowerCase();

        int cnt = 1;      // Count variable to keep track of occurrences of the character
        char replace = 'a'; // Character that will be replaced 

        // Checking whether the character 'a' is present in the string using indexOf() method
        if (word1.indexOf(replace) == -1) {  // If 'a' is not found in the string
            System.out.print("The alphabet is not present"); // Display message
            System.exit(0); // Exit the program
        }

        // Converting the string into a character array
        char[] ch = word1.toCharArray();

        // Iterating through the character array to find occurrences of 'a'
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == replace) {  // If the character matches 'a'
            	/* Step 1: Convert the integer cnt to a string.
Step 2: Extract the first character of that string.
Step 3: Store that character into your character array.
*/
                ch[i] = String.valueOf(cnt).charAt(0); // Replace 'a' with the count value
                cnt++;  // Increment the occurrence count
            }
        }

        // Printing the modified character array in a readable format
        System.out.print(Arrays.toString(ch)); // Arrays.toString() prints the array as a string
        
        sc.close(); // Closing the Scanner object to prevent resource leak
    }
}
