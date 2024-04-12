package faranak.week03;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        input.close();

        System.out.println(num + " is an Armstrong number? : " + ArmstrongNumberUsingWhile(num));

    }
    public static boolean ArmstrongNumberUsingWhile(int num) {

        // Initialize a variable temp to the value of input num
        int temp = num;
        int sum = 0;

        // find the length of the input number
        int length = String.valueOf(num).length();

        //Loop until temp is greater than 0
        while (temp > 0) {
            // Obtain the last digit
            int lastDigit = temp % 10;

            // add the cube of the last digit to sum
            sum += (int) Math.pow(lastDigit, length);

            // remove the last digit
            temp /= 10;
        }
        // Check if the sum of cubes of digits is equal to the original number
        return sum == num;
    }
}



