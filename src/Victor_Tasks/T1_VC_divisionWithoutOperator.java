package Victor_Tasks;

public class T1_VC_divisionWithoutOperator {
    public static int division(int dividend, int divisor) {

      //  int dividend;
      //  int divisor;
        int quotient = 0;

        if (divisor == 0) {
            System.err.println("divisor cannot be zero");
        }

        if (dividend < 0) {
            dividend = -(dividend);
        } else if (divisor < 0) {
            divisor = -(divisor);
        }

        while (dividend >= divisor) {

            dividend = dividend - divisor;
            quotient++;
        }
        return quotient;

    }

    public static void main(String[] args) {
        System.out.println(division(10, 4));

        }
    }









