package BasicQuestions;

public class LowestCommonDivisor {
	public static int findGCD(int a, int b) {
		int temp;
		while(b!=0) {
			temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	public static int findLCM(int a, int b) {
		int abs1 = Math.abs(a);
		int abs2 = Math.abs(b);
		int gcd = findGCD( abs1, abs2 );
		int lcm = (abs1*abs2)/gcd;
		return lcm;
	}

	public static void main(String[] args) {
		int num1 =18;
		int num2 =12;
		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + findLCM(num1, num2));

	}

}
