package arrayprep;

public class ReverseArray {

//	 Write a program to reverse the elements of an array without using an additional array.
	
	public static void main(String[] args) {
		int[] numberArray = { 54, 97, 3, 6, 8, 7 };

		reverseArrTemp(numberArray);
	}
	
	public static int[] reverseArrTemp(int[] numberArray) {
		System.out.println("The Original Array is : ");
		ReverseArray.printArray(numberArray);
		System.out.println();

		for (int i = 0; i < numberArray.length / 2; i++) {
			int temp = numberArray[i];
			numberArray[i] = numberArray[numberArray.length - 1 - i];
			numberArray[numberArray.length - 1 - i] = temp;
		}
		
		System.out.println("The Reverse Array is : ");
		ReverseArray.printArray(numberArray);
		return numberArray;
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
