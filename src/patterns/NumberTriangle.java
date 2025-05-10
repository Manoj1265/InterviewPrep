package patterns;

public class NumberTriangle {

	public static void main(String[] args) {
		decreasingPattern(5);
		System.out.println();
		increasingPattern(5);
	}

	/*
	 * print the following pattern 55555 5555 555 55 5
	 */

	public static void decreasingPattern(int digitToPrint) {

		for (int i = digitToPrint; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(digitToPrint);
			}
			System.out.println();
		}
	}

	/*
	 * print the following pattern 5 55 555 5555 55555
	 */
	public static void increasingPattern(int digitToPrint) {

		for (int i = 1; i <= digitToPrint; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(digitToPrint);
			}
			System.out.println();
		}
	}
}
