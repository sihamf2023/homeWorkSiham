package dec13Hw20To40;

import java.util.Arrays;

public class q37 {
    //37.Given an array of ints length 3, figure out which is larger,
    // the first or last element in the array, and set all the other elements to be that value.
    // Return the changed array.
    //
    //maxEnd3([1, 2, 3]) → [3, 3, 3]
    //maxEnd3([11, 5, 9]) → [11, 11, 11]
    //maxEnd3([2, 11, 3]) → [3, 3, 3]
    public static void main(String[] args) {
        int [] array =new int[]{1,2,3};
        System.out.println("original array:"+ Arrays.toString(array));
        if (array[0]>array[2]){
            int[] newArray= new int []{array[0],array[0],array[0]};
            System.out.println(Arrays.toString(newArray));
        }
        else if (array[0]<array[2]){
            int[] newArray= new int []{array[2],array[2],array[2]};
            System.out.println("new array :"+Arrays.toString(newArray));
        }
    }
}
