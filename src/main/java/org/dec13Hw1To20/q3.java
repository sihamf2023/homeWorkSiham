package org.dec13Hw1To20;

import java.util.Scanner;

public class q3 {
    //3- A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("\"You are Eligible to vote\"");
        }
        else System.out.println("\"You are not eligible to vote\"");

    }
}