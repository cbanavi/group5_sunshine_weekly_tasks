package JenTasks.week6;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        String sample = "S1t2r3i4n5G";
        System.out.println("sumOfDigits(sample) = " + sumOfDigits(sample));

    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (char each :str.toCharArray() ) {
            if (Character.isDigit(each)) {
                sum+=Character.getNumericValue(each);
            }
        }
        return sum;
    }
}

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
