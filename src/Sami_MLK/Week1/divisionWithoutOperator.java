package Sami_MLK.Week1;

public class divisionWithoutOperator {
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

