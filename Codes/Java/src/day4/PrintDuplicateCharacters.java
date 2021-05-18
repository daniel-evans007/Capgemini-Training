package day4;

import java.util.Scanner;

public class PrintDuplicateCharacters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		char[] string = s.toCharArray();
		
		int i, j, count;
		
		for (i=0;i<string.length;i++) {
			count = 1;
			
			for (j=i+1;j<string.length;j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					string[j] = 'O';
				}
			}
			
			if (count > 1 && string[i] != 'O') {
				System.out.print(string[i]+" ");
			}
		}
		
		sc.close();
	}
}