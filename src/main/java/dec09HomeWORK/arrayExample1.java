package dec09HomeWORK;

import java.util.Arrays;

public class arrayExample1 {
    /*
    Create a function that finds the second smallest item in integer array;
    Input{1903,1905,1907,1961,1999,2011,2023}
   Output: 1905
     */
    public static void main(String[] args) {
        int year[] = {1903, 1905, 1907, 1961, 1999, 2011, 2023};

        Arrays.sort(year);
        System.out.println("the second smallest is:" + year[1]);
    }

}
