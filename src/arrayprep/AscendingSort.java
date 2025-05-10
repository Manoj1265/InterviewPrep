package arrayprep;

public class AscendingSort {

	// sorting of array in ascending order - (Bubble Sort)
	public static void main(String[] args) {

		int[] arr = { 12, 7, 94, 18, 1, 4, 56, 65 };
		
		int[] bubbleSort = bubbleSort(arr);

		for (int number : bubbleSort) {
			System.out.print(number + " ");
		}
	}
	
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
