/* Write  a method which can identifies given number is even or odd */

package konst.week1;

public class oddOrEven {
    public static void main(String[] args) {
        checkEvenOdd(12); // Calls the checkEvenOdd function with the number 12
    }

    public static void checkEvenOdd(int number) {
        // Uses the modulo operator (%) to check divisibility by 2.
        // If the remainder is 0, the number is even.
        System.out.println(number % 2 == 0 ? "even" : "odd");
    }
}
