package PenTasks.Week01;

public class divisionWithoutOperator {

        public static void main(String[] args) {
 divide(15,5);

        }

        public static int divide(int dividend, int divisor) {
// if divisor is equal to zero
            int quotient = 0;
            int remainder = dividend;
            if (divisor == 0) {
                throw new ArithmeticException("Not divisible by zero");
            }

            while (remainder >= divisor) {
                remainder -= divisor;
                quotient++;
            }
            // for handling negative numbers :
           // int coefficient = 1;
           // if ((divisor < 0 && dividend >= 0) || (divisor >= 0 && dividend < 0)) {

                // if (divisor<0 ^ dividend<0){
               //coefficient = -1;}
           // dividend = Math.abs(dividend);
            // divisor = Math.abs(divisor);

            System.out.println("the remainder is : " + remainder);
            System.out.println("The quotient is : " + quotient);
            return quotient;
            //return quotient * coefficient;

        }
    }



