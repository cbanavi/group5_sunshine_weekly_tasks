package JenTasks.week9;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        long[] array1 = {9L, 8L, 7L};
        long[] array2 = {5L, 3L, 1L};
        long[] result = concatArr(array1, array2); //method call to merge arrays and save into result variable

        System.out.println("Concatenated Array = " + Arrays.toString(result));
    }

    public static long[] concatArr(long[] arr1, long[] arr2) {
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        //Initialized Array to hold the concatenated result
        //It is created with enough space to hold all elements from both arrays
        long[] concatArr = new long[lengthArr1 + lengthArr2];

        // Copy elements from the 1st array to the concatenated array
        // arr1: source array from which elements are copied
        // 0: begin copying from the 0th index of arr1
        // concatArr: destination array where elements are copied
        // 0: start copying to the 0th index of concatArr
        // lengthArr1: number of elements to copy from arr1 to concatArr
        System.arraycopy(arr1, 0, concatArr, 0, lengthArr1);

        // Copy elements from the 2nd array to the placeholder (concatArr)
        // arr2: source array from which elements are copied
        // 0: start copying from the 0th index of arr2
        // concatArr: destination array where elements are copied
        // lengthArr1: start copying to the index right after the last index of 1st array (arr1) in concatArr
        // lengthArr2: number of elements to copy from arr2 to concatArr
        System.arraycopy(arr2, 0, concatArr, lengthArr1, lengthArr2);
        return concatArr;
    }
}

/*
1) Array - Concat two arrays
Write a return method that can concat two arrays
*/
