package LeetCodeProblem;

import java.util.Scanner;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        String roman = "";
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10,   9,   5,   4,   1};
        String[] romans = {"M",  "CM","D", "CD","C", "XC","L", "XL","X", "IX","V", "IV","I"};

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman += romans[i]; 
                num -= values[i];
            }
        }
        return roman;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int num = sc.nextInt();
     // Call the method to convert the entered integer to its Roman numeral representation
        String romanNumeral = intToRoman(num);

        // Display the converted Roman numeral on the console
        System.out.println("Roman numeral: " + romanNumeral);

        // Close the Scanner to free up system resources
        sc.close();

    }
}
