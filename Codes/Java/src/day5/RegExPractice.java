package day5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String username;
		String userpattern = "^[A-Za-z0-9]{1,}[._-]{1}[A-Za-z0-9]{1}(.+){3,}$";
		Pattern pat1=Pattern.compile(userpattern);
		boolean username_result;
		Matcher matcher1;
		
		do {
			System.out.print("Enter username : ");
			username= sc.next();
		
			matcher1=pat1.matcher(username);
			username_result=matcher1.matches();
		
				if(username_result && username.length()>8) {
					System.out.println("Valid Username");
					break;
				}
				if(!username_result || username.length()<=8)
					System.out.println("Invalid Username...Try Again...");
		}while(!username_result || username.length()<=8);
		
		String email;
		String emailpattern = "^[A-Za-z0-9._$+]{4,}[a-zA-Z0-9]@[a-z]{2,6}\\.(.+)$";
		Pattern pat2=Pattern.compile(emailpattern);
		boolean email_result;
		Matcher matcher2;
		
		do {
			System.out.print("Enter Email : ");
			email= sc.next();
			matcher2=pat2.matcher(email);
			email_result=matcher2.matches();
			if(email_result) {
				System.out.println("Valid Email");
				break;
			}
			if(!email_result)
				System.out.println("Invalid Email...Try Again...");
		}while(!email_result);
		
		String city;
		String citypattern = "^[A-Za-z]{3}$";
		Pattern pat3=Pattern.compile(citypattern);
		boolean city_result;
		Matcher matcher3;
		
		do {
			System.out.print("Enter city : ");
			city= sc.next();
			matcher3=pat3.matcher(city);
			city_result=matcher3.matches();
			if(city_result) {
				System.out.println("Valid City");
				break;
			}
			if(!city_result)
				System.out.println("Invalid City...Try Again...");
		}while(!city_result);
		
		String pin;
		String pinpattern = "^[0-9]{6}$";
		Pattern pat4=Pattern.compile(pinpattern);
		boolean pin_result;
		Matcher matcher4;
		
		do {
			System.out.print("Enter pin : ");
			pin= sc.next();
			matcher4=pat4.matcher(pin);
			pin_result=matcher4.matches();
			if(pin_result) {
				System.out.println("Valid Pin");
				break;
			}
			if(!pin_result)
				System.out.println("Invalid Pin...Try Again...");
		}while(!pin_result);
		
		String mob;
		String mobpattern = "[789]{1}[0-9]{9}";
		Pattern pat5=Pattern.compile(mobpattern);
		boolean mob_result;
		Matcher matcher5;
		
		do {
			System.out.print("Enter mobile number : ");
			mob= sc.next();
			matcher5=pat5.matcher(mob);
			mob_result=matcher5.matches();
			if(mob_result) {
				System.out.println("Valid Mobile Number");
				break;
			}
			if(!mob_result)
				System.out.println("Invalid Mobile Number...Try Again...");
		}while(!mob_result);
		
		sc.close();
	}
}