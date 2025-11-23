package LeetCodeProblem;

public class ReverseAnArray {
//	 Creating a method 
	public static void reverse(int [] nums) {
		int i = 0;
		int j = nums.length-1;
		while(i<j) {
			int t = nums[i];
			nums[i]=nums[j];
			nums[j]=t;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
      for(int i=0; i<nums.length; i++) {
    	  System.out.print(nums[i]);
      }
      
      System.out.println();
      reverse(nums);
      for(int i=0; i<nums.length; i++) {
    	  System.out.print(nums[i]);
      }
	}

}
//  https://www.youtube.com/watch?v=80auISlKy50 - video link 
