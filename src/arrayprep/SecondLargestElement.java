package arrayprep;

public class SecondLargestElement {

//	Write a program to find the second largest element in an array.
	
	public static void main(String[] args) {
		int[] numberArray = { 54, 97, 3, 6, 177, 8, 7, 65, 46 };

		int secondLargest = secondLargestNum(numberArray);

		System.out.println("The second Largest number is : " + secondLargest);
	}
	
	public static int secondLargestNum(int[] numberArray) {
		int largestNumber = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int number : numberArray) {
			if (number > largestNumber) {
				secondlargest = largestNumber;
				largestNumber = number;
			} else if (number > secondlargest && number != largestNumber) {
				secondlargest = number;
			}
		}
		return secondlargest;
	}
}
