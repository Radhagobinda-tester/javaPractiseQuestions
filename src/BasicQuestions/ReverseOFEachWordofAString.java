package BasicQuestions;

public class ReverseOFEachWordofAString {

	public static void main(String[] args) {
        String w = "Radha Gobinda Dash";
        w = w.toLowerCase();
        
        String[] s = w.split(" ");
        String result = ""; // Start with an empty string
        
        for (int i = 0; i < s.length; i++) {
            char[] ch = s[i].toCharArray();
            
            // Reversing the current word
            for (int j = ch.length - 1; j >= 0; j--) {
                result += ch[j];  
            }
            
            // Add a space ONLY if it is not the last word
            if (i < s.length - 1) {
                result += " ";
            }
        }
        
        System.out.print("Result:" + result);
    }


}
