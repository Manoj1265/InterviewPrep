package programs100;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Factorial Program");
		System.out.print("Enter your number : ");
		int number = input.nextInt();
		long factorial = factorials(number);
		System.out.println("Factorial of your number is : "+factorial);
		input.close();
	}

	public static long factorial(int number) {
		int factor = 1;
		if(number<=0) {
			System.out.println("Number should be positive");
			return 0;
		}
		if (number == 1) {
			return factor;
		}
		for(int i=2; i<=number; i++) {
			factor*=i;
		}
		return factor;
	}
	
	public static long factorials(int number) {
		if(number<=0) {
			System.out.println("Number should be positive");
			return 0;
		}
		if (number == 1) {
			return 1;
		}
		return number*factorials(number-1);
	}
	
	
}
