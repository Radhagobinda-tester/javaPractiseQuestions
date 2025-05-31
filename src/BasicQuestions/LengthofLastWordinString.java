package BasicQuestions;

public class LengthofLastWordinString {

	public static void main(String[] args) {
		String s = "Hello World";
		int count =0;
//		Removing the trailing spaces from strting and ending from the string 
		s =s.trim();
//		Converting the string to array
		char [] ch = s.toCharArray();
//		Writting a for loop traversing from right to left <------------------------------
		for(int i=ch.length-1;i>=0;i--) {
			
//			Writting a if conditiuon if the index is not equal the space the count should increase 
			if(ch[i]!=' ') {
				count++;
			}else if (count>0){
				break;
				
			}
			
		}
		System.out.println("The count of last string is : "+ count);
	}

}
