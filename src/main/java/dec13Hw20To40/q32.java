package dec13Hw20To40;

public class q32 {
    //32. Given an array of ints, return true if the array is length 1 or more,
    // and the first element and the last element are equal.
    //
    //sameFirstLast([1, 2, 3]) → false
    //sameFirstLast([1, 2, 3, 1]) → true
    //sameFirstLast([1, 2, 1]) → true
    public boolean sameFirstLast(int[] numbers) {
        int len = numbers.length ;
            if (len > 0 && numbers[0] == numbers[len-1])
                return true;
            else
            return false;
    }
}
