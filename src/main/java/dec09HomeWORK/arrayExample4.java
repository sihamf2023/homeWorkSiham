package dec09HomeWORK;

import java.util.Arrays;

public class arrayExample4 {
    public static void main(String[] args) {
        /*
        Example 4: Create a program that moves all the zeros in a given array to the end in place

        Input:[1,0,1,1,0,0,0,1]
        Output:[1,1,1,1,0,0,0,0]

        */
        int[] arrayNum = { 0, 3, 0, 6, 0, 1, 0, 1};

        System.out.println("Original array:"+ Arrays.toString(arrayNum));

        int counter = 0;
        int [] myArray = new int[arrayNum.length-1];
        for (int j : arrayNum) {
            if (j > 0)
                myArray[counter++] = j;
        }
        System.out.println("new array:"+Arrays.toString(myArray));


    }
}
