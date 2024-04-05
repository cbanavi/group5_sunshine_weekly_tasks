package Emrah.week1;

public class DivisionWithoutOperator {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;
        int result = divide(dividend, divisor);
        System.out.println("Quotient: " + result);
    }
    public static int divide(int dividend, int divisor) {
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return quotient;
    }
// changes1

}

