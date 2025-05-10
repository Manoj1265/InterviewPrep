package basics;

public class WordCounter {

	public static void main(String[] args) {
		
		String str = "program to count the number of words in a string";
		
		String[] words = str.split(" ");
		
		int wordCount = words.length;
		
		System.out.println(wordCount);
	}
}
