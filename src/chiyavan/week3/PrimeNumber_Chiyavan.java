package chiyavan.week3;

public class PrimeNumber_Chiyavan {

    public static void main(String[] args) {

        System.out.println(primeNumberChecker(101));

    }

    public static boolean primeNumberChecker(int n) {

        if (n <= 1) {
            throw new RuntimeException("Prime numbers are greater than 1");
        }

        for (int i = 2; i * i <= n; i++) {

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