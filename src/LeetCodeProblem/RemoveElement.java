package LeetCodeProblem;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] nums = {3,2,2,3};
	int val =3;
	System.out.println(removeElement(nums,val));
// Youtube link : https://www.youtube.com/watch?v=QrCds_6NiSk 
	
	}

	
	

	
	    static int removeElement(int[] nums, int val) {
	    // using a variable as count 
	    int count =0;
	    // Writting a for loop to store the value 
	    for(int i =0; i<nums.length; i++){
	        if(nums[i]!=val){
	            nums[count]= nums[i];
	            count++;
	        }
	    }
	    return count ;
	    }
	}

