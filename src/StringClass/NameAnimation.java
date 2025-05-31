package StringClass;

public class NameAnimation {

    public static void main(String[] args) {
        String name = "Trilok"; // Replace with your desired name
        animateName(name);
    }

    private static void animateName(String name) {
        for (int i = 0; i <= name.length(); i++) {
            System.out.print("\r" + name.substring(0, i)); // Print the substring
            try {
                Thread.sleep(300); // Pause for 300 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
        System.out.println(); // Move to the next line after animation
    }
}
