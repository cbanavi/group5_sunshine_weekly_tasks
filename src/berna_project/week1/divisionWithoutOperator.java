package berna_project.week1;

public class divisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args) {

        int result = customOperator(20, -5);
        System.out.println(result);
    }

    public static int customOperator(int dividend, int divisor) {

        if (divisor == 0) {
            throw new RuntimeException("Any number divided by zero is undefined");
        }
        if (divisor < 0) {
            return -customOperator(dividend, -divisor);
        }


        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return quotient;
    }
}
