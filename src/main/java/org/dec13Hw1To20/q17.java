package org.dec13Hw1To20;

public class q17 {

    /**
     * 17- Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
     * <p>
     * or35(3) → true
     * or35(10) → true
     * or35(8) → false
     */
    public boolean checkNum(int n) {

            return (n>0 & n % 3 == 0 || n % 5 == 0);
    }


}


