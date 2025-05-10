package basics;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
//		remove all the white spaces in a string 
		
		String str = "my name is manoj";
		
		String repalcedWS = str.replaceAll(" ", "");
		
		System.out.println(repalcedWS);
	}
}
