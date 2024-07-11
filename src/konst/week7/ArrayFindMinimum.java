package konst.week7;

/*
Array - Find Minimum
Write a method that can find the minimum number from an int Array
*/

public class ArrayFindMinimum {
    public static int findMin(int[] arr) {

        int min = arr[0]; // Assume the first element is the maximum

        // Iterate through the remaining elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update max if a larger element is found
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {-12, 3, 7, 1, 9, 5, 0};
        System.out.println(findMin(numbers));
    }
}

