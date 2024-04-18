package JenTasks.week3;

public class t1_PrimeNumber {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {// 2 is the smallest prime number -> 2*1=2
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; //if n is divisible by i, it is not a prime number
            }
        }
        return true; //if no divisors were found, n is a prime number
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 8, 21, 23};
        for (int each : numbers) {
            boolean isPrime = isPrimeNumber(each);
            if (isPrime) {
                System.out.println(each + " is prime number.");
            } else {
                System.out.println(each + " is not a prime number.");
            }
        }
    }
}
/*
Write a method that can check if a number is
prime or not
 */