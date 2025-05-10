package arrayprep;

public class SumOfElements {

//	Write a program to take an array of integers as input and calculate the sum of all elements in the array.

	public static void main(String[] args) {
		int[] elements = { 40, 31, 3, 6, 12, 60, 42 };
		
		int sum = sumOfElements(elements);

		System.out.println("The Sum of all the numbers is : " + sum);
	}

	public static int sumOfElements(int[] arr) {
		int sum = 0;
		for (int number : arr) {
			sum += number;
		}
		return sum;
	}
}
