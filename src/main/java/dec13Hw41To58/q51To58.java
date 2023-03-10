package dec13Hw41To58;

public class q51To58 {
    //51-A prime number is a natural number greater than 1 that has no positive divisors other than 1
    // and itself.
    //Write a method that checks if a number is a prime number.
    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for not prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
    //52-Write a method that returns the sum of all even Fibonacci numbers.
    // Consider all Fibonacci numbers that are less than or equal to n.
    //Each new element in the Fibonacci sequence is generated by adding the previous two elements.
    //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    //53.Provided that you have a given number of small rice bags (1 kilo each)
    // and big rice bags (5 kilos each), write a method that returns true
    // if it is possible to make a package with goal kilos of rice.
    boolean riceGoal(int smallBag, int bigBag, int goal) {
        boolean result = false;
        if (bigBag * 5 >= goal) {
            if (smallBag >= goal % 5)
                result = true;
        } else {
            if (smallBag >= goal - bigBag * 5) {
                result = true;
            }
        }
        return result;


    }
    //54. Java Program to Check Whether a Number is Positive or Negative
    //input: isPositive(12.0)  output: true
    //input: isPositive(-3)  output: false
    //input: isPositive(-4.3)  output: false
    //input: isPositive(5.5)  output: true

    boolean isPositive(double number) {
        number = 10.3;

        // true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

            // true if number is greater than 0
        else if (number > 0.0)
            System.out.println(number + " is a positive number.");

            // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");

        return false;
    }

    //55-Java Program to Check Whether a Character is Alphabet or Not
    //input : isAlphabet('*')  output: false
    //input : isAlphabet('A')  output: true
    //input : isAlphabet('k')  output: true
    //input : isAlphabet('#')  output: false
    // declare a variable
    boolean alphabet(char c) {
        c = 'a';

        // checks if c is an alphabet
        if (Character.isAlphabetic(c)) {
            return true;
        } else
            return false;
    }

    //56-Java Program to Generate Multiplication Table
    //input: multiplicationTable(5);
    //output:
    //5 * 1 = 5
    //5 * 2 = 10
    //5 * 3 = 15
    //5 * 4 = 20
    //5 * 5 = 25
    //5 * 6 = 30
    //5 * 7 = 35
    //5 * 8 = 40
    //5 * 9 = 45
    //5 * 10 = 50
    void table(int n) {
        for (int i = 1; i <= 10; i++) {
            int res = n * i;
            System.out.println(n + " * " + i + " = " + res);
        }
    }
        //57-Java Program to Reverse a Number
        //input: reverseNumber(3798); output: 8973

        void reverse ( int num){

            num = 1234;
            int reversed = 0;

            System.out.println("Original Number: " + num);

            // run loop until num becomes 0
            while (num != 0) {
                // get last digit from num
                int digit = num % 10;
                reversed = reversed * 10 + digit;

                // remove the last digit from num
                num /= 10;
            }

            System.out.println("Reversed Number: " + reversed);
        }
        //58-Java Program to Calculate the Power of a Number
    //input: powerOfANumber(3,4); output: 81
    //input: powerOfANumber(2,5); output: 32
        void powerNumber(int b,int ex){

            System.out.println((int)Math.pow(b,ex));
        }


}










