package BasicQuestions;

public class MedianOfTwoSortedArrUsingBinarySearch {

	public static float findthemedian(int arr1[], int arr2[]) {

		// First logic we will make the array1 smaller
		if (arr2.length < arr1.length) {
			// By using metod recursive method we will swap the array 
			return findthemedian(arr2, arr1);
		}
		int l = 0, h = arr1.length;

		// Writting a while condition
		while (l <= h) {
			int m1 = (l + h) / 2;
			int m2 = ((arr1.length + arr2.length + 1) / 2) - m1;

			/* Writting a ternary operator to find the true and false condition. 
			   If the condition is true, whatever you have written will execute;
			   if it is false, then whatever you have written after colon will execute
			*/
			int l1 = (m1 == 0) ? Integer.MIN_VALUE : arr1[m1 - 1];
			int r1 = (m1 == arr1.length) ? Integer.MAX_VALUE : arr1[m1];

			int l2 = (m2 == 0) ? Integer.MIN_VALUE : arr2[m2 - 1];
			int r2 = (m2 == arr2.length) ? Integer.MAX_VALUE : arr2[m2];

			if (l1 <= r2 && l2 <= r1) {
				// Finding the median value 
				if ((arr1.length + arr2.length) % 2 == 0) {
					return (float) ((Math.max(l1, l2) + Math.min(r1, r2)) / 2.0);
				} else {
					return (float) Math.max(l1, l2);
				}
			} else if (l1 > r2) {
				// Move m1 to left and move m2 to right 
				h = m1 - 1;
			} else {
				// Move m1 to right and move m2 to left 
				l = m1 + 1;
			}
		}

		return 0.0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 3};
		int[] arr2 = {2};

		System.out.println(findthemedian(arr1, arr2));
	}
}
//  https://www.youtube.com/watch?v=WQ1STBnmx2w - the UTl which we got good solution is this URL 