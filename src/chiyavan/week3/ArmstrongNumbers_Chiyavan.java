package chiyavan.week3;

public class ArmstrongNumbers_Chiyavan {

    public static void main(String[] args) {

        armstrongChecker(153);

    }

    public static void armstrongChecker(int n) {

        if (n < 100 || n > 999) {
            throw new RuntimeException("HAS TO BE 3 DIGITS");
        }

        int digit, remainder, result = 0;

        digit = n;

        while (digit != 0) {
            remainder = digit % 10;
            result += remainder * remainder * remainder;
            digit /= 10;
        }

        if (result == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}

/*
Write a method that can check if a number is
Armstrong number

Armstrong number - An Armstrong number of three digits is an integer
such that the sum of the cubes of its digits is equal to the number itself.
For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.

//Todo    Create a method that will accept a number (int). Return a boolean: true if the given number is an Armstrong number
//    or false if it is not — Armstrong number is a number that will take each digit of the number and raise it to the power of the number’s length.
//    Then the results of each operation will be added together. The final result of all the operations will be equal to
//    the original number for an Armstrong number.
//    *** In our case we will look at only 3 digit numbers, but if you want an extra challenge, make your code dynamic so it will check any digit length
//    Ex:
//  > input: 153  > output: true
 */
