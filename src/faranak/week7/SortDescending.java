package faranak.week7;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {

        int[] arr = {72, 12, 66, 81, 99, 33, 45};

        System.out.println(Arrays.toString(sortDesc(arr)));

    }

    public static int[] sortDesc(int[] arr) {

        for (int i = 0; i < arr.length; i++) {             //loops through each element of the array
            for (int j = i + 1; j < arr.length; j++) {     //loops through each element of the array after the current element
                if (arr[i] < arr[j]) {                     //if the current element is less than the next element, swap the elements
                    int temp = arr[i];                     //temp var stores the current element before swapping it with the next element
                    arr[i] = arr[j];                       //swap the current element with the next element
                    arr[j] = temp;                         //swap the next element with the current element
                }
            }
        }
        return arr;
    }
}
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
//arr = Sort(arr); ==> {90, 20, 10, 8, 7};
