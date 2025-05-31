package BasicQuestions;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubStringWithoutRepeatingCharacters {

    // Function to find the length of the longest substring without repeating characters
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>(); // To store unique characters
        int left = 0, right = 0;  // Pointers to define the window
        int maxLength = 0;  // To store the maximum length found

        while (right < s.length()) {
            // If the character is not in the set, add it and calculate the maximum length
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));  // Add character to the set
                maxLength = Math.max(maxLength, right - left + 1); // Calculate max length
                right++;  // Move the right pointer to the right
            } else {
                // If the character is already in the set, remove the character at the left pointer
                set.remove(s.charAt(left));  
                left++;  // Move the left pointer to the right
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Create scanner to read user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String s = sc.nextLine();  // Read the input string

        // Create an instance of the class and call the method
        LongestSubStringWithoutRepeatingCharacters l = new LongestSubStringWithoutRepeatingCharacters();
        int count = l.lengthOfLongestSubstring(s);  // Find the length of the longest substring

        // Output the result
        System.out.println("Length of the longest substring without repeating characters: " + count);

        // Close the scanner resource
        sc.close();
    }
}
