/*
Write a return method that can reverse negative number and return it as int
*/

package konst.week3;

public class ReverseNegativeNumbers {

    public static void main(String[] args) {
        System.out.println(reverseNegative(-89));
    }

    public static int reverseNegative(int num) {
        // Handle non-negative numbers
        if (num >= 0) {
            return num;
        }

        // Make the number positive for reversing
        num = -num;

        // Initialize the reversed number
        int reversed = 0;

        // Reverse the digits
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        // Make the reversed number negative and return
        return -reversed;
    }

}

