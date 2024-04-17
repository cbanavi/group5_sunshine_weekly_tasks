package faranak.week03;

public class ReverseNegativeNumbers {

    public static void main(String[] args) {

        System.out.println(reverseNegativeNum(-123));
    }
    public static int reverseNegativeNum(int num) {

        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;   //adds the current digit to the left of the temp variable
            num /= 10;                            //removes the last digit
        }
        return reverse;
    }
}

/*
Write a return method that can reverse
negative number and return it as int
 */