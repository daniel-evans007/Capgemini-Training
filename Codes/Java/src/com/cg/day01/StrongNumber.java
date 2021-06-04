package com.cg.day01;

import java.util.Scanner;

public class StrongNumber {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                int rem,sum=0,temp=n;
                while(temp>0) {
                        rem=temp%10;
                        int fact=1;
                        for(int i=1;i<=rem;i++) {
                                fact*=i;
                        }
                        sum=sum+fact;
                        temp/=10;
                }

                if (sum == n) {
                        System.out.println("the number is a strong number");
                }
                else {
                        System.out.println("the number is not a strong number");
                }

                sc.close();
        }
}