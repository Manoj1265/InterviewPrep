package basics;

import java.util.Scanner;

public class FirstCapitalLetter {

	public static void main(String[] args) {
		System.out.print("Enter the statement here : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		char upper = findFirstUppercase(str);
		if(upper == 0) {
			System.out.println("No Uppercase letter found");
		}else {
			System.out.println("The first uppercase letter is : " + upper);
		}
	}
	
	public static char findFirstUppercase(String str) {
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				return str.charAt(i);
			}
		}
		return 0;
	}
}
