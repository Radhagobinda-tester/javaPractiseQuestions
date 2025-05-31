package LeetCodeProblem;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	nums1[] = {1,2,3,0,0,0};
				int m =3;
	int    nums2[] = {2,5,6};
				int n =3;
				/*
	Output [1,2,2,3,5,6]
	Expected [1,2,2,3,5,6]
	You tube link : https://www.youtube.com/watch?v=-1cLK6PaLsQ&t=2362s 
				*/
				MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
		        obj.merge(nums1, m, nums2, n);

		        System.out.println("Merged array: " + Arrays.toString(nums1));
	}
	
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        // Declaring the the last index 
	        int idx = m+n-1, i = m-1, j = n-1;
	        // Writting a while loop 
	        while(i>=0 && j>=0){
	          if(nums1[i]>nums2[j]){        

	            nums1[idx]=nums1[i];
	            idx--;
	            i--;
	          }
	          else {
	            nums1[idx]=nums2[j];
	            idx--;
	            j--;
	          }

	        }
	        while(j>=0){
	            nums1[idx]=nums2[j];
	            idx--;
	            j--; 
	        }
	    }
	}


