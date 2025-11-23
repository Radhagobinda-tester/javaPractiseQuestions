package BasicQuestions;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("program exectio stated");
	        int num =124;
	        int sum =0;
	        int total=0;
	        while(num>0){
	            sum = num%10;
	            num = num/10;
	           total+=sum;
	        }
	        
	        System.out.print("The total sum : "+total);
	}

}
