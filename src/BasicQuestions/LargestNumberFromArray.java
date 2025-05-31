package BasicQuestions;

public class LargestNumberFromArray {
	
	public static void main(String[] args) {
        int[] array = {7, 3, 4, 2, 5}; // Declare and initialize an integer array with some values

        int max = array[0]; // Assume the first element of the array is the largest and assign it to 'max'

        // Loop through the array starting from the second element (index 1)
        for (int i = 1; i < array.length; i++) {
            // If the current array element is greater than the current 'max' value
            if (array[i] > max) {
                max = array[i]; // Update 'max' with the larger value
            }
        }

        // Print the largest element in the array
        System.out.println("Largest element: " + max);
    }


}
