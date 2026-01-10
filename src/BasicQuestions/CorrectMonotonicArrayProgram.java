package BasicQuestions;

public class CorrectMonotonicArrayProgram {

	public static boolean isMonotonic(int[] a) {
		return (isIncreasing(a) || isDecreasing(a));
	}

	public static boolean isDecreasing(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				return false;
			}

		}
		return true;
	}

	public static boolean isIncreasing(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Program execution started");
		int[] a1 = { 1, 2, 4, 5, 6 }; // Monotonic (Increasing)
		int[] a2 = { 6, 5, 4, 2, 1 }; // Monotonic (Decreasing)
		int[] a3 = { 1, 5, 2, 4 };

		System.out.println(isMonotonic(a1));
		System.out.println(isMonotonic(a2));
		System.out.println(isMonotonic(a3));

	}

}
