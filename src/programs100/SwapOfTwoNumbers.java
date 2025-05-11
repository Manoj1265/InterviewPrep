package programs100;

import java.util.Scanner;

public class SwapOfTwoNumbers {
	public static void main(String[] args) {
		System.out.println("Welcome to number replacer");
		System.out.print("Enter your number : ");
		Scanner input = new Scanner(System.in);
		int first = input.nextInt();
		System.out.print("Now, Enter second number : ");
		int second = input.nextInt();
		int temp;
		temp = first;
		first = second;
		second=temp;
		System.out.printf("Your first number is %d and second number is %d", first, second);
		input.close();
	}
	


}
