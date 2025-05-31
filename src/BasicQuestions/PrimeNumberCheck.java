package BasicQuestions;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }

    // Prime Checking Method (Checking Up to number/2)
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (number == 2) {
            return true; // 2 is the smallest prime number
        }

        // Check divisibility from 2 to number/2
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, number is prime
    }
}
