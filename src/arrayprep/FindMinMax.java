package arrayprep;

public class FindMinMax {
	
//	Write a program to find the maximum and minimum values in an array of integers.

	public static void main(String[] args) {
		int[] elements = { 40, 31, 654, 1, -7, 3, 6, 12, 60, 42 };

		int min = elements[0], max = elements[0];

		for (int i = 1; i < elements.length; i++) {
			if (elements[i] < min) {
				min = elements[i];
			}

			if (elements[i] > max) {
				max = elements[i];
			}
		}

		System.out.println("The minimum number is : " + min);
		System.out.println("The maximum number is : " + max);
	}
}
