package dec13Hw20To40;

public class q38 {
    //38.Given an array of ints, return the sum of the first 2 elements in the array.
    // If the array length is less than 2, just sum up the elements that exist,
    // returning 0 if the array is length 0.
    //
    //sum2([1, 2, 3]) → 3
    //sum2([1, 1]) → 2
    //sum2([1, 1, 1, 1]) → 2
    public static void main(String[] args) {
        int []array= new int[]{};
        int l= array.length;
        int sum;
        if (l>=2){
            sum=array[0]+array[1];
            System.out.println(+sum);
            }
        else if(l<=1)
            System.out.println('0');
}}
