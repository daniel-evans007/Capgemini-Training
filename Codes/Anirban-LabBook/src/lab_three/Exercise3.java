package lab_three;

import java.util.Scanner;

public class Exercise3 {
	
	public static String alterString(String s) {
		char ch=' ';
		String str="";
		
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			
			if((ch>=65 && ch<=90) && (ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')) {
				ch=(char)((int)ch+1);
			}
			else if((ch>=97 && ch<=122) && (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')) {
				ch=(char)((int)ch+1);
			}
			
			str+=ch;
		}
		
		return str;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		
		System.out.print("Altered String : "+alterString(s));
		
		sc.close();
	}
}