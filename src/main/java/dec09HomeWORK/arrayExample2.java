package dec09HomeWORK;

public class arrayExample2 {
    public static void main(String[] args) {
/*Create a program that displays a right triangle with contents of an array

Input{1,2,3,4}
Output:
1
12
123
1234
Input{A,B,C,D}
Output
A
AB
ABC
ABCD
 */
        int number[] = {1, 2, 3, 4};

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number[j] + " ");
            }
            System.out.println();

        }

        System.out.println("***********************************");

        String letter[] = {"A", "B", "C", "D"};

        for (int x = 0; x < letter.length; x++) {
            for (int j = 0; j <= x; j++) {
                System.out.print(letter[j] + "");

            }
            System.out.println();
        }

    }
}

