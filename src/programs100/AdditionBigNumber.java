package programs100;

import java.math.BigInteger;
import java.util.Scanner;

public class AdditionBigNumber {

	public static void main(String[] args) {
		System.out.println("Additons of Bigger Numbers");
		System.out.print("Enter Your First Big Number : ");
		Scanner input = new Scanner(System.in);
		String number = input.next();
		System.out.print("Enter Your Second Big Number : ");
		String secondNum = input.next();
		BigInteger firstNumber = new BigInteger(number);
		BigInteger secondNumber = new BigInteger(secondNum);
		BigInteger sum = firstNumber.add(secondNumber);
		System.out.println(sum);
		input.close();
	}
}
