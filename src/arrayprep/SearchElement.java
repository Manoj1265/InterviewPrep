package arrayprep;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		int[] numberArray = { 54, 97, 3, 6, 77, 8, 7, 65, 46 };

		boolean searchFound = isSearchFound(numberArray);
		System.out.println(searchFound);
	}

	public static boolean isSearchFound(int[] arr) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to search : ");
		int numberToSearch = scanner.nextInt();

		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == numberToSearch) {
				index = i;
				break;
			}
		}

		scanner.close();
		if (index != -1) {
			System.out.println("The Number " + numberToSearch + " found at index " + index);
			return true;
		} else {
			System.out.println("The Number " + numberToSearch + " not found");
			return false;
		}
	}
}
