package LeetCodeProblem;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Roman numeral: ");
        String s = sc.nextLine();
        s = s.toUpperCase(); // Convert to uppercase for consistent matching

        System.out.println("Integer value: " + romanToInt(s));
        sc.close(); // Always close Scanner
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        // Initialize result with the last character's value
        int result = hm.get(s.charAt(s.length() - 1));

        // Iterate from right to left (second last character to first)
        for (int i = s.length() - 2; i >= 0; i--) {
//        	Get method is used to get the value 
        
            // If current value is less than the next, subtract it
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                result -= hm.get(s.charAt(i));
            } else {
                // Else, add it
                result += hm.get(s.charAt(i));
            }
        }
        return result;
    }
}
