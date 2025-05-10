package arrayprep;

public class MergeTwoArrays {
	
//	Write a program to merge two arrays into a single array.
	
	public static void main(String[] args) {
		int[] numberArray = { 54, 97, 3, 6, 77, 8, 7, 65, 46 };
		int arrNum[] = { 12, 11, 13, 14, 15 };

		int[] mergeArr = mergeArr(numberArray, arrNum);
		
		System.out.println("The merged array is : ");
		for (int digit : mergeArr) {
			System.out.print(digit + " ");
		}
	}

	public static int[] mergeArr(int arr1[], int arr2[]) {
		int length1 = arr1.length;
		int length2 = arr2.length;

		int[] mergedArr = new int[length1 + length2];

		int index = 0;
		for (int num : arr1) {
			mergedArr[index++] = num;
		}

		for (int number : arr2) {
			mergedArr[index++] = number;
		}
		return mergedArr;
	}
	
	
}
