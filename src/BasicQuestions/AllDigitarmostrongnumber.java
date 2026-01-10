package BasicQuestions;

public class AllDigitarmostrongnumber {
	
	    public static void main(String[] args) {
	        System.out.println("Execution started");

	        int num = 1634;
	        int original = num;
	        int digits = 0;
	        int sum = 0;

	        // Count digits
	        int temp = num;
	        while (temp > 0) {
	            digits++;
	            temp /= 10;
	        }

	        // Calculate Armstrong sum
	        temp = num;
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, digits);
	            temp /= 10;
	        }

	        if (sum == original) {
	            System.out.println("The entered number is an Armstrong number");
	        } else {
	            System.out.println("The entered number is NOT an Armstrong number");
	        }
	    }
	}


