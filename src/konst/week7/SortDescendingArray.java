package konst.week7;

/*
Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 20, 7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7}
*/

import java.util.Arrays;

public class SortDescendingArray {
    public static int[] sortDescending(int[] arr) {

        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    // If elements are in the wrong order, swap them
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }
}
