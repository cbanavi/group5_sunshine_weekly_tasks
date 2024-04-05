package Eren.week1;

public class oddOrEven {
        public static void main(String[] args) {
            //Write  a method which can identifies given number is even or odd


            System.out.println(oddOrEvenCheck(5));

        }

        public static String oddOrEvenCheck(double a) {
            if (a % 2 == 0) {
                return "even";
            }
            else {
                return "odd";
            }

        }

    }
