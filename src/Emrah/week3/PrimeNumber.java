package Emrah.week3;

public class PrimeNumber {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {

        if (number <= 1) { // Check if the number is less than 2
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check if the number is divisible by any integer from 2 to itself - 1
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any integer, it's not prime
            }
        }

        return true; // If the number is not divisible by any integer, it's prime
    }

    public static void main(String[] args) {
        int number = 7; // Test number
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
/*
       - A prime number is a natural number greater than 1 that has no positive divisors other than
    1 and itself. In other words, a prime number is only divisible by 1 and itself, and it has
    exactly two distinct positive divisors.
 */
/*
Write a method that can check if a number is
prime or not
 */ //