package Sami.Week1;



    public class divisionWithoutOperator {

        public static void main(String[] args) {

            System.out.println(divide(0, 0));
        }

        public static double divide(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }

            int sign = 1;
            if (a < 0) {
                a = -a;
                sign = -sign;
            }
            if (b < 0) {
                b = -b;
                sign = -sign;
            }

            double result = 0;

            while (a >= b) {
                a -= b;
                result++;
            }

            return sign * result;
        }
    }
