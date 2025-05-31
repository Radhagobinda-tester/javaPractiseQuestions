package StringClass;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Arithmetic Progression Solver");
        
        // Input first term, common difference, and number of terms
        System.out.print("Enter the first term (a): ");
        double firstTerm = scanner.nextDouble();
        
        System.out.print("Enter the common difference (d): ");
        double commonDifference = scanner.nextDouble();
        
        System.out.print("Enter the number of terms (n): ");
        int numberOfTerms = scanner.nextInt();

        // Calculate nth term
        double nthTerm = calculateNthTerm(firstTerm, commonDifference, numberOfTerms);
        System.out.println("The " + numberOfTerms + "th term of the AP is: " + nthTerm);

        // Calculate sum of the series
        double sum = calculateSum(firstTerm, commonDifference, numberOfTerms);
        System.out.println("The sum of the first " + numberOfTerms + " terms of the AP is: " + sum);

        scanner.close();
    }

    // Method to calculate the nth term of an arithmetic progression
    private static double calculateNthTerm(double a, double d, int n) {
        return a + (n - 1) * d;
    }

    // Method to calculate the sum of the first n terms of an arithmetic progression
    private static double calculateSum(double a, double d, int n) {
        return n / 2.0 * (2 * a + (n - 1) * d);
    }
}
