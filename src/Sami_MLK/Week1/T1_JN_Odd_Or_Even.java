package Sami_MLK.Week1;

public class T1_JN_Odd_Or_Even {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator

        System.out.println(divide(20, 5));

    }

public static double divide(double a, double b) {
    double result = 0;

    while (a >= b) {
        a -= b;
        result++;
    }
    return result;
}
    }

   // This implementation uses a while loop to repeatedly subtract b from a until a is less
  //than or equal to b. The loop increments result each time this happens.








