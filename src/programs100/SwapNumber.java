package programs100;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to Number Swap without using Third Variable");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your First Number : ");
		int first =input.nextInt();
		System.out.print("Enter Your Second Number : ");
		int second = input.nextInt();
		first = first + second;
		second = first -second;
		first = first-second;
		System.out.printf("Your number are Swaped : \nFirst Number : %d\nSecond Number : %d", first, second);
		input.close();
	}
}
