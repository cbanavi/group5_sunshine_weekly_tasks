package berna_project.week7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] numbers = {30, 112, 54, 42};
        System.out.println(Arrays.toString(sortArray(numbers))); //[30, 42, 54, 112]

    }

    public static int[] sortArray(int[] arr) {

        // Selection Sort Algorithm
        for (int i = 0; i < arr.length-1; i++) {
            // Find the minimum element in unsorted array
            int minIndex =i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    minIndex = j;

                }
            }
            //swap the minIndex to first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp; //put the min index as a first element of array


        }
        return arr;
    }

}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */