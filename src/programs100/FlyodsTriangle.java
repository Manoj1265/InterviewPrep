package programs100;

import java.util.Scanner;

public class FlyodsTriangle {

	public static void main(String[] args) {
		System.out.print("Enter the number for rows in Flyods Triangle : ");
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		
		int numberToPrint = 1;
		for(int row=1; row<=rows; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(numberToPrint + " ");
				numberToPrint++;
			}
			System.out.println();
		}
		scanner.close();
	}
}
