package dec13Hw41To58;

import java.util.Arrays;

public class q41To50 {
    //41- Given an int array length 2, return true if it contains a 2 or a 3.
    //
    //has23([2, 5]) → true
    //has23([4, 3]) → true
    //has23([4, 5]) → false
    public boolean has23(int[] nums) {

        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
            return true;
        else
            return false;
    }

    //42- Given an int array length 2, return true if it does not contain a 2 or 3.
    //
    //no23([4, 5]) → true
    //no23([4, 2]) → false
    //no23([3, 5]) → false
    public boolean no23(int[] nums) {

        return (nums[0] != 2 && nums[1] != 3 && nums[1] != 2 && nums[0] != 3);
    }

    //43-Given an int array, return a new array with double the length where its last
    // element is the same as the original array, and all the other elements are 0.
    // The original array will be length 1 or more. Note: by default,
    // a new int array contains all 0's.
    //
    //makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    //makeLast([1, 2]) → [0, 0, 0, 2]
    //makeLast([3]) → [0, 3]
    int[] makeLast(int[] a) {
        int[] b = new int[a.length * 2];
        b[b.length - 1] = a[a.length - 1];
        return b;
    }
    //44-Given an int array, return true if the array contains 2 twice, or 3 twice.
    // The array will be length 0, 1, or 2.
    //
    //double23([2, 2]) → true
    //double23([3, 3]) → true
    //double23([2, 3]) → false

    public boolean double23(int[] nums) {
        if (nums.length >1)
            return ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));

        else

            return false;
    }
    //45- Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
    // and a boolean indicating if we are on vacation, return a string of the form "7:00"
    // indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
    // and on the weekend it should be "10:00". Unless we are on vacation --
    // then on weekdays it should be "10:00" and weekends it should be "off".
    //
    //alarmClock(1, false) → "7:00"
    //alarmClock(5, false) → "7:00"
    //alarmClock(0, false) → "10:00"
    public String alarmClock(int day, boolean vacation) {
        if((day>0 && day<6) && !vacation){
            return "7:00";
        }else if((day>0 && day<6) && vacation){
            return "10:00";
        }if(!(day>0 && day<6) && !vacation){
            return "10:00";
        }
        return"off";
    }
    //46-You have a green lottery ticket, with ints a, b, and c on it.
    // If the numbers are all different from each other, the result is 0.
    // If all of the numbers are the same, the result is 20. If two of the numbers are the same,
    // the result is 10.
    //
    //greenTicket(1, 2, 3) → 0
    //greenTicket(2, 2, 2) → 20
    //greenTicket(1, 1, 2) → 10
    int greenTicket(int a,int b,int c){
        if (a == b & b == c) {
            return 20;
        } else if (a == b | a == c | b == c) {
            return 10;
        }
        return 0;
    }
    //47-Write a java program to find the perimeter of a rectangular, square, circle, triangle
    void perimeter(int a, int b){
        int rec = 2 * (a + b);
        int sqr = 4 * a;
        double cir = 2 * 3.14 * a * a;
        int tgl = a + b + a;
        System.out.println("Rectangular Perimeter :" + rec );
        System.out.println("Square Perimeter :" + sqr );
        System.out.println("Circle Perimeter :" + cir );
        System.out.println("Triangle Perimeter :" + tgl);
    }
    //48-Java Program to Calculate Simple Interest
    //Simple Interest = (P x T x R)/100
    //Where,
    //
    //P is the principal amount
    //T is the time and
    //R is the rate
    public static float simpleInterest(float principle, float rate, float time){
        float interest = (principle*rate*time)/100;
        return interest;
    }
    //49-Write a method that returns the largest integer in the list.
    //You can assume that the list has at least one element.
    //input : [2,5,3,14,5,25]
    //output: Largest number is : 25
    void largestNumber(){
      int [] max ={3,6,9,24,78,90,2,6};
        Arrays.sort(max);
        System.out.println("the largest number is :"+ max[max.length-1]);
    }
    //50-Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
    //For numbers which are multiples of both three and five return 'FizzBuzz'.
    //For numbers that are neither, return the input number.
        public static void main(String[] args) {
            int numbers = 25;
                if (numbers % 3 == 0 && numbers % 5 == 0) {
                    System.out.println("FizzBuzz ");
                } else if (numbers % 3 == 0) {
                    System.out.println("Fizz");
                } else if (numbers % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(numbers);
                }
            }

    }



