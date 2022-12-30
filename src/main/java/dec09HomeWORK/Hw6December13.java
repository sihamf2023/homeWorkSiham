package dec09HomeWORK;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Hw6December13 {
    public static void main(String[] args) {
        // 6. Write a Java method to multiply corresponding elements of two arrays of integers.
        //Sample input:
        //Array1: [1, 3, -5, 4]
        //Array2: [1, 4, -5, -2]

        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};

        out.println("Array1: " + Arrays.toString(array1));
        out.println("Array2: " + Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            int num1 = array1[i];
            int num2 = array2[i];
            int result = num1 * num2;
            out.print(+result + " ");

        }
        out.println("=============================");
        //7. Write a Java program start with an integer n, divide n by 2
        // if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.

        int n = 3;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3 + 1) / 2;
            }
        }
        out.println("the value of n:" + n);
        //8. Write a Java program to check if a number is Armstrong's number or not?
        //(input 153 output true,  123 output false)

        // work only with 3 digit number
        Scanner number=new Scanner(in);

        out.println("Enter your number:");
        int originalNum= number.nextInt();
        int num=originalNum;
        int result1=0;
        String numb=Integer.toString(originalNum);
        int length=numb.length();

        for (int i=0;i<length;i++) {
            int remainder = originalNum % 10;
            result1 =(int)(result1+Math.pow(remainder,length));
            originalNum = originalNum / 10;
        }
        if(result1 == num)
            System.out.println(+num + " is an Armstrong number.");
        else
            System.out.println(+num+ " is not an Armstrong number.");
    }

}




