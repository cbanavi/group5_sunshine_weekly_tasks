package JenTasks.week6;
public class MaxNumberInArray {
    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] sample = {0, 9, 3, 29, 7, 1, 17};
        System.out.println("findMaximum(sample) = " + findMaximum(sample));
    }
}

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
