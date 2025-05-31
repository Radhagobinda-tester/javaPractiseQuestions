package BasicQuestions;

public class PrintEvenWordFromAString {

	public static void main(String[] args) {
		String s  = "Sky is large and vast";
//		Split methos is used to split the string on the basis of space and store all the string on its index like sky is on 0th index
		String [] a = s.split(" ");
//		Writting a for each loop to get the each string 
		for(String word : a) {
			/*System.out.println(word);Sky
			is
			large
			and
			vast */
			
			if(word.length() %2 ==0) {
				System.out.println("The even strings are : " +word);// is and vast
			}
			
		}
		
		

	}

}
