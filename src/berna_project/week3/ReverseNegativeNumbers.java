package berna_project.week3;

public class ReverseNegativeNumbers {
    public static void main(String[] args) {
        System.out.println(reverseNegative(-123));

    }
    public static int reverseNegative(int num) {
        // Convert the number to a positive value if negative
        if (num > 0) {
            num =num * -1;
        }

        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }



        return reversed;
    }
}







 /*
Write a return method that can reverse
negative number and return it as int
 */