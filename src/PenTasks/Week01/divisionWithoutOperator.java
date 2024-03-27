package PenTasks.Week01;

public class divisionWithoutOperator {

    public static void main(String[] args) {
        divide(-18, 5);

    }

    public static int divide(int dividend, int divisor) {
// if divisor is equal to zero

        if (divisor == 0) {
            throw new ArithmeticException("Not divisible by zero");
        }


        // for handling negative numbers :

         int coefficient = 1;
         if ((dividend < 0) ^ (divisor < 0)) {
       coefficient = -1;}

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);




            int quotient = 0;
            int remainder = dividend;
        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        System.out.println("the remainder is : " + coefficient*remainder);
        System.out.println("The quotient is : " + coefficient*quotient);
        //return quotient;
        return coefficient*quotient ;

    }
}



