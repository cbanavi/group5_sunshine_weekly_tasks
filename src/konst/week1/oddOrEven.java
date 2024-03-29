/* Write  a method which can identifies given number is even or odd */

package konst.week1;

public class oddOrEven {
    public static void checkEvenOdd(int number) {
        System.out.println(number % 2 == 0 ? "even" : "odd");
    }

    public static void main(String[] args) {
        checkEvenOdd(12);
    }
}