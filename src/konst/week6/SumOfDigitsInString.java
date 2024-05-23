package konst.week6;

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
*/

public class SumOfDigitsInString {
    public static int sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to its integer value and add it to the sum
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("12345"));
        System.out.println(sumOfDigits("abc12de3fg"));
    }
}



