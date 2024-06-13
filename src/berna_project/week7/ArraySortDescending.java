package berna_project.week7;

import java.util.Arrays;

public class ArraySortDescending {
    public static void main(String[] args) {

        int[] input = {45,102,12,67};
        System.out.println(Arrays.toString(sortDesc(input)));  //[102, 67, 45, 12]

    }

    private static int[] sortDesc(int[] array) {

        int n = array.length;

        // Selection Sort Algorithm for descending order
        for (int i = 0; i < n - 1; i++) {
            // Find the maximum element in the remaining unsorted array
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the first element of the unsorted part
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
    }


/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */