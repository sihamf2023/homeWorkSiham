package org.dec13Hw1To20;

public class q14 {
    //14-Given an int n, return true if it is within 10 of 100 or 200.
    // Note: Math.abs(num) computes the absolute value of a number.
    //
    //nearHundred(93) → true
    //nearHundred(90) → true
    //nearHundred(89) → false
    public boolean nearHundred(int n){
        if(n>10 & n<100 || n==200)
            return true;
        else
            return false;
    }
}
