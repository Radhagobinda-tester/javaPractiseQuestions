package BasicQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostfrequentCharacterFromAString {

    public static void main(String[] args) {
        String s = "banana";
        
        // Use a HashMap with Character and Integer types
        Map<Character, Integer> map = new HashMap<>();
        
        // Count the frequency of each character (your original counting loop)
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Autoboxing automatically converts the primitive 'char' to a 'Character' object,
            // and the primitive 'int' count to an 'Integer' object when calling map.put()
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // --- Logic to find the most frequent character ---
        char mostFrequentChar = ' ';
        int maxCount = 0;

        // Iterate through the map entries to find the maximum count
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }
        
        System.out.println("Original String: " + s);
        System.out.println("Character Frequency Map: " + map);
        System.out.println("Most frequent character: '" + mostFrequentChar + "' with count of " + maxCount);
    }
}
