package org.dec13Hw1To20;

public class q16 {

    //16- Given a string, return a new string where "not " has been added to the front.
    // However, if the string already begins with "not", return the string unchanged.
    // Note: use .equals() to compare 2 strings.
    //
    //notString("candy") → "not candy"
    //notString("x") → "not x"
    //notString("not bad") → "not bad"
    public static void main(String[] args) {
        q16 mn = new q16();
        mn.notString("not candy");
        mn.notString("bad");


    }

    public void notString(String str) {

        if (str.startsWith("not ")) {
            System.out.println(str);
        } else
            System.out.println("not " + str);
    }


    }
