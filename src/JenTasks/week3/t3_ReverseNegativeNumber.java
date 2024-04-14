package JenTasks.week3;

public class t3_ReverseNegativeNumber {
    public static int reverseNegative(int n) {
        if (n > 0) {
            throw new IllegalArgumentException("Function for negative numbers only.");
        }
        int result = 0;
        if (n < 0) {
            result = n * (-1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] negatives = {-1, -259, -7821, -8912};
        for (int each : negatives) {
            System.out.println(reverseNegative(each));
        }

    }
}
//Write a return method that can reverse negative number and return it as int
