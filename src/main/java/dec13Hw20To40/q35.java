package dec13Hw20To40;

import java.util.Arrays;

public class q35 {
    //35.Given an array of ints length 3, return an array with the elements
    // "rotated left" so {1, 2, 3} yields {2, 3, 1}.
    //rotateLeft3([1, 2, 3]) → [2, 3, 1]
    //rotateLeft3([5, 11, 9]) → [11, 9, 5]
    //rotateLeft3([7, 0, 0]) → [0, 0, 7]

    public static void main(String[] args) {

            int[] arr = new int[]{1, 2, 3};
//display original array
        System.out.println("original array:"+ Arrays.toString(arr));
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=arr[2];
        arr[2]=temp;


        System.out.println("Rotated Array : "+Arrays.toString(arr));


}}
