package BasicQuestions;

public class MountainArrayProblem {

	public static void main(String[] args) {
		int [] a = {1,3,5,10,4,3,2,1,0};
		System.out.println(mountainCheckArray(a));

	}

	private static boolean  mountainCheckArray(int[] a) {
//		1. First condition to check wheteher the array is greater than 2 
		if(a.length<3) {
			return false;
		}
//	2. check it is strictly increasing and the array length should be greater that than current length 
//		writing the varaible which able to check our pointer 
		int i =0;
		while(i+1 <a.length && a[i]<a[i+1]) {
			i++;
		}
//		3. check it is strictly dereasing and the array length should be greater that than current length 
		while(i+1 <a.length && a[i]>a[i+1]) {
			i++;
		}
		System.out.println(i);
// wtriting the codition i should be equal the length of array
		if(a.length-1 == i) {
			return true;
		}else {
			return false;
		}
		
	}

}
