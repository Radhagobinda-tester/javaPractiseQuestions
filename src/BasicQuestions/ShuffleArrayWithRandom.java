package BasicQuestions;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArrayWithRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("The program which contains shuffle array");
	// intilize and declare an array
	int[] array = {1,2,3,4,5,6,7};
	
	// Creating an object 
	
	Random rand = new Random();
	
	// Ceating a for loop traversing from right to left 
	for(int i = array.length -1; i>0; i-- ) {
		
		// creatig a j which will make shuffle
		int j =rand.nextInt(i+1);
		
		
		 // Using swapping method to shuffle the array
        int temp = array[i];  // Store array[i] in temp
        array[i] = array[j];  // Assign array[j] to array[i]
        array[j] = temp;      // Assign temp to array[j]
	}
  System.out.print(Arrays.toString(array));
	}

}
