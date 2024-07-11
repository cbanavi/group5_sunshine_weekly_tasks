package chiyavan.week9;

import java.util.Arrays;

public class ConcatArray_Chiyavan {

    public static void main(String[] args) {
        String[] test1 = {"This", "Will", "Concat"};
        String[] test2 = {"All", "Two", "Arrays"};
        concatArrays(test1, test2);


    }

    public static void concatArrays(String[] firstArr, String[] secondArr) {

        int lengthOfArr = firstArr.length + secondArr.length; //This is to make sure the new array can hold everything in the other 2 arrays
        String[] combinedArray = new String[lengthOfArr]; //To add the concatted arrays

        int index = 0; //Easier to use this to add to the combinedArr so it keeps up with the element placing

        // Copy elements from firstArr to combinedArray
        for (int i = 0; i < firstArr.length; i++) { //Simply adds everything from the firstArr to the combinedArray
            combinedArray[index] = firstArr[i]; //Adding everything starting at combinedArray[0] from firstArr[0] until length is reached
            index++; //Will stop once the firstArr.length is reached
        }

        // Copy elements from secondArr to combinedArray
        for (int i = 0; i < secondArr.length; i++) {
            combinedArray[index] = secondArr[i]; //Starts at the combinedArr[index]  which is where the firstArr.length was reached
            index++;
        }

        System.out.println("combinedArray = " + Arrays.toString(combinedArray));
    }


}

/*
1) Array - Concat two arrays
Write a return method that can concate two arrays
*/