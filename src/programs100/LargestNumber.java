package programs100;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to largest number finder");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int x = input.nextInt();
		System.out.print("Enter Your Number : ");
		int y = input.nextInt();
		System.out.print("Enter Your Number : ");
		int z = input.nextInt();
		if (x > y && x > z) {
			System.out.println(x + " is the largest Number");
		} else if (y > z) {
			System.out.println(y + " is the largest Number");
		} else {
			System.out.println(z + " is the largest Number");
		}
		input.close();
	}
}
