package chiyavan.week9;

import java.util.Arrays;

public class ConcatArray_Chiyavan {

    public static void main(String[] args) {
        String[] test1 = {"This", "Will", "Concat"};
        String[] test2 = {"All", "Two", "Arrays"};
        concatArrays(test1, test2);


    }

    public static void concatArrays(String[] firstArr, String[] secondArr) {

        int lengthOfArr = firstArr.length + secondArr.length;
        String[] combinedArray = new String[lengthOfArr];

        int index = 0;

        // Copy elements from firstArr to combinedArray
        for (int i = 0; i < firstArr.length; i++) {
            combinedArray[index] = firstArr[i];
            index++;
        }

        // Copy elements from secondArr to combinedArray
        for (int i = 0; i < secondArr.length; i++) {
            combinedArray[index] = secondArr[i];
            index++;
        }

        System.out.println("combinedArray = " + Arrays.toString(combinedArray));
    }


}

/*
1) Array - Concat two arrays
Write a return method that can concate two arrays
*/