/*
1) Array - Concat two arrays
Write a return method that can concat two arrays
*/
package konst.week9;

import java.util.Arrays;

public class ConcatArray {
    public static Object[] concatArray(Object[] array1, Object[] array2) {
        Object[] result = new Object[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }

    public static void main(String[] args) {
        Integer[] numbers1 = {1, 2, 3};
        Integer[] numbers2 = {4, 5, 6};
        Object[] concatenatedNumbers = concatArray(numbers1, numbers2);
        System.out.println(Arrays.toString(concatenatedNumbers));

        String[] words1 = {"Hello", "World"};
        String[] words2 = {"Java", "Programming"};
        Object[] concatenatedWords = concatArray(words1, words2);
        System.out.println(Arrays.toString(concatenatedWords));
    }
}

