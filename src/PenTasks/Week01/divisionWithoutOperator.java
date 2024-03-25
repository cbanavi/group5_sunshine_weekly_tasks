package PenTasks.Week01;

public class divisionWithoutOperator {

        public static void main(String[] args) {
 divide(13,5);

        }

        public static int divide(int dividend, int divisor) {

            int quotient = 0;
            int remainder = dividend;
            if (divisor == 0) {
                System.out.print("Cannot divide by zero");
            }

            while (remainder >= divisor) {
                remainder -= divisor;
                quotient++;
            }

            System.out.println("the remainder is : " + remainder);
            System.out.println("The quotient is : " + quotient);
            return quotient;

        }
    }



