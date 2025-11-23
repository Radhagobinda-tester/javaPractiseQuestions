package LeetCodeProblem;

public class LongestCommonSubString {
	
	// Method to find the length of the Longest Common Substring between two strings
	public static int longestCommonSub(String m, String n) {

		int max = 0; // variable to store the maximum length found so far

		// Convert both strings into character arrays for easy comparison
		char[] str1 = m.toCharArray();
		char[] str2 = n.toCharArray();

		// Create a 2D DP (Dynamic Programming) table
		// dp[i][j] will store the length of the longest common substring
		// that ends with str1[i-1] and str2[j-1]
		int[][] dp = new int[str1.length + 1][str2.length + 1];

		// Loop through all characters of both strings
		for (int i = 1; i <= str1.length; i++) {
			for (int j = 1; j <= str2.length; j++) {

				// If characters match, extend the previous substring length by 1
				if (str1[i - 1] == str2[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;

					// Update the max length if a longer substring is found
					max = Math.max(dp[i][j], max);
				}

				// If characters do not match, dp[i][j] remains 0
				// (we don’t explicitly assign 0 because default value is already 0)
			}
		}

		// Return the maximum length of the longest common substring
		return max;
	}

	public static void main(String[] args) {
		
		// Input strings to test the algorithm
		String m = "zabcde";
		String n = "azbcdt";

		// Call the function and print the result
		System.out.println("Length of Longest Common Substring: " + longestCommonSub(m, n));
	}
}

//   https://www.youtube.com/watch?v=hj-HDHwifWs - video link 

