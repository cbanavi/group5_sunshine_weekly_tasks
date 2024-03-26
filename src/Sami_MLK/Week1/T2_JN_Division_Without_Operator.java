package Sami_MLK.Week1;

public class T2_JN_Division_Without_Operator {
    public static void main(String[] args) {
        specialDivision(7777, 10);
    }

    private static double specialDivision(double x, double y) {

        if (y == 0) {
            throw new ArithmeticException("Not divisible by zero");
        }

        double result = 0;
        double dividend = x;
        double divisor = y;
        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }

        System.out.println(x + " divided by " + y + " without using division operator is " + result);
        System.out.println("This result is based on iterative subtraction, representing division.");
        return result;
    }
}

/*

2. Numbers -- Divide without '/' operator
Write a method that can divide two numbers without using division '/' operator

 */
/*         EXTRA LINES: in case we will be dealing with negative numbers
        //we are flipping signs from negative # into positive # so it's suitable for negative #s as well
        double sign = 1;
        if (x < 0) {
            sign = -sign;
            x = -x;
        }
        if (y < 0) {
            sign = -sign;
            y = -y;//same logic
        }
        return sign * result;
 */
