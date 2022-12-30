package dec09HomeWORK;

import java.util.Arrays;

public class arrayExample3 {
    public static void main(String[] args) {

    /*
    Create a program that rotates the contents of an array to the right, returning new array

     Input:{1,2,3,4,5}
     Output:{5,1,2,3,4}
     Output:{4,5,1,2,3}
     */
        int[] arr = new int[]{1, 2, 3, 4, 5};
//display original array
        System.out.println("original array:"+ Arrays.toString(arr));
        int l = arr[arr.length - 1];
        for (int j = arr.length - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = l;
        System.out.println("Rotated Array : "+Arrays.toString(arr));



    }}