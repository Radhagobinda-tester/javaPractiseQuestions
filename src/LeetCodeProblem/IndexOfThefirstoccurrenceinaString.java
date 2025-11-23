package LeetCodeProblem; 
// Declares the package name where this class is stored.

public class IndexOfThefirstoccurrenceinaString {
    // Class name following LeetCode-style problem naming.

    // Method to find the index of the first occurrence of 'needle' in 'haystack'
    public static int stringstring(String haystack, String needle) {

        // Loop through each index of 'haystack' where 'needle' could possibly start
        // Example: if haystack = "sadbutsad" and needle = "sad" (length 3)
        // i should go from 0 to (9 - 3) = 6
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            // If the current character of haystack matches the first character of needle
            if (haystack.charAt(i) == needle.charAt(0)) {

                // Extract substring of haystack from i to i + needle.length()
                // Example: if i = 0, substring(0, 3) → "sad"
                // Compare it with 'needle'
                if (haystack.substring(i, i + needle.length()).equals(needle)) {

                    // If substring matches, return the current index i
                    return i;
                }
            }
        }

        // If the loop finishes and no match is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Input strings
        String haystack = "sadbutsad", needle = "sad";

        // Call the method and print the result
        // Expected output: 0 (since "sad" first appears at index 0)
        System.out.println(stringstring(haystack, needle));
    }
}
 

//  https://www.youtube.com/watch?v=OWaZ6AosS30  - video link 

