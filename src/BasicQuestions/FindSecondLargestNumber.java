package BasicQuestions;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
    	
    	/* System.out.print("Enter numbers separated by space: ");
        String line = scanner.nextLine(); // Read full line input

        String[] strNumbers = line.split(" "); // Split by space
        int[] numbers = new int[strNumbers.length]; */
    	
        // Creating an integer array
        int[] array = {1, 2, 3, 4, 5, 6};

        // Initialize first and second largest numbers with the smallest possible values
        int firstLargest = Integer.MIN_VALUE; // -234535435343
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the largest and second largest numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {  
                // If current element is greater than firstLargest, update both
                secondLargest = firstLargest; // Previous firstLargest becomes secondLargest
                firstLargest = array[i]; // Update firstLargest
            } 
            else if (array[i] > secondLargest && array[i] != firstLargest) { 
                // If current element is not the largest but greater than secondLargest, update secondLargest
                secondLargest = array[i];
            }
        }

        // If secondLargest is still MIN_VALUE, that means no valid second largest number was found
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
