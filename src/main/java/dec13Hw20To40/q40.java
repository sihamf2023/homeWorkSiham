package dec13Hw20To40;

import java.util.Arrays;

public class q40 {
    //40.Given an array of ints, return a new array length 2 containing
    // the first and last elements from the original array.
    // The original array will be length 1 or more.
    //
    //makeEnds([1, 2, 3]) → [1, 3]
    //makeEnds([1, 2, 3, 4]) → [1, 4]
    //makeEnds([7, 4, 6, 2]) → [7, 2]
    public static void main(String[] args) {
        int [] array=new int[]{1,2,3,4,5,6};
        int [] makeEnds=new int[]{array[0],array[array.length-1]};
        System.out.println("new array"+ Arrays.toString(makeEnds));
    }

}
