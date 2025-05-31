package BasicQuestions;

import java.util.HashMap;
import java.util.Map;

class Twosum {
    public static int[] twoSum(int[] nums, int target) {  // Made static
        Map<Integer, Integer> numsMap = new HashMap<>(); // number -> index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // checking if the complement is present inside map
            if (numsMap.containsKey(complement)) {
                // if found then return the index numbers
                return new int[] { numsMap.get(complement), i };
            }
            numsMap.put(nums[i], i); // Store the current number and its index in the map
        }
        // Return empty array (although the problem guarantees a solution)
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

