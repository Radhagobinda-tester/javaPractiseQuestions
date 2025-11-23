package BasicQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int array [] = {1,2,4,5,6};
		int totalnumber = 6;
		int sumofAllNumbers = (totalnumber*(totalnumber+1))/2;
		System.out.println(sumofAllNumbers);
		int sumOfArray = 0;
		for(int i =0; i<=array.length-1; i++) {
			sumOfArray = array[i]+sumOfArray;
		}
System.out.println("The missing number is : " + (sumofAllNumbers - sumOfArray) );
	}

}
