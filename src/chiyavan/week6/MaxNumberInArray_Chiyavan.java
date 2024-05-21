package chiyavan.week6;

import java.util.Collections;

public class MaxNumberInArray_Chiyavan {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 20, 70, 200};
        maxIntArray(array);

    }

    public static void maxIntArray(int[] originalArray) {

        int max = Integer.MIN_VALUE;

        for (int each : originalArray) {
            if (each > max) {
                max = each;
            }
        }

        System.out.println(max);

    }

}

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
