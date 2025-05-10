package arrayprep;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfElement {

//	Write a program to count the frequency of each element in an array. Example: Input: [1, 2, 2, 3, 4, 4, 4] Output: 1: 1, 2: 2, 3: 1, 4: 3
	public static void main(String[] args) {
		int[] numbers = { 1, 14, 1, 5, 5, 7, 5, 8, 3 };
		frequencyCountMap(numbers);
		
		String name = "manojprajapatimayaparajapati";
		Map<Character, Integer> chracterCounter = chracterCounter(name);
		System.out.println(chracterCounter);
	}

	// For integers
	public static void frequencyCountMap(int[] arr) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (count.containsKey(num)) {
				count.put(num, count.get(num) + 1);
			} else {
				count.put(num, 1);
			}
		}

		Set<Integer> keySet = count.keySet();
		for (Integer key : keySet) {
			System.out.print(key + " :  " + count.get(key) + ", ");
		}
		System.out.println();
	}

	// For Character
	public static Map<Character, Integer> chracterCounter(String name) {
		char[] charArray = name.toCharArray();

		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char ch : charArray) {
			if (!charCount.containsKey(ch)) {
				charCount.put(ch, 1);
			} else {
				charCount.put(ch, charCount.get(ch) + 1);
			}
		}
		return charCount;
	}
}
