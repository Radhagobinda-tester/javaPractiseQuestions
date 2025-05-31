package BasicQuestions;

public class findmaxnumberfroanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Declare an array
		
		int[] array = {1,2,3,4,5,6};
		// take first index value of array is max
		int max = array[0];
		// for loop to citreate each code 
		for(int i =0;i<array.length;i++) {
			// check the first array is with other 
			if(array[i]>max) {
				max = array[i];
				
			}
		}
		
		System.out.println("The max number of the array is : "+max);
		
	}

	
	}


