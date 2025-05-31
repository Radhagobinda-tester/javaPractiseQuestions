package BasicQuestions;

import java.util.Scanner;

public class CountTheChangingKey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word you want to count the character changes: ");
        
        String word = sc.nextLine();
        word = word.replaceAll("\\s", "");

        if (word.length() == 0) {
            System.out.println("Empty input. Please enter a valid word.");
            sc.close();
            return;
        }

        int count = 0;

        char lastKey = java.lang.Character.toLowerCase(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {
            char currentKey = java.lang.Character.toLowerCase(word.charAt(i));
            if (currentKey != lastKey) {
                count++;
            }
            lastKey = currentKey;
        }

        System.out.println("Number of character changes: " + count);
        sc.close();
    }
}
