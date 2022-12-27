package dec13Hw20To40;

public class q22 {
    //22- Given 2 int values, return whichever value is nearest to the value 10,
    // or return 0 in the event of a tie.
    // Note that Math.abs(n) returns the absolute value of a number.
    //
    //close10(8, 13) → 8
    //close10(13, 8) → 8
    //close10(13, 7) → 0
    public int close10(int num1,int num2){
        int rest1=Math.abs(num1-10);
        int rest2=Math.abs(num2-10);
        if (rest1<rest2){
            return num1;
        }
        else if (rest2<rest1){
            return num2;
        }
        else {
            return 0;
        }

    }
}
