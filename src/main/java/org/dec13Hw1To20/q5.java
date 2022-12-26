package org.dec13Hw1To20;

import java.util.Scanner;

public class q5 {
    //5- Define a method that returns the product of two numbers entered by user
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}
