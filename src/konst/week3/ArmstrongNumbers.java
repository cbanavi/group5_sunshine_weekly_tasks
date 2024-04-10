/*
Write a method that can check if a number is Armstrong number

Armstrong number - An Armstrong number of three digits is an integer
such that the sum of the cubes of its digits is equal to the number itself.
For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
*/

package konst.week3;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isArmstrong(371));
    }

    public static boolean isArmstrong(int number) {
        // Store a copy of the input number for later comparison
        int originalNumber = number;

        // Variables to track the result and the number of digits
        int result = 0;
        int digits = 0;

        // Count the number of digits in the number
        for (int temp = number; temp > 0; temp /= 10) {
            digits++; // Increment the digit count for each iteration
        }

        // Calculate the sum of cubes of the digits
        for (int temp = number; temp > 0; temp /= 10) {
            int remainder = temp % 10;  // Extract the last digit
            result += Math.pow(remainder, digits); // Calculate the digit's cube and add to the result
        }

        // Check if the calculated result matches the original number
        return result == originalNumber;
    }


}