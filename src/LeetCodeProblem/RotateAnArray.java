package LeetCodeProblem;

public class RotateAnArray {
	
//	 Creatong a method to reverse the array
	public static void reverse(int[] nums, int start, int end) {
		while(start<end) {
			int t = nums[start];
			nums[start] = nums[end];
			nums[end]=t;
			start++;
			end--;
		}
	}
	
	public static void rotate(int [] nums, int k ) {
		
		 k = k%nums.length;
		 if(k<0) {
			 k = k+nums.length;
		 }
		 reverse(nums, 0, nums.length - k - 1);
		 reverse(nums, nums.length - k, nums.length - 1);
		 reverse(nums, 0, nums.length - 1);

		
	}
	public static void main(String[] args) {
	int [] nums = {1,2,3,4,5,6,7};
	for(int i=0; i<nums.length;i++) {
		System.out.print(nums[i]);
	}
	
	System.out.println("\nAfter rotating by :");
	rotate(nums, 3);
	for(int i=0; i<nums.length;i++) {
		System.out.print(nums[i]);
	}
	}

}
//  https://www.youtube.com/watch?v=oABQlhrhXzg - video link 

