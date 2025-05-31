package BasicQuestions;

public class MonotonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      creating an array 
//		monotnis array is to check the array is decreasing or increasing 
		boolean decreasing = true;
		boolean increasing = true;
		
		int [] array = {1,2,3,};
//		using a for loop 
		for(int i =1; i<array.length; i++) {
			
			if(array[i-1]<array[i]) {
				
				decreasing = false;
			}else if(array[i-1]>array[i]){
				
				increasing = false;
			}
		}
		System.out.println(increasing || decreasing );
		
	}

	
}
