package LeetCodeProblem;

public class ConvertingStringToInt {
/*Rules:
1.Ignore leading whitespace.

2.Optional + or - sign.

3.Read in digits until a non-digit character or end of the string.

4.Clamp the result to [-2³¹, 2³¹ - 1] if it overflows.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "4193";
		
        System.out.println(StringToInteger(s));
	}
	
	public static int StringToInteger(String s) {
//		Ignore leading whitespace
		s= s.trim();
//		Checking if null is present then return o
		if(s.isEmpty()) {
			return 0;
		}
//		2.Optional + or - sign.
//		 using char at i  found + and - value then - we willl * -1 
		int i=0;
		int sign =1;
		int n = s.length();
		long num =0;
		if(s.charAt(i)=='-'|| s.charAt(i)=='+'){
//			if the - sign then the sign will be -1 or 1
			sign=(s.charAt(i)=='-')? -1 : 1;
			i++;
		}
		
//		3.Read in digits until a non-digit character or end of the string.
		
		while(i<n && Character.isDigit(s.charAt(i))) {
			num = num*10+(s.charAt(i)-'0');
//			
//			Clamp the result to [-2³¹, 2³¹ - 1] if it overflows.
			if(num*sign>Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if(num*sign<Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			i++;
		}
		return (int)(sign*num);
	}

}
