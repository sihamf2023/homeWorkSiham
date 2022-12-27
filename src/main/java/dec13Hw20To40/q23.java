package dec13Hw20To40;

public class q23 {
    //23- Given 2 int values, return true if they are both in the range 30..40 inclusive,
    // or they are both in the range 40..50 inclusive.
    //
    //in3050(30, 31) → true
    //in3050(30, 41) → false
    //in3050(40, 50) → true
    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <=40 && b >= 30 && b <= 40) || (a >= 40 && a <=50 && b >= 40 && b <= 50))
        return true;
        else
            return false;
    }
    //Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    // or return 0 if neither is in that range.
    //
    //max1020(11, 19) → 19
    //max1020(19, 11) → 19
    //max1020(11, 9) → 11

    public int max1020(int num1, int num2){
        if ((num1>=10 && num1<=20) && (num2>=10 && num2<=20 ) && num1>num2)
            return +num1;
        else if ((num1>=10 && num1<=20) && (num2>=10 && num2<=20 ) && num2>num1)
            return +num2;
        else
            return 0;



    }

}
