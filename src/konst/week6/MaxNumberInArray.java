package konst.week6;

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
*/

public class MaxNumberInArray {
    public static int findMax(int[] arr) {

        int max = arr[0]; // Assume the first element is the maximum

        // Iterate through the remaining elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {-12, 3, 7, 1, 9, 5, 0};
        System.out.println(findMax(numbers));
    }
}

