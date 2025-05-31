package BasicQuestions;  // The package declaration defines the directory structure for the class.

import java.util.List;  // Importing List interface to work with lists in Java.
import java.util.Arrays;  // Importing Arrays utility class to easily create a list from an array.

/*The Boyre-Moore Voting Algorithm is used to find the majority element in an array (or list)
 *  where the majority element is the element that appears
 *   more than half of the time in the list.*/
public class MajorityElementProgram {  // Declaring the MajorityElementProgram class to contain the logic for finding the majority element.
    
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {  // Method definition. It takes a List of Integers (A) and returns an int (the majority element).
        int count = 0;  // Initialize count to 0. This will track the frequency of the current candidate.
        int candidate = 0;  // Initialize candidate to 0. This will hold the potential majority element.
        
        for (int i = 0; i < A.size(); i++) {  // Loop through the list A.
            if (count == 0) {  // If count is zero, then the current candidate is no longer valid.
                candidate = A.get(i);  // Set the current element as the new candidate.
            }
            if (A.get(i) == candidate) {  // If the current element matches the candidate...
                count++;  // Increase the count (we’ve seen one more instance of the candidate).
            } else {  // If the current element doesn’t match the candidate...
                count--;  // Decrease the count (we’ve seen a different element, so the candidate's count drops).
            }
        }

        return candidate;  // At the end of the loop, return the majority element (candidate).
    }
}

class TestSolution {  // TestSolution class to test the majorityElement method.
    public static void main(String[] args) {  // Main method, entry point of the program.
        MajorityElementProgram sol = new MajorityElementProgram();  // Create an object of MajorityElementProgram to access its methods.
        List<Integer> A = Arrays.asList(2, 2, 1, 2, 2);  // Define a List A with values.
        int result = sol.majorityElement(A);  // Call the majorityElement method and store the result.
        System.out.println(result);  // Print the result (which will be the majority element).
    }
}
