package org.dec13Hw1To20;

import java.util.Scanner;

public class q4 {

    //4- Write a program to print the sum of two numbers entered by user
    // by defining your own method.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1=sc.nextInt();
        System.out.println("Enter your second number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The Sum is:"+sum);


    }
}
