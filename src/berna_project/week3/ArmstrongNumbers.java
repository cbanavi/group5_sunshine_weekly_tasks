package berna_project.week3;
//Armstrong number is equal to the sum of its own digits
public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(ArmstrongNum(371));

    }

    public static boolean ArmstrongNum(int num){

        int originalNumber = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        // Calculate the sum of the cubes of digits
        //Inside the loop, this line extracts the last digit of num using the modulo operator %. it gives digit of numbers
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        //compare the sum of the cubes of digits with the original number.
        return sum == originalNumber;
    }



/*
length()  helps in determining the power to which each digit needs to be raised for the Armstrong number check.
 */










    }

/*
Write a method that can check if a number is
Armstrong number

Armstrong number - An Armstrong number of three digits is an integer
such that the sum of the cubes of its digits is equal to the number itself.
For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
 */