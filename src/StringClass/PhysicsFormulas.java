package StringClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhysicsFormulas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> formulas = initializeFormulas();

        System.out.println("Physics Formulas Finder");
        System.out.println("Choose a category:");
        System.out.println("1. Mechanics");
        System.out.println("2. Thermodynamics");
        System.out.println("3. Electromagnetism");
        System.out.println("4. Waves");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Mechanics Formulas:");
                    System.out.println("1. Kinematic Equation: v = u + at");
                    System.out.println("2. Newton's Second Law: F = ma");
                    System.out.println("3. Work Done: W = Fd cos(θ)");
                    System.out.println("3. static energy: F = Mgh");
                    break;
                case 2:
                    System.out.println("Thermodynamics Formulas:");
                    System.out.println("1. First Law: ΔU = Q - W");
                    System.out.println("2. Ideal Gas Law: PV = nRT");
                    break;
                case 3:
                    System.out.println("Electromagnetism Formulas:");
                    System.out.println("1. Coulomb's Law: F = k * (q1 * q2) / r^2");
                    System.out.println("2. Ohm's Law: V = IR");
                    break;
                case 4:
                    System.out.println("Waves Formulas:");
                    System.out.println("1. Wave Speed: v = fλ");
                    System.out.println("2. Frequency: f = 1/T");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid category.");
            }

            System.out.println(); // Print a blank line for readability
        }

        scanner.close();
    }

    private static Map<String, String> initializeFormulas() {
        Map<String, String> formulas = new HashMap<>();
        // You can expand this map with more formulas
        formulas.put("Kinematic Equation", "v = u + at");
        formulas.put("Newton's Second Law", "F = ma");
        formulas.put("Work Done", "W = Fd cos(θ)");
        formulas.put("First Law of Thermodynamics", "ΔU = Q - W");
        formulas.put("Ideal Gas Law", "PV = nRT");
        formulas.put("Coulomb's Law", "F = k * (q1 * q2) / r^2");
        formulas.put("Ohm's Law", "V = IR");
        formulas.put("Wave Speed", "v = fλ");
        formulas.put("Frequency", "f = 1/T");
        return formulas;
    }
}
