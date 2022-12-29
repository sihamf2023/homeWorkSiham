package dec13Hw20To40;

import java.util.Arrays;

public class q39 {
    //39 .Given 2 int arrays, a and b, each length 3,
    // return a new array length 2 containing their middle elements.
    //
    //middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    //middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    //middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
    public static void main(String[] args) {
        int [] a = new int []{1,2,3};
        int [] b = new int []{4,5,6};
        int [] middleWay= new int []{a[1],b[1]};
        System.out.println("new array :"+ Arrays.toString(middleWay));

    }
}
