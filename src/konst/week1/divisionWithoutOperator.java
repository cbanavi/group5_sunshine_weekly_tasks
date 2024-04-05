/* Write a method that can divide two numbers without using division operator */
package konst.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        System.out.println(divide(10, -5));
    }
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1; // Determine the sign of result

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return sign * quotient; // Apply the calculated sign
    }
}