package org.dec13Hw1To20;

public class q11 {
    //11- Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    //
    //sumDouble(1, 2) → 3
    //sumDouble(3, 2) → 5
    //sumDouble(2, 2) → 8
    public int doubleSum(int a , int b){
        int sum=a+b;
        if(a==b)
        return sum * 2;
        else
            return sum;

    }

}
