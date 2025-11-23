package BasicQuestions;

public class StrongNumber {
	/*
	 * A Strong Number in Java is a number
	 *  where the sum of the factorials 
	 *  of its individual digits equals the original number 
	 *  itself. For example, 145 is a strong number 
	 *  because 1! + 4! + 5! = 1 + 24 + 120 = 145. */
//	 it will hold the digit value 
	
	public static int calculateFactorial(int n) {
		if(n==0 ||n ==1) {
			return 1;
		}
		int fact =1;
		for(int i=2; i<=n; i++) {
			fact*=i;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num =145;
       int strongNum=0;
       int org = num;
       int digit;
//       Extracting the digit
       while(num>0) {
    	   digit = num%10;
    	   strongNum += calculateFactorial(digit);
    	   num/=10;
    	   
       }
       
       if(org==strongNum) {
    	   System.out.println("Number is strong number");
       }else {
    	   System.out.println("Number is not a  strong number");
       }
	}

}
