package BasicQuestions;

public class AmicableNumber {
	/*Amicable numbers are two distinct natural numbers 
	 * where the sum of the proper divisors
	 *  of each number is equal to the other number. 
	 *  Proper divisors of a number are all its positive divisors excluding the number itself.
	 *   For instance, 220 and 284 are an amicable pair.
	 *  The proper divisors of 220 sum to 284, and the proper divisors of 284 sum to 220. */
//	Creating a  function to check amicable number
	public static int sumOfDivisors(int n) {

        int sum = 1;              // 1 is always a proper divisor for all numbers except 1

        for (int i = 2; i * i < n; i++) {   // loop runs till sqrt(n) using i*i < n
            if (n % i == 0) {               // if i divides n (i is a divisor)

                sum += i;                   // add the small divisor i

                if (i * i != n) {           // check if i is NOT the square root of n
                    sum += n / i;           // add the paired divisor (n/i)
                }
            }
        }
        return sum;                         // return sum of all proper divisors
    }

    public static void main(String[] args) {

        int num1 = 220;                     // first number
        int num2 = 284;                     // second number

        int org1 = sumOfDivisors(num1);     // sum of divisors of num1
        int org2 = sumOfDivisors(num2);     // sum of divisors of num2

        if (num1 == org2 && num2 == org1) { // check amicable condition
            System.out.println("Entered number is a amicable number");
        } else {
            System.out.println("Entered number is not a amicable number");
        }
	}

}
