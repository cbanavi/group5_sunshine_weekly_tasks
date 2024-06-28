package chiyavan.week7;

import java.util.Arrays;

public class ArraySortAscending_Chiyavan {

    public static void main(String[] args) {
        int[] test = {5, 4, 3, 2, 1, 0, -1, 6}; //{-1, 0, 2, 3, 4, 5, 6}
        ascendingArray(test);
    }

    public static void ascendingArray(int[] originalArray) {


        for (int i = 0; i < originalArray.length; i++) { //This is iterating starting from 0 index, 5
            for (int j = i + 1; j < originalArray.length; j++) { //This is iterating starting from the following index of whatever i is on, 1 at first, 4
                if (originalArray[i] > originalArray[j]) { //If 5 is greater than 4, then
                    int temp = originalArray[i]; //Create temp variable to swap the 2 elements. temp = 5. So we can safely swap numbers in the array
                    originalArray[i] = originalArray[j]; //Since temp is safely holding originalArray[i], we can swap/equal originalArray[i] equal the following element, 4.
                    originalArray[j] = temp;  //Then we grab temp, which is holding originalArray[i], 5, and swap it with the element to the right, 4, because it is less than 5
                }
            }
        }

        System.out.println("The array in ascending order = " + Arrays.toString(originalArray));

        }


    }



/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */