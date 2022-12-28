package dec13Hw20To40;

import java.util.Arrays;

public class q35 {
    //35.Given an array of ints length 3, return an array with the elements
    // "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    //rotateLeft3([1, 2, 3]) → [2, 3, 1]
    //rotateLeft3([5, 11, 9]) → [11, 9, 5]
    //rotateLeft3([7, 0, 0]) → [0, 0, 7]

    public static void main(String[] args) {

            int[] arr = new int[]{1, 2, 3, 4};
//display original array
        System.out.println("original array:"+ Arrays.toString(arr));
int len=arr.length-1;
        for (int i=0 ;i< arr.length-1; i++) {
            arr[i] = arr[i + 1];
            if (i == len+1 )
                arr[i] = arr[0];
        }
        System.out.println("Rotated Array : "+Arrays.toString(arr));


}}
