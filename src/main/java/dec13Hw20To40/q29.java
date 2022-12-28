package dec13Hw20To40;

public class q29 {
    //Given an array of ints, we'll say that a triple is a value
    //appearing 3 times in a row in the array. Return true if the array does not contain any triples.
    //
    //noTriples([1, 1, 2, 2, 1]) → true
    //noTriples([1, 1, 2, 2, 2, 1]) → false
    //noTriples([1, 1, 1, 2, 2, 2, 1]) → false
    public boolean noTriples(int[] numbers) {
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1] && numbers[i] == numbers[i + 3])
                return false;
        }
        return true;
    }
}