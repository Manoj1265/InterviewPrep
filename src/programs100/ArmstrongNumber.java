package programs100;

import java.util.Scanner;

public class ArmstrongNumber {
	
	//number that is equal to the sum of its own digits, each raised to the power of the number of digits in the number
	// 3421, digits=4, 3x4 = 12, 4x4=16, 2x4=8, 1x4=4 
	// 3421 = 40 --> Not a Armstrong number
	
	public static void main(String[] args) {
		
		System.out.print("Enter the number to check Armstrong : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		if(isArmstrong(number)) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
		
		rangeOfArmstrong(number);
	}
	
	public static boolean isArmstrong(int number) {
		int originanlNum = number;
		int sum = 0;
		int countOfDigits = String.valueOf(originanlNum).length();
		
		while(originanlNum !=0) {
			int digit = originanlNum%10;
			originanlNum = originanlNum/10;
			sum += Math.pow(digit, countOfDigits);
		}
		return number==sum;
	}
	
	public static void rangeOfArmstrong(int number) {
		
		for(int i=0; i<=number; i++) {
			if(isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
