package JenTasks.week3;

public class t2_ArmstrongNumbers {
    public static boolean isArmstrongNumber(int n) {

        if (n < 0) {
            return false; // Armstrong numbers can not be negative
            //making this code dynamic,so it will check any digit length
        }
        // Call getResult to compute the Armstrong sum of digits raised to the power of their count
        int result = getResult(n);
        return result == n; // return true if the sum of the digits' powers equals the original number

    }

    private static int getResult(int n) {
        int power = 0;// determine the power (number of digits)
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            power++;//increment power for each digit found
        }
        temp = n; // reset temp back to original number in our case to 153 for further calculations
        int result = 0; // to store the sum of powers of each digit
        while (temp != 0) {
            int remainder = temp % 10;// extracting the last digit from temp
            result += (int) Math.pow(remainder, power); //calculate the power of the digit and add it to the result
            temp /= 10; //remove the last digit from the temp
        }
        return result;
    }

    public static void main(String[] args) {
        // Test the function with different numbers
        // Define an array of integers to test for Armstrong numbers.
        // int[] declares an array type holding integers.
        int[] num = {0, 1, 153, 370, 371, 1634, 2917, 3819, 9999, 17_299};

        // The 'for-each' loop iterates over each element in the 'num' array.
        for (int each : num) {
            // Call isArmstrongNumber to check if 'each' is an Armstrong number.
            boolean isArmstrong = isArmstrongNumber(each);
            if (isArmstrong) {
                System.out.println(each + " is an Armstrong Number.");
            } else {
                System.out.println(each + " is not an Armstrong Number.");
            }
        }
    }

}
//          if (n < 100 || n > 999) {
//            return false;
//        } //Can be used if we are only checking 3-digit numbers






//Write a method that can check if a number is Armstrong number
//    Todo    Create a method that will accept a number (int). Return a boolean: true if the given number is an Armstrong number
//    or false if it is not — Armstrong number is a number that will take each digit of the number and raise it to the power of the number’s length.
//    Then the results of each operation will be added together. The final result of all the operations will be equal to
//    the original number for an Armstrong number.
//    *** In our case we will look at only 3 digit numbers, but if you want an extra challenge, make your code dynamic so it will check any digit length
//    Ex:
//  > input: 153  > output: true