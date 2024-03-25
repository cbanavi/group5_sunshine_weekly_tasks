package PenTasks.Week01;

public class division_Without_Operator {

        public static void main(String[] args) {
 divide(13,-5);

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
          //  int coefficient = 1;
          //  if (divisor<0 || dividend<0){
               // coefficient = -1;}

            System.out.println("the remainder is : " + remainder);
            System.out.println("The quotient is : " + quotient);
            return quotient;
            //return quotient * coefficient;

        }
    }



