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
	
		int sum =1 ;
		for(int i=2; i*i<n; i++) {
			if(n%i==0) {
				sum +=i;
			if(i*i !=n)	{
				sum += n/i;
			}
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 220;
		int num2  = 284;
		int org1 = sumOfDivisors(num1);
		int org2 = sumOfDivisors(num2);
		if(num1==org2 && num2==org1) {
			System.out.println("Entered number is a amicable number");
		}else {
			System.out.println("Entered number is not a  amicable number");
		}
	}

}
