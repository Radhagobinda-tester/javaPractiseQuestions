package BasicQuestions;

public class CaseConversion {

    public static void main(String[] args) {

        String input = "HeLLo WoRLD";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is lowercase → convert to uppercase
            if (java.lang.Character.isLowerCase(ch)) {
                result = result + java.lang.Character.toUpperCase(ch);
            }
            // If character is uppercase → convert to lowercase
            else if (java.lang.Character.isUpperCase(ch)) {
                result = result + java.lang.Character.toLowerCase(ch);
            }
            // If it's not a letter (space, number, etc.)
            else {
                result = result + ch;
            }
        }

        System.out.println("Original : " + input);
        System.out.println("Converted: " + result);
    }
}

