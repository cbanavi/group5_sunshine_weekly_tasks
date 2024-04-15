package JenTasks.week3;

public class t3_ReverseNegativeNumber {
    public static int reverseNegative(int n) {
        if (n > 0) {
            throw new IllegalArgumentException("Function for negative numbers only.");
        }
        int result = 0;

        while (n != 0) {
            int remainder = n % 10; // retrieve the last digit ex: -112%10=-11.2; -2 is a remainder
            //-11%10=-1.1; -1 is a remainder; -1%10= -0.1; -1 is the last remainder
            result = result * 10 + remainder;//append to the result ex: 0*10+(-2)=-2
            //-2*10+(-2)=-20+(-1)=-21 // -21*10(-1)=-210+(-1)=-211;
            n /= 10; // Decrement n by dividing it by 10: -112/10=11; //-11/10=-1 //-1/10=0

        }
        return result;
    }

    public static void main(String[] args) {
        int[] negatives = {-18,-112, -259, -7821, -8912};

        for (int each : negatives) {
            System.out.println(reverseNegative(each));
        }

    }
}
//Write a return method that can reverse negative number and return it as int
