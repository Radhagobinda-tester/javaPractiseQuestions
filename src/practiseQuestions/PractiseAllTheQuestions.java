package practiseQuestions;

public class PractiseAllTheQuestions {

	public static void main(String[] args) {
//		get the second highest number and largest number 
		int [] a = {2,1,4,3,9,6,7};
//		Declaring minimum value is the second and first largest number 
		
		int Largestnumber = Integer.MIN_VALUE;
		int Secondlargestnumber = Integer.MIN_VALUE;
//		Writting a advanced for loop iterrating each value 
		for(int num : a){
//	Writting if condition to identify the largest number and assingn value imidiate to the secondlargest number 
			if(num>Largestnumber) {
//				If the another number greater than then assign the largest number is equal to the second largest number 
				Secondlargestnumber = Largestnumber ;
//			if the number s greater than the largest number than the number become th larhgaest number 
				Largestnumber = num;
			}else if(num > Secondlargestnumber && num!=Largestnumber) {
				Secondlargestnumber = num;
			}
			
		}
 System.out.println("The largest number : " + Largestnumber);
 System.out.println("The second largest number : " + Secondlargestnumber);
	}

}
