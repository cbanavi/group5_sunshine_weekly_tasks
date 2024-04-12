package faranak.week03;

public class ReverseNegativeNumbers {

    public static void main(String[] args) {
        int n = -123;
        System.out.println(reverse(n));
    }
    public static int reverse(int n) {

        int temp = 0;
         while (n!= 0) {                      //loops through each digit
             temp = temp * 10 + n % 10;      //adds the current digit to the left of the temp variable
             n /= 10;                       //removes the last digit
        }
         return temp;


    }
}

/*
Write a return method that can reverse
negative number and return it as int
 */