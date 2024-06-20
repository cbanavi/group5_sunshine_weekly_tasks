package PenTasks.Week07;

import java.util.Arrays;

public class ArraySortDescending {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDesc(new int[]{10, 8, 9, 7,})));
    }




    public static int[] sortDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
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
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */