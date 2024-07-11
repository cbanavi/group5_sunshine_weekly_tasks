/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
*/
package konst.week8;

public class UniqueIntSumZero {
    public static int[] uniqueIntSumZero(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N must be between 1 and 100");
        }

        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i + 1; // Fill with 1, 2, 3, ..., N-1
            sum += result[i];
        }

        result[N - 1] = -sum; // Last element balances the sum to zero
        return result;
    }

    public static void main(String[] args) {
        int N = 8; // Example input
        int[] result = uniqueIntSumZero(N);
        System.out.println(java.util.Arrays.toString(result));
    }
}

