package chiyavan.week7;

import java.util.Arrays;

public class ArraySortDescending_Chiyavan {

    public static void main(String[] args) {
        int[] test = {6, -1, 0, 1, 2, 3, 4, 5}; //{-1, 0, 2, 3, 4, 5, 6}
        descendingArray(test);
    }

    public static void descendingArray(int[] originalArray) {


        for (int i = 0; i < originalArray.length; i++) { //This is iterating starting from 0 index, 6
            for (int j = i + 1; j < originalArray.length; j++) { //This is iterating starting from the following index of whatever i is on, 1 at first, -1
                if (originalArray[i] > originalArray[j]) { //If 6 is greater than -1, then
                    int temp = originalArray[i]; //Create temp variable to swap the 2 elements. temp = 6. So we can safely swap numbers in the array
                    originalArray[i] = originalArray[j]; //Since temp is safely holding originalArray[i], we can swap/equal originalArray[j] equal the following element, -1 .
                    originalArray[j] = temp;  //Then we grab temp, which is holding originalArray[i], 6, and swap it with the element to the right, -1, because it is greater than -1
                }
            }
        }

        System.out.println("The array in descending order = " + Arrays.toString(originalArray));

    }

}

/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
 arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */