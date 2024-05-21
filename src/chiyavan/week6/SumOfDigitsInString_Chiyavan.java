package chiyavan.week6;

public class SumOfDigitsInString_Chiyavan {

    public static void main(String[] args) {
        System.out.println(sumOfStringDigits("5abc5"));
    }


    static int sumOfStringDigits(String stringDigits) {
        int result = 0;
        StringBuilder temporary = new StringBuilder("0");

        for (char each : stringDigits.toCharArray()) {
            if (Character.isDigit(each)) {
                temporary.append(each);
            } else {
                result += Integer.parseInt(temporary.toString());

                temporary = new StringBuilder("0");
            }
        }
        return result + Integer.parseInt(temporary.toString());
    }





}

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
