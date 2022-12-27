package dec13Hw20To40;

import java.util.Arrays;

public class q25 {
    //25- Given an array of ints, return the number of 9's in the array.
    //
    //arrayCount9([1, 2, 9]) → 1
    //arrayCount9([1, 9, 9]) → 2
    //arrayCount9([1, 9, 9, 3, 9]) → 3
    public static void main(String[] args) {
        q25 sc = new q25();
         sc.arrayCount9 (9,8,9,6,5);
    }

    public int arrayCount9(int numbers[]){
        int count=0;
        for (int i=0;i<numbers.length;i++)
            if(numbers[i]==9)
                count++;

        return count;
    }

    }

