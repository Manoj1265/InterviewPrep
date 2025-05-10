package arrayprep;

public class CountEvenOdd {

//	Write a program to count the number of even and odd numbers in an array of integers.
	public static void main(String[] args) {
		int[] numberArray = { 54, 97, 3, 6, 77, 8, 7 };

		short countEven = 0, countOdd = 0;

		for (int number : numberArray) {
			if (number % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}

		System.out.println("The Even Number count is : " + countEven);
		System.out.println("The Odd Number count is : " + countOdd);
	}
}
