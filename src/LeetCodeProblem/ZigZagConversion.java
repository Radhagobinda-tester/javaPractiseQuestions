package LeetCodeProblem;

public class ZigZagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        ZigZagConversion n = new ZigZagConversion();
        String r = n.convert(s, numRows);
        System.out.println(r);
    }

    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        // Creating a String array
        String[] ans = new String[numRows];

        // Initialize each row to empty string
        for (int i = 0; i < numRows; i++) {
            ans[i] = "";
        }

        int i = 0;
        while (i < s.length()) {
            // Traverse downward
            for (int index = 0; index < numRows && i < s.length(); index++) {
                ans[index] += s.charAt(i++);
            }
            
            /*numRows = 4 → so numRows - 2 = 2

i = 4 (we’ve already used 4 letters: "P", "A", "Y", "P")

s = "PAYPALISHIRING"*/

            // Traverse upward (diagonal)
            for (int index = numRows - 2; index > 0 && i < s.length(); index--) {
                ans[index] += s.charAt(i++);
            }
        }

     // Step 6: Join all rows together
        String res = "";
        for (String str : ans) {
            res += str;
        }

        return res;
    }
}
