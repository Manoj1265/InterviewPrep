package basics;

import java.util.Scanner;

public class CountSumOfIntegersString {

	//Extract the numbers from the string and find the sum of numbers
	public static void main(String[] args) {
		System.out.print("Enter the String for the sum of integers in it : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		int sum = sumOfIntegersInString(str);
		System.out.println(sum);
	}
	
	public static int sumOfIntegersInString(String str) {
		int sum = 0;
		char[] characters = str.toCharArray();
		
		for(char character : characters) {
			if(Character.isDigit(character)) {
				sum += Character.getNumericValue(character);
			}
		}
		return sum;
	}
}
