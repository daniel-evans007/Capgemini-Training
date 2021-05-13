package lab1;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        
        boolean t = (powerOfTwo(num));

        if (t == true) {
            System.out.println("Yes it's a power of 2.");
        }
        else {
            System.out.println("No it's not a power of 2.");
        }
        
        reader.close();
    }
    
    static boolean powerOfTwo(int n) {
        if (n == 0)
            return false;
        
            return (Math.ceil((Math.log(n) / Math.log(2)))) == (Math.floor(((Math.log(n) / Math.log(2)))));
    }
}