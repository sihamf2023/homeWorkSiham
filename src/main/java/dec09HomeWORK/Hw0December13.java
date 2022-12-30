package dec09HomeWORK;

import java.util.Arrays;

public class Hw0December13 {
    public static void main(String[] args) {
        //1. write a method that can convert km to miles
        //            1 km = 0.612 miles
        //2. write a method that can convert gallons to litters
        //            1 G = 3.75 L
        Hw0December13 sc = new Hw0December13();

        sc.calculation1(12, 0.612); //km to miles
        sc.calculation1(30, 3.75); //gallon to litre
        sc.calculation1(5, 60); //minute to second

        //3. write a method that can print out the array
        // in Descending order
        int[] numbers1 = {40, 50, 78, 12, 6};
        sc.convertNumber(numbers1);
    }
    public void calculation1(double a, double e) {
        double b = a * e;
        System.out.println(+b);
    }
    public void convertNumber(int[] array) {
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
    }


}



