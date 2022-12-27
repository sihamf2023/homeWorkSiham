package dec13Hw20To40;

public class q24 {
    //24  Given two non-negative int values, return true if they have the same last digit,
    // such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
    //
    //lastDigit(7, 17) → true
    //lastDigit(6, 17) → false
    //lastDigit(3, 113) → true
    public boolean lastDigit(int num1,int num2){
        if ((num1>0 & num2>0) && num1%10==num2%10)
            return true;
        else
            return false;

    }
}

