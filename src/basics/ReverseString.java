package basics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String linkedIN = "LinkedIn";
		String reverseStr = reverseStr(linkedIN);
		System.out.println(reverseStr);

		String testing = "FunctionalTesting";
		String reversed = reverseString(testing);
		System.out.println(reversed);

		String name = "manojprajapati";
		String nameReverse = reverseStrWithoutThirdVar(name);
		System.out.println(nameReverse);

		System.out.print("Enter the String : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.print("Enter the word to reverse in given string : ");
		String wordToReverse = scanner.next();
		String finalString = reverseWordInString(str, wordToReverse);
		System.out.println(finalString);
		scanner.close();
	}

	public static String reverseStr(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}

//	Reverse String without using third variable
	public static String reverseStrWithoutThirdVar(String str) {
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length / 2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - 1 - i];
			charArray[charArray.length - 1 - i] = temp;
		}
		return str = new String(charArray);
	}

	// Reverse a word in String
	public static String reverseWordInString(String str, String wordToReverse) {
		StringBuilder sb = new StringBuilder();
		String reverse = "";
		String[] words = str.split(" ");

		if (!str.contains(wordToReverse)) {
			System.out.println("Word " + wordToReverse + " not available in String. Try with another word...");
			return str;
		} else {
			for (String word : words) {
				if (word.equalsIgnoreCase(wordToReverse)) {
					reverse += reverseStr(word);
					sb.append(reverse + " ");
				} else {
					sb.append(word + " ");
				}
			}
			return sb.toString();
		}	
	}
}
