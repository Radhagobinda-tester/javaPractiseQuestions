
package practiseQuestions;

public class FindLargestAndSmalletnumber {
    public static void main(String[] args) {
        
        // Step 1: Initialize the array with some numbers
        int[] array = {15, 25, 5, 70, 3};

        // Step 2: Assume first element is both largest and smallest initially
        int largest = array[0];
        int smallest = array[0];

        // Step 3: Start checking from the second element till the last element
        for (int i = 1; i < array.length; i++) {
            
            // Step 4: If current element is greater than largest, update largest
            if (array[i] > largest) {
                largest = array[i];
            } 
            // Step 5: If current element is smaller than smallest, update smallest
            else if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Step 6: After loop ends, print the largest number
        System.out.println("Largest number = " + largest);

        // Step 7: After loop ends, print the smallest number
        System.out.println("Smallest number = " + smallest);
    }
}
