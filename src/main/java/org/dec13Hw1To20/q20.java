package org.dec13Hw1To20;

public class q20 {
       /** 20- We'll say that a number is "teen" if it is in the range 13..19 inclusive.
         //Given 3 int values, return true if 1 or more of them are teen.

          hasTeen(13, 20, 10) → true
          hasTeen(20, 19, 10) → true
          hasTeen(20, 10, 13) → true
        */
       public boolean hasTeen(int n1,int n2,int n3){
           return((n1>=13 & n1<=19) ||(n2>=13 & n2<=19) || (n3>=13 & n3<=19));

    }


}
