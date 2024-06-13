package berna_project.week6;

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
public class SumOfDigitsInString {

    public static void main(String[] args) {
        System.out.println(sumOfDigit("B2erna34")); //9
    }


    public static int sumOfDigit(String str) {
        int digits=0;

//parse() method----- it converts a string into primitive type, return primitive
//valueOf() ------ return wrapper class object
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += Integer.parseInt(String.valueOf(each));  //unboxing

            }

        }

       return digits;

    }


}

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */

