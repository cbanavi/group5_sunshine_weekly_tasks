package faranak.week7;

import java.util.Arrays;

public class SortAscending {

    public static void main(String[] args) {

        int[] arr = {72, 12, 66, 81, 99, 33, 45};

        System.out.println(Arrays.toString(sortAsc(arr)));

    }

    public static int[] sortAsc(int[] arr) {

        for (int i = 0; i < arr.length; i++) {            //loops through each element of the array
            for (int j = i + 1; j < arr.length; j++) {    //loops through remaining elements of the array after the current element
                if (arr[i] > arr[j]) {                    //if the current element is greater than the next element, swap the elements
                    int temp = arr[i];                    //temp var is used as a temp holder to swap the elements
                    arr[i] = arr[j];                      //swap the elements
                    arr[j] = temp;                        //swap the current element with the next element
                }
            }
        }
        return arr;                                        //return the sorted array

    }

}
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
// Ex: int[] arr = {10, 9, 8, 7};
//arr = Sort(arr); ==>{ 7, 8, 9, 10};