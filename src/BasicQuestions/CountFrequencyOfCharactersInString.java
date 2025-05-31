package BasicQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfCharactersInString {

    public static void main(String[] args) {
        String s = "Radha"; // Input string
        char[] ch = s.toCharArray(); // Convert to character array

        // Create a LinkedHashMap to maintain order of characters
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        // Loop through each character and count its frequency
        for (char x : ch) {
            // Manual boxing: char → Character, int → Integer
            frequency.put(Character.valueOf(x),
                          Integer.valueOf(frequency.getOrDefault(Character.valueOf(x), 0) + 1));
        }

        // Print the results
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

