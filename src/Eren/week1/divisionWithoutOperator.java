package Eren.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {

        System.out.println(divide(-10,-2));


    }

    //Write a method that can divide two numbers without using division operator
    // Work the method for negative numbers



    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        int number = 1;
        if (a < 0) {
            a = -a;
            number = -number;
        }
        if (b < 0) {
            b = -b;
            number = -number;
        }

        double result = 0;

        while (a >= b) {
            a -= b;
            result++;
        }

        return number * result;
    }
}
    // while loop repeatedly subtracts b from a until a is less than or equal to b.
    //The loop counts how many times this happens and returns the count.


