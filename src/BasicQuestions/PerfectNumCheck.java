package BasicQuestions;

public class PerfectNumCheck {
	
	public static boolean isPerfect(int num) {
		
		if(num<=1) {
			return false;
		}
		int sumOfNumber =1;
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) {
				sumOfNumber +=i;
				
				if(i*i!=num) {
					sumOfNumber +=num/i;
				}
			}
			
		}
		return sumOfNumber==num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = 6;
       System.out.println(isPerfect(num));
	}

}
