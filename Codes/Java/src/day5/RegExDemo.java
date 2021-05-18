package day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		String s = "Burn your Ego before it burns you";
		
		Pattern p = Pattern.compile("ego", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		
		boolean result = m.find();
		
		if (result) {
			System.out.println("Pattern matched.");
		}
		else {
			System.out.println("Pattern didn't match.");
		}
	}
}