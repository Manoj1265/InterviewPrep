package interviewprogram;

import java.util.ArrayList;
import java.util.List;

public class URLParser {

	public static void main(String[] args) {

		String url = "http://www.example.com/type=search&res=loc";

		String[] splitedURL = url.split("://");
		String protocol = splitedURL[0];
//		System.out.println("Protocol : " + protocol);

		String[] hostAndPair = splitedURL[1].split("/");
		String hostname = hostAndPair[0];
//		System.out.println("Hostname : " + hostname);

		String[] pairs = hostAndPair[1].split("&");

		List<String> attributes = new ArrayList<String>();
		
		for (String pair : pairs) {
			String[] keyValue = pair.split("=");
			attributes.add("[" + keyValue[0] + ":" + keyValue[1] + "]");
		}
//		System.out.println(attributes.toString());
		
		System.out.print(protocol + " " + hostname + " ");
		
		for(String attribute : attributes) {
			System.out.print(attribute);
		}
	}
}
