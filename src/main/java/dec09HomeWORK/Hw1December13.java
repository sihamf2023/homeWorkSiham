package dec09HomeWORK;

public class Hw1December13 {
    int a;

    public static void main(String[] args) {

        Hw1December13 conv = new Hw1December13();
        conv.converter(5);
        conv.convert(5);
        //1- Write a method that takes an integer minutes,
        // converts it to seconds and returns as long.
    }
    public void converter(int a) {
        int b = a * 60;
        System.out.println(+a + " minutes= " + b + " seconds");

    }
    public int convert(int a) {
        int b = a * 60;
        System.out.println(+b);
        return b;
    }
}



