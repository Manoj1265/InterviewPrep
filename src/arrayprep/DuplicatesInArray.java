package arrayprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 12, 1, 12, 1, 6 };

		List<Integer> duplicatesInArray = duplicatesInArray(arr);
		System.out.println(duplicatesInArray.toString());
		
		Map<Integer, Integer> duplicatesMap = duplicatesElements(arr);
		if (duplicatesMap.isEmpty()) {
			System.out.println("No Duplicates are found!");
		} else {
			Set<Integer> keySet = duplicatesMap.keySet();
			for (Integer key : keySet) {
				System.out.print(key + " ");
			}
			System.out.print("are the duplicate elements");
		}
	}

	//Using List
	public static List<Integer> duplicatesInArray(int[] arr) {
		List<Integer> duplicates = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					if (!duplicates.contains(arr[i])) {
						duplicates.add(arr[i]);
					}
				}
			}
		}
		return duplicates;
	}
	
	//Using Map
	public static Map<Integer, Integer> duplicatesElements(int[] numbers) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					if (!map.containsKey(numbers[i])) {
						map.put(numbers[i], 1);
					} else {
						map.put(numbers[i], map.get(numbers[i] + 1));
					}
				}
			}
		}
		return map;
	}
}
