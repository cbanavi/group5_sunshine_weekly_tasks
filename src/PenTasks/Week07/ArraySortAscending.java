package PenTasks.Week07;

import java.util.Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort1(new int[]{10, 9, 7, 8})));
        System.out.println(Arrays.toString(sort2(new int[]{10, 9, 7, 8})));
    }
    public static int[] sort1(int[] arr) {
//search arr for the minimum value
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // change the found minimum element with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;


    }
    public static int[] sort2(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        // change arr[i] and arr[j]
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr;

        }

}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */