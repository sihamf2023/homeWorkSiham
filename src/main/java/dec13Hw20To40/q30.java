package dec13Hw20To40;

public class q30 {
    //30  Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
    // followed by the value plus 5, followed by the value minus 1.
    // Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    //
    //has271([1, 2, 7, 1]) → true
    //has271([1, 2, 8, 1]) → false
    //has271([2, 7, 1]) → true

    /** I couldn't understand the questions
     *
     * I just try the first part of question
     */
    public boolean has271(int[] numbers) {
        for (int i =1; i < numbers.length-1;i++){
            if(numbers[i]==2 && numbers[i+1]==7 && numbers[i+2]==1)
                return true;

    }
    return false;
}}

