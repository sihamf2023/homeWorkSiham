package org.dec13Hw1To20;

public class q19 {
    //19- Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    //
    //in1020(12, 99) → true
    //in1020(21, 12) → true
    //in1020(8, 99) → false
    public boolean rang(int num1,int num2){
        num1=12;num2=99;
        return ((num1>=10 & num1<=20)||(num2>=10 & num2<=20));
    }

}
