package PenTasks.Week03;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(primeFinder(5));
    }

    public static boolean primeFinder(int num) {
        if (num <= 1) {
            System.out.println("Please choose a number greater than 1!");
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(num + " is not a prime number.");
                return false;
            }


        }
        System.out.print(num + " is a prime number.");
        return true;

    }
}

/*
Write a method that can check if a number is
prime or not
 */
