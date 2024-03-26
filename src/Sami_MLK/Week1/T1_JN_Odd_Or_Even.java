package Sami_MLK.Week1;

public class T1_JN_Odd_Or_Even {

//Write  a method which can identifies given number is even or odd

    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd
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








