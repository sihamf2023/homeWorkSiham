package org.dec13Hw1To20;

import java.util.Scanner;

public class q8 {
    //8- Write a program which will ask the user to enter his/her marks (out of 100).
    // Define a method that will display grades according to the marks entered as below:
    //Marks        Grade
    //91-100         AA
    //81-90          AB
    //71-80          BB
    //61-70          BC
    //51-60          CD
    //41-50          DD
    //<=40          Fail
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter your score:");
        int score=sc.nextInt();
        q8 mo=new q8();
        mo.scoreCal(score);
    }
    public void scoreCal(int score){

        if (score>=90 & score<=100){
            System.out.println("YOUR GRADE IS: A+");
        }
        else if (score>=81 & score<=90){
            System.out.println("YOUR GRADE IS: AB");
        }
        else if(score>=71 &score<=80){
            System.out.println("YOUR GRADE IS: BB");
        }
        else if (score>=61 & score<=70){
            System.out.println("YOUR GRADE IS: BC");
        }
        else if (score>=51 & score<=60){
            System.out.println("YOUR GRADE IS: CD");
        }
        else if (score>=41 & score<=50){
            System.out.println("YOUR GRADE IS: DD");
        }
        else if (score<=40){
            System.out.println("YOUR ARE FAIL!");
        }
        else{
            System.out.println("ENTER A VALID SCORE");
        }

    }

}
