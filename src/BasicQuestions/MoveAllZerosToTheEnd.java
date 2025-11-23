package BasicQuestions;

public class MoveAllZerosToTheEnd {

	public static void main(String[] args) {
		int [] a = {1,0,2,0,3,0};
		int temp, putnonZerovalues =0;
//		 Writting a for loop 
		for(int current =0; current<a.length;current++) {
//			Writting if condition to check the index of value is non zero then we swap the values 
			if(a[current]!=0) {
//		Doing swapping 
			 temp = a[putnonZerovalues];
			a[putnonZerovalues]=a[current];
			 a[current]=temp;
			putnonZerovalues++;
		}
	}
		for(int num :a)
System.out.println(num + " ");
	}}
//  You tube link : https://www.youtube.com/watch?v=V0vmGwinHrg 