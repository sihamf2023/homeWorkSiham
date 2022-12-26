package org.dec13Hw1To20;

import java.util.Scanner;

public class q7 {

    //7- Define a method to find out if number is prime or not.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check:");
        int number = sc.nextInt();
        int i = 2;
        while (i <= number / 2) {
            if ((number % i) == 0) {
                i++;
                System.out.println("your number is not prime");
                break;
            } else {
                System.out.println("your number is prime");
                break;
            }
        }

    }
}
