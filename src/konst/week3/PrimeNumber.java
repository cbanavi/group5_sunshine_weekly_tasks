/*
Write a method that can check if a number is prime or not
*/

package konst.week3;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(89));
    }

    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisibility up to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // If divisible by any number in the range, it's not prime
            }
        }

        return true; // If not divisible by any number in the range, it's prime
    }

}

