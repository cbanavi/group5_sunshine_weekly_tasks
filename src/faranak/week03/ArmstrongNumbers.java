package faranak.week03;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        int number = 153;
        System.out.println(isArmstrong(number));

    }
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == number;
    }
}

/*
Write a method that can check if a number is
Armstrong number

Armstrong number - An Armstrong number of three digits is an integer
such that the sum of the cubes of its digits is equal to the number itself.
For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
 */