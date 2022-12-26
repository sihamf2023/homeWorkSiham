package org.dec13Hw1To20;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        //1.- Define two methods to print the maximum and the minimum number
        // respectively among three numbers entered by user.
        Scanner number=new Scanner(System.in);
        System.out.println("Enter your 1st number:");
        int number1=number.nextInt();
        System.out.println("Enter your 2nd number:");
        int number2=number.nextInt();
        System.out.println("Enter your 3rd number:");
        int number3=number.nextInt();

        q1 maxi = new q1();
        maxi.maximum(number1,number2,number3);
        maxi.minimum(number1,number2,number3);

        }
        public void maximum(int num1,int num2,int num3){
        int max;
        if(num1>num2 & num1>num3){
             max=num1;
        }
        else if(num2>num1 & num2>num3){
            max=num2;
        }
        else {
            max=num3;
        }
            System.out.println("the maximum number:"+max);
        }
    public void minimum(int num1, int num2, int num3){
        int min;
        if(num1<num2 & num1<num3){
            min=num1;
        }
        else if(num2<num1 & num2<num3){
            min=num2;
        }
        else {
            min=num3;
        }
        System.out.println("the minimum number:"+min);
    }



    }

