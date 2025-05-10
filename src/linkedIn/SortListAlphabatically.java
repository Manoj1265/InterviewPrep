package linkedIn;

import java.util.Arrays;

public class SortListAlphabatically {

	public static void main(String[] args) {
		char[] alphabates = {'D', 'R', 'L', 'U', 'M', 'N', 'C', 'Y'};
		
		String[] names = {"Manoj", "Ravi", "Pravin", "Maya", "Puranmal"};
		
		int[] numbers = {12, 45,2,89, 7, 6, 6, 69, 52};
		
		String sorted = sortListAlphabatically(numbers);
		System.out.println(sorted);
 		
		String sortednames = sortListAlphabatically(names);
		System.out.println(sortednames);
		
		String sortedAlphabates = sortListAlphabatically(alphabates);
		System.out.println(sortedAlphabates);
	}
	
	public static String sortListAlphabatically(int[] arr) {
		Arrays.sort(arr);
		String string = Arrays.toString(arr);
		return string;
	}
	
	public static String sortListAlphabatically(String[] arr) {
		Arrays.sort(arr);
		String string = Arrays.toString(arr);
		return string;
	}

	public static String sortListAlphabatically(char[] arr) {
		Arrays.sort(arr);
		String string = Arrays.toString(arr);
		return string;
	}
}
