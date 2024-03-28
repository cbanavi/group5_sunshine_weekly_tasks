package chiyavan.week1;

public class divisionWithoutOperator_Chiyavan {
    public static void divisionWithoutOperator(int dividend, int divisor) {

        int methodDividend = dividend;
        int methodDivisor = divisor;


        if (divisor == 0) {
            throw new RuntimeException("DIVISOR CANNOT BE ZERO");
        }

        double quotient = 0;

        if (divisor >= 0) {                      //This runs when divisor is positive and dividend is positive //works
            while (dividend >= divisor) {
                dividend -= divisor;
                quotient++;
            }
        }

        if (divisor < 0 && dividend < 0) {      //This runs when divisor is negative and dividend is negative //works
            while (-dividend >= -divisor) {
                dividend -= divisor;
                quotient++;
            }

        }

        if (divisor < 0) {                      //This runs when divisor is negative and dividend is positive //works
            while (dividend >= -divisor) {
                dividend += divisor;
                quotient--;
            }

        }

        if (divisor > 0 && dividend < 0) {      //This runs when divisor is positive and dividend is negative //works
            while (-dividend >= divisor) {
                dividend += divisor;
                quotient--;
            }

        }

        System.out.println(methodDividend + " divided by " + methodDivisor + " = " + quotient);
        System.out.println("And the remainder is " + dividend);

    }

    public static void main(String[] args) {
        divisionWithoutOperator(-15, 3);
    }

}