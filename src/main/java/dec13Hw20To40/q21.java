package dec13Hw20To40;

public class q21 {
    //21- Given three int values, a b c, return the largest.
    //
    //intMax(1, 2, 3) → 3
    //intMax(1, 3, 2) → 3
    //intMax(3, 2, 1) → 3
    public int intMax(int n1, int n2, int n3) {
        if(n1 > n2 && n1 > n3)
            return n1;
        else if(n2 > n1 && n2>n3)
            return n2;
        else return n3;
    }

}
