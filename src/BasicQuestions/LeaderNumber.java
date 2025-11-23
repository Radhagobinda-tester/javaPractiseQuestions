package BasicQuestions;

public class LeaderNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given an array of integers, a leader is an element that is greater
		  than or equal to all
		  the elements to its right.
		  The rightmost element is always a leader.*/
		// declaring the integer array 
		int [] a = {16,17,4,3,5,2};
//		Declaring the last index is lastleader number
		int length = a.length; 
		int rightMax = a[length-1];
		System.out.println(rightMax);
//		writing a for loop traversing from left to right 
		for(int i = a.length-2; i>=0; i--) {
			
//			wriing a if condition 
			if(a[i]>rightMax) {
				rightMax = a[i];
				System.out.println("The leader number is "+rightMax);
			}
		}

}
}
