package javainterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaInterviewQuestions {
    public static void main(String[] args) {
        // Define a map with questions and their corresponding correct answers
        Map<String, String> questionsAndAnswers = new HashMap<>();
        questionsAndAnswers.put("What is Java?", "Java is a general purpose programming language. " +
                "Which is used to develop mobile application, web application, game applications etc. " +
                "Java is robust. " +
                "Java has high security. " +
                "Java has OOP’s concept. " +
                "Java is platform independent. " +
                "Java consists of inbuilt libraries.");
        questionsAndAnswers.put("What is OOP?", "OOP stands for Object-Oriented Programming. " +
                "It is a programming paradigm based on the concept of objects. " +
                "OOP concepts include inheritance, encapsulation, polymorphism, and abstraction.");
        
        questionsAndAnswers.put("What is OOP?", "OOP stands for Object-Oriented Programming. " +
                "It is a programming paradigm based on the concept of objects. " +
                "OOP concepts include inheritance, encapsulation, polymorphism, and abstraction.");

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Iterate through each question
        for (Map.Entry<String, String> entry : questionsAndAnswers.entrySet()) {
            System.out.println(entry.getKey()); // Display the question

            System.out.println("Please provide your answer:");
            String userAnswer = scanner.nextLine(); // Read the user's answer

            // Compare the user's answer with the correct answer
            if (userAnswer.equalsIgnoreCase(entry.getValue())) {
                System.out.println("Correct answer!");
            } else {
                System.out.println("Incorrect answer. Here is the correct answer:");
                System.out.println(entry.getValue());
            }
            System.out.println(); // Add a blank line for readability
        }

        // Close the scanner
        scanner.close();
    }
}

