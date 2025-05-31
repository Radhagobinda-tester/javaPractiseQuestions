
package BasicQuestions;

import java.util.Scanner;

public class LeapYearcheckProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the year is a leap year
        boolean isLeap = isLeapYear(year);
        
        // Display the result
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
    
    // Method to check leap year
    public static boolean isLeapYear(int year) {
        /*
         * If a year is divisible by 4, it is a leap year.

        However, if the year is also divisible by 100, it is not a leap year unless:

         The year is divisible by 400, in which case it is a leap year.
         * A year is a leap year if:
         * 1. It is divisible by 4
         * 2. If it is a century year (divisible by 100), it must also be divisible by 400
         */
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
