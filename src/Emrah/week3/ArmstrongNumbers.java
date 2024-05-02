package Emrah.week3;

public class ArmstrongNumbers {
    // Define a class named ArmstrongNumber
    public static boolean isArmstrong(int number) {
        // Define a method named isArmstrong which takes an integer parameter 'number'
        int originalNumber = number;
        // Create a variable 'originalNumber' and assign the value of 'number' to it
        int sum = 0;
        // Create a variable 'sum' and assign 0 to it
        int numberOfDigits = String.valueOf(number).length();
        // Create a variable 'numberOfDigits' and assign the length of the string representation of 'number' to it

        // The while loop in this code iterates over each digit of the number to calculate the Armstrong sum.

        while (number > 0) {
            // Start a while loop which runs until 'number' is greater than 0
            int digit = number % 10;
            // Get the last digit of 'number' and store it in 'digit'
            sum += Math.pow(digit, numberOfDigits);
            // Add the cube of 'digit' to 'sum'
            number /= 10;
            // Remove the last digit from 'number'
        }

        return sum == originalNumber;
        // Return true if 'sum' is equal to 'originalNumber', otherwise return false
    }

    public static void main(String[] args) {
        // Define the main method
        int number = 55;
        // Create a variable 'number' and assign the value 371 to it
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");

        }
    }
}
  //
/*
Write a method that can check if a number is
Armstrong number

Armstrong number - An Armstrong number of three digits is an integer
such that the sum of the cubes of its digits is equal to the number itself.
For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
 */