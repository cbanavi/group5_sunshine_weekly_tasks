package berna_project.week3;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumOrNot(17));
    }

    public static boolean primeNumOrNot (int n){

        //prime num has only 2 divisor 1 and itself.smallest prime num is 2
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // If the number is divisible by any number from 2 to sqrt(num), it's not prime
            }
        }
        return true; // If the number is not divisible by any number from 2 to sqrt(num), it's prime
    }
}



/*
Write a method that can check if a number is
prime or not
 */


