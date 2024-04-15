package chiyavan.week3;

public class ReverseNegativeNumbers_Chiyavan {

    public static void main(String[] args) {
        reverseNegativeNumber(-1234);
    }

    public static void reverseNegativeNumber(int n) {
        int reversedNumber = 0;




        while (n != 0) {
            int lastNumber = n % 10; //Gets last number
            reversedNumber = reversedNumber * 10 + lastNumber; //Starts the reversed number. Since it is initalized as 0, it just adds the last digit.
            n /= 10; //Gets rid of last number
        }

        System.out.println(reversedNumber);
    }
}



/*
Write a return method that can reverse
negative number and return it as int
 */