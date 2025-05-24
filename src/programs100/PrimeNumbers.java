package programs100;

import java.util.Scanner;

public class PrimeNumbers {

	// Prime numbers are the numbers that divides by 1 and itself.
	public static void main(String[] args) {

		System.out.println("Enter the number to check number is Prime or not");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();

		boolean prime = isPrime(number);
		if (prime) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
		
		System.out.println("Here is the prime numbers till " + number);
		rangeOfPrimeNumbers(number);

		sc.close();
	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			System.out.println("The number should be positive and Prime numbers starts from 2");
			return false;
		}

		// if the count remains 0, means it's a prime number
		// as the loops starts from 2 and goes till number-1 which eliminates the 1 and itself. so count should remain 0.
		int count = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 0) {
			return true;
		}
		return false;
	}
	
	public static void rangeOfPrimeNumbers(int number) {
		//Here we can store these numbers in Array and can return that array
		for(int i=2; i<=number; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
