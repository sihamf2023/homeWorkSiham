package dec09HomeWORK;

public class Hw5December13 {

    /*4. write a method that accepts 3 parameters: 2 numbers and one operator,
        and prints out the calculation
       if operator is not between [-, +, *, /, %] output should be Invalid Operator
       Ex: calculate(10, 2, "*") ==> 20;
*/
    public static void main(String[] args) {
        Hw5December13 mo = new Hw5December13();
        mo.calculation(20, 10, '+');
        mo.scoreCal(87);
    }
    public void calculation(int a, int b, int operator) {
        if (operator == '+') {
            System.out.println(a + b);
        }
        if (operator == '-') {
            System.out.println(a - b);
        }
        if (operator == '*') {
            System.out.println(a * b);
        }
        if (operator == '/') {
            System.out.println(a / b);
        }
        if (operator == '%') {
            System.out.println(a % b);
        }

        //5. write a method that can calculate grade
        //			if score is 100 ~ 90 ==> A
        //			if score is 89 ~ 80 ==> B
        //			if score is 79 ~ 70 ==> C
        //			if score is 69 ~ 60 ==> D
        //			if score is 0 ~ 59 ==> F
        //			otherwise ==> Invalid Score

    }

    public void scoreCal(int score) {

        if (score > 90 & score <= 100) {
            System.out.println("YOUR GRADE IS: A");
        } else if (score > 80 & score <= 89) {
            System.out.println("YOUR GRADE IS:B");
        } else if (score > 70 & score <= 79) {
            System.out.println("YOUR GRADE IS:C");
        } else if (score > 60 & score <= 69) {
            System.out.println("YOUR GRADE IS:D");
        } else if (score > 59 & score <= 0) {
            System.out.println("YOUR ARE FAIL");
        } else {
            System.out.println("ENTER A VALID SCORE");
        }

    }
}
