package org.dec13Hw1To20;

public class q13 {

    //13- Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    //
    //makes10(9, 10) → true
    //makes10(9, 9) → false
    //makes10(1, 9) → true
    public boolean makes10(int a, int b){
        int sum=a+b;
        if (a==10 || b==10||sum==10)
            return true;
        else
            return false;

    }
}
