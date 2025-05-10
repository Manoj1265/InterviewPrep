package basics;

public class Palindrom {

	public static void main(String[] args) {
		boolean palindromString = isPalindromString("Madam");
		System.out.println(palindromString);
		
		System.out.println();
		
		boolean palindromNumber = isPalindromNumber(4344);
		System.out.println(palindromNumber);
	}
	
	public static boolean isPalindromString(String name) {
		String reverse = "";
		for(int i=name.length()-1; i>=0; i--) {
			reverse += name.charAt(i);
		}
		
		System.out.println("Reversed String is : " + reverse);
		
		if(name.equalsIgnoreCase(reverse)) {
			System.out.println("The String is Palindrom");
			return true;
		}else {
			System.out.println("The String is Not Palindrom");
			return false;
		}
	}
	
	public static boolean isPalindromNumber(int number) {
		System.out.println("The number is : " + number);
		int originalNumber = number;
		int reverse = 0;
				
		while(number != 0) {
			int digit = number%10;
			reverse = reverse*10 + digit;
			number = number/10;
		}
		
		System.out.println("The reverse number is : " + reverse);
		
		if(originalNumber == reverse) {
			System.out.println("The number is Palindrom");
			return true;
		}else {
			System.out.println("The number is Not Palindrom");
			return false;
		}
	}
}
