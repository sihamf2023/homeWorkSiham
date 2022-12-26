package org.dec13Hw1To20;

import java.util.Scanner;

public class q2 {
    //2- Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("You Entered a Even number");
        }
        else{
            System.out.println("Your Entered a Odd number");
        }

    }
}
