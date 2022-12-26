package org.dec13Hw1To20;

import java.util.Scanner;

public class q6 {
    //6- Write a program to print the circumference and area of a circle
    // of radius entered by user by defining your own method.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Circle Radius:");
        double radius=sc.nextDouble();
        double area  = 3.14*radius*radius;
        double circum= 2*3.14*radius;
        System.out.println("the area of circle is:"+area);
        System.out.println("the Circumference of circle is:"+circum);

    }
}
