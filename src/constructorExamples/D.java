package constructorExamples;

class D {
    // Default constructor
    D() {
        this('c'); // Calls the char constructor
        System.out.println("From D");
    }

    // Constructor with an int parameter
    D(int a) {
        this(); // Calls the default constructor
        System.out.println("From D(int)");
    }

    // Constructor with a char parameter
    D(char c) {
        System.out.println("From D(char)");
    }

    public static void main(String[] args) {
        D obj = new D(10); // Calls the int constructor
    }
}

