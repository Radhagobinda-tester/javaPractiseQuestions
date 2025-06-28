package LeetCodeProblem;

public class MajorElements {
    
    // This method finds the majority element using the Boyer-Moore Voting Algorithm
    public int majorityElements(int[] nums) {
        
        int n = nums.length; // Get the length of the input array
        int freq = 0;        // Frequency counter (used for balance)
        int ans = 0;         // Potential candidate for majority element
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If frequency is zero, choose current element as new candidate
            if (freq == 0) {
                ans = nums[i];
            }
            
            // If current element matches candidate, increment frequency
            if (nums[i] == ans) {
                freq++;
            } else {
                // Otherwise, decrement frequency
                freq--;
            }
        }
        
        // After one pass, 'ans' holds the majority element
        return ans;
    }

    public static void main(String[] args) {
        // Sample input array
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        
        // Create an instance of the class
        MajorElements arr = new MajorElements();
        
        // Call the method and print the result
        System.out.print(arr.majorityElements(nums));
    }
}
