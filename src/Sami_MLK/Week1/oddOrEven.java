package Sami_MLK.Week1;

public class oddOrEven {
    public static void main(String[] args) {


            int number = 100;
            System.out.println(identifyNumberType(number));

        }
        public static String identifyNumberType(int number) {
            if (number % 2 == 0) {
                return "even";
            } else {
                return "odd";
            }
        }



    }
//Write  a method which can identifies given number is even or odd
