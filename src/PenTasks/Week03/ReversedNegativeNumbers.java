package PenTasks.Week03;

public class ReversedNegativeNumbers {
    public static void main(String[] args) {
        System.out.println("reverse : " + reverseNeg(-567));
    }

    public static int reverseNeg(int num) {
        if (num >= 0) {
            System.out.println("Please enter a negative number!");
        }

        num = -num;
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return reverse;
    }
}



/*
Write a return method that can reverse
negative number and return it as int
 */