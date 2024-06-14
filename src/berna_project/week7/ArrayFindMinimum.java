package berna_project.week7;

public class ArrayFindMinimum {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 13, 5, 8};

        int minNumber = minNum(numbers);
        System.out.println(minNumber);


    }

    public static int minNum(int[] arr) {

        // Initialize min to the first element of the array
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }
}
/*
Write a method that can find the minimum number from an int Array
 */