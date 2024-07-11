package chiyavan.week9;

import java.util.Arrays;

public class ConcatArray_Chiyavan {

    public static void main(String[] args) {
        String[] test1 = {"This", "Will", "Concat"};
        String[] test2 = {"Concat", "Two", "Arrays"};
        concatArrays(test1, test2);


    }

    public static void concatArrays(String[] firstArr, String[] secondArr) {

        int lengthOfArr = firstArr.length + secondArr.length;
        String[] combinedArray = new String[lengthOfArr];

        for (int i = 0; i < firstArr.length; i++) {
            combinedArray[i] = firstArr[i];
        }

        for (int j = 0; j < secondArr.length; j++) {
            combinedArray[firstArr.length] = secondArr[j];
        }

        System.out.println("combinedArray = " + Arrays.toString(combinedArray));

    }

}

/*
1) Array - Concat two arrays
Write a return method that can concate two arrays
*/