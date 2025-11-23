package javainterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaInterviewwordQuestions {
    public static void main(String[] args) {
        // Questions and correct answers
        Map<String, String> questions = new LinkedHashMap<>();
        questions.put("What is Java?", "Java is a general-purpose programming language used to develop mobile applications, web applications, game applications, etc. It is robust, has high security, supports OOP concepts, is platform-independent, and consists of inbuilt libraries.");
        questions.put("Why is Java platform independent?", "A source code created using Java is not directly converted into native machine language. Instead, it is converted into an intermediate machine language known as bytecode. This bytecode can be executed on any platform that has JDK installed.");
        questions.put("What is the extension of bytecode and who creates it?", "The extension of bytecode is .class, and it is created by the compiler.");
        questions.put("Difference between JDK, JVM & JRE?", "JVM stands for Java Virtual Machine. It is a specification that provides a runtime environment for executing Java bytecode. JRE stands for Java Runtime Environment, which provides a runtime environment to the user. It consists of the JVM and libraries. JDK stands for Java Development Kit, which provides a development environment for developers. It is a combination of JRE and development tools.");
        questions.put("What is a token?", "A token is the smallest part available in a programming language. There are three types: Keyword, Identifier, and Literals.");
        questions.put("What is a keyword?", "A keyword is a predefined word in Java. There are 52 keywords in Java, and they are always written in lowercase. Examples: public, static, void, main.");
        questions.put("What is an identifier?", "An identifier is a name provided to an element or component of Java by the programmer. Components can include classes, methods, variables, interfaces, and packages.");
        questions.put("What are literals?", "Literals are different types of values used in programming languages. Examples include character literals, number literals, and boolean literals.");
        questions.put("What are data types?", "Data types specify what type of data can be stored in a variable. They are categorized into two types: Primitive types and Non-Primitive types.");
        questions.put("What are primitive types?", "Primitive types are used to store all types of literals except string literals. Examples: byte, short, int, long, float, double, char, and boolean.");
        questions.put("What are non-primitive types?", "Non-primitive data types include String, class, interface, and arrays.");
        questions.put("What is a variable?", "A variable is a container where data can be stored. Variables are classified into two types: Global and Local.");
        questions.put("What is a global variable?", "A global variable is declared inside a class block and can be of two types: Static and Non-Static.");
        questions.put("What is a static variable?", "A static variable is declared inside the class and prefixed with the static keyword. It is stored in the class's static area.");
        questions.put("What is a non-static variable?", "A non-static variable is declared inside the class and not prefixed with the static keyword. It is stored on an object or heap area.");
        questions.put("What is a local variable?", "A local variable is declared inside a method or block and does not have a default value. It is stored in the stack area.");
        questions.put("What is type casting?", "Type casting is the process of converting one type of primitive data type into another.");
        questions.put("What is widening?", "Widening is the process of converting a smaller primitive data type to a larger primitive data type. It is done automatically by the compiler.");
        questions.put("What is Narrowing?", "The process of converting a bigger primitive data type to a smaller primitive data type is called Narrowing.");
        questions.put("What is Derived/Non-Primitive Type Casting?", "The process of converting the reference from one type to another type is called Non-Primitive Type Casting. It requires an \"is-a\" relationship.");
        questions.put("What is Upcasting?", "Upcasting is converting a reference from a subclass to a superclass. It happens automatically.");
        questions.put("What is Downcasting?", "Downcasting is converting a reference from a superclass to a subclass. It cannot be done implicitly and requires explicit type casting.");
        questions.put("What is a ClassCastException?", "If a superclass object is downcasted to a subclass without an instance of that subclass, a ClassCastException is thrown.");
        questions.put("What is a Method?", "A method is a set of instructions written to perform a particular task.");
        questions.put("What is the Method Signature?", "[Access Modifier] [Modifier] [Return Type] [Method Name] [Formal Arguments]");
        questions.put("What are Access Modifiers?", "public, private, default, protected");
        questions.put("What are Modifiers?", "static, synchronized, final, abstract, volatile");
        questions.put("What is the void Return Type?", "It means the method returns nothing.");
        questions.put("What is the Actual Argument?", "It is a value passed in the method call statement.");
        questions.put("What is the Formal Argument?", "A variable declared in the method declaration statement.");
        questions.put("What is a Constructor?", "A special type of non-static method with the same name as the class name, used to initialize non-static members.");
        questions.put("What is a Default Constructor?", "A constructor added by the compiler if no constructor is defined, initializing variables to default values.");
        questions.put("What is a Parameterized Constructor?", "A constructor used to initialize non-static variables during object creation.");
        questions.put("What is a Class?", "A blueprint of an object and a non-primitive data type.");
        questions.put("What is an Object?", "A block of memory created in the heap area during runtime.");
        questions.put("What are the Pillars of OOP?", "Encapsulation, Inheritance, Polymorphism, Abstraction, Interface");
        questions.put("What is Encapsulation?", "Encapsulation is the process of wrapping data members and behavior together in an object.");
        questions.put("What is Data Hiding?", "Restricting direct access to data members using private keywords and controlling access through methods.");
        questions.put("What are Getter and Setter Methods?", "Getter: Used to read private data. Setter: Used to modify private data.");
        questions.put("What is Inheritance?", "The process of acquiring properties and behavior from a parent class to a child class using the extends keyword.");
        questions.put("Types of Inheritance:", "Single, Multiple, Hierarchical, Multilevel, Hybrid");
        questions.put("What is Multiple Inheritance?", "It involves two or more superclasses and one subclass, leading to ambiguity or the diamond problem.");
        questions.put("What is the super Keyword?", "Used to call the constructor of the superclass.");
        questions.put("What is the this Keyword?", "Used to call the constructor of the same class.");
        questions.put("What is Polymorphism?", "The ability of an object to take multiple forms.");
        questions.put("What are the Types of Polymorphism?", "Compile-time Polymorphism (Method/Constructor Overloading), Runtime Polymorphism (Method Overloading and Downcasting)");
        questions.put("What is Method Overloading?", "Having multiple methods with the same name but different arguments in the same class.");
        questions.put("What is Method Overloading?", "Overloading a superclass method in a subclass to provide a new implementation.");
        questions.put("What is Abstraction?", "Hiding implementation details and only showing essential features.");
        questions.put("What is an Abstract Class?", "A class that can contain both abstract and concrete methods. An object cannot be created for an abstract class.");
        questions.put("What is an Interface?", "A non-primitive user-defined data type that provides 100% abstraction.");
        questions.put("What are the Members of an Interface?", "Abstract Non-Static Methods, Static Concrete Methods, Static Final Variables");
        questions.put("What is the final Keyword?", "Used to declare constants or prevent modification of variables, methods, or inheritance of classes.");

        // Map to store user answers
        Map<String, String> userAnswers = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Ask each question and collect user answers
        for (String question : questions.keySet()) {
            System.out.println("\nQuestion: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            userAnswers.put(question, answer);
        }

        scanner.close();

        // Check answers and display results
        System.out.println("\n--- Checking answers ---");
        for (Map.Entry<String, String> entry : questions.entrySet()) {
            String question = entry.getKey();
            String correctAnswer = entry.getValue();
            String userAnswer = userAnswers.getOrDefault(question, "");

            System.out.println("Question: " + question);
            System.out.println("Your answer: " + userAnswer);
            System.out.println("Correct answer: " + correctAnswer);

            // Compare answers and display result
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Result: Correct!");
            } else {
                System.out.println("Result: Incorrect.");
            }
            System.out.println();
        }
    }
}
