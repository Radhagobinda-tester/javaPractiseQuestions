package StringClass;

import java.util.Scanner;

public class ShapeSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shape Solver");
        System.out.println("1. Triangle");
        System.out.println("2. Quadrilateral");
        System.out.println("3. Exit");

        while (true) {
            System.out.print("Choose a shape (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveTriangle(scanner);
                    break;
                case 2:
                    solveQuadrilateral(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }

    private static void solveTriangle(Scanner scanner) {
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        double area = (base * height) / 2;
        System.out.println("Area of the triangle: " + area);
        
        System.out.print("Enter the lengths of the three sides (a, b, c): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double perimeter = a + b + c;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    private static void solveQuadrilateral(Scanner scanner) {
        System.out.print("Enter the lengths of the four sides (a, b, c, d): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double perimeter = a + b + c + d;
        System.out.println("Perimeter of the quadrilateral: " + perimeter);

        System.out.print("Enter the height of the quadrilateral: ");
        double height = scanner.nextDouble();
        
        double area = ((a + c) / 2) * height; // This is for a trapezoid-like quadrilateral
        System.out.println("Approximate Area of the quadrilateral: " + area);
    }
}
