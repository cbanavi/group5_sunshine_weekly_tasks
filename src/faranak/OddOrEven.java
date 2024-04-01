package faranak;

public class OddOrEven {
    public static void main(String[] args) {

        oddOrEven(7);
    }
    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }
}
//Write  a method which can identifies given number is even or odd