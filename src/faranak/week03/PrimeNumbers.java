package faranak.week03;

public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {        //loops through integers from 2 to n
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
/*
Write a method that can check if a number is
prime or not
 */