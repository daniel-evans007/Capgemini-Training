package day5;

import java.util.*;
import java.util.regex.Pattern;

public class RegExPractice {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("mail:");
	String mail=sc.next();
	
	System.out.println("username:");
	String username=sc.next();
	
	System.out.println("password:");
	String password=sc.next();
	
	System.out.println("pincode:");
	String pincode=sc.next();
	
	System.out.println("mobileno:");
	String mobileNo=sc.next();
	
	System.out.println("city:");
	String city=sc.next();
	
	String usernameRegex="^[a-zA-Z0-9]{8}$";
	String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\."+
            "[a-zA-Z0-9_+&-]+)@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$";
	String passwordRegex= "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&+=])(?=\\S+$).{8,}$";
	String pincodeRegex="^[1-9]{6}$";
	String phoneRegex="(0/91)?[7-9][0-9]{9}$";
	String cityRegex="^[a-zA-Z]$";
	
	Pattern pat = Pattern.compile(usernameRegex);
	Pattern pat1 = Pattern.compile(emailRegex);
	Pattern pat2 = Pattern.compile(passwordRegex);
	Pattern pat3 = Pattern.compile(pincodeRegex);
	Pattern pat4 = Pattern.compile(phoneRegex);
	Pattern pat5 = Pattern.compile(cityRegex);
	
	if(pat.matcher(username).matches())
		System.out.println("username Matched");
	else
		System.out.println("username does not matched");
	
	if(pat1.matcher(mail).matches())
		System.out.println("email Matched");
	else
		System.out.println("email does not matched");
	
	if(pat2.matcher(password).matches())
		System.out.println("password Matched");
	else
		System.out.println("password does not matched");
	
	if(pat3.matcher(pincode).matches())
		System.out.println("pincode Matched");
	else
		System.out.println("pincode does not matched");
	
	if(pat4.matcher(mobileNo).matches())
		System.out.println("city Matched");
	else
		System.out.println("city does not matched");
	
	if(pat5.matcher(city).matches())
		System.out.println("no. Matched");
	else
		System.out.println("no. does not matched");
	
	sc.close();
	}
}