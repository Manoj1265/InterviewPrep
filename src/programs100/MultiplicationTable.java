package programs100;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int number, count;
		
		System.out.print("Enter the number for multiplication table : ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		System.out.println("Multiplication of " + number + " is : ");
		for(count=1; count<=10; count++) {
			System.out.println(number + "*" + count + " = " + number*count);
		}
		scanner.close();
	}
}
