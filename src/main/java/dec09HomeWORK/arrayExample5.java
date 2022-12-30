package dec09HomeWORK;

import java.util.Arrays;

public class arrayExample5 {
    public static void main(String[] args) {
        /*Create a program that reverses an array in place
        Modify the contents of the inputted array
       Input:{1,2,3,4,5}
       Output:{5,4,3,2,1}
         */
        int[] intArray = new int[]{1, 2, 3, 4, 5};

        //print array starting from first element
        System.out.println("Original Array:" + Arrays.toString(intArray));

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");



}}




