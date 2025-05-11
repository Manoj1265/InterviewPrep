package programs100;

import java.util.Scanner;

public class FeranhiteToCelcius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Feranhite to Celcius Calculator");
		System.out.print("Enter Temperature in Feranhite : ");
		int tempFeranhite = input.nextInt();
		int celcius = ((tempFeranhite-32)*5)/9;
		System.out.println("Current Temprature in Celcius is : "+celcius);
		input.close();
	}
}
