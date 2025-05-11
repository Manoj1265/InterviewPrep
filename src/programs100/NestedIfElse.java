package programs100;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		System.out.println("Welcome to Marks and grade Calculator");
		final int marksToPass = 40;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter marks obtained :");
		int marksObtained = input.nextInt();
		char grade;
		if (marksObtained > marksToPass) {
			if (marksObtained > 90) {
				grade = 'A';
			} else if (marksObtained > 75) {
				grade = 'B';
			} else if (marksObtained > 50) {
				grade = 'C';
			} else {
				grade = 'D';
			}
			System.out.println("Congratualtions! You are Passed with grade " + grade);
		} else {
			grade = 'F';
			System.out.println("Sorry! You are failed and your grade is : " + grade);
		}
		input.close();
	}
}
