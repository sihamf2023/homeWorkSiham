package dec13Hw20To40;

public class q27 {
    //27- Given an array of ints, return true if the sequence of numbers 1, 2, 3
    // appears in the array somewhere.
    //
    //array123([1, 1, 2, 3, 1]) → true
    //array123([1, 1, 2, 4, 1]) → false
    //array123([1, 1, 2, 1, 2, 3]) → true
    public boolean array123(int [] numbers){
            for(int i = 0; i < numbers.length ; i++) {
                if(numbers[i] == 1 && numbers[i + 1] == 2 && numbers[i +2] == 3){
                    return true;
                }
            }
            return false;
        }
    }

