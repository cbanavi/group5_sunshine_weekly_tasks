package chiyavan.week1;

public class oddOrEven_Chiyavan {
    public static void oddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public static void main(String[] args) {
        oddEven(0);
    }
}