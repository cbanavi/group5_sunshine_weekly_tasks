/* Write a method that can divide two numbers without using division operator */
package konst.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        System.out.println(divide(10, -5));
    }

    public static int divide(int dividend, int divisor) {
        // Error handling: Prevent division by zero
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        // Determine the result's sign using XOR (^) for efficiency
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        // Work with absolute values for simpler subtraction logic
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Initialize the quotient
        int quotient = 0;

        // Repeated subtraction: Keep subtracting the divisor until it can no longer fit within the dividend
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        // Adjust the final result with the previously calculated sign
        return sign * quotient;
    }
}
