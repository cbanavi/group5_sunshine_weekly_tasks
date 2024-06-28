package chiyavan.week8;

import java.util.Arrays;

public class MoveZerosToEnd_Chiyavan {

    public static void main(String[] args) {

        int[] test = {1, 0, 2, 0, 3, 0, 4, 0, 5, 5};
        moveZeros(test);
    }

    public static void moveZeros(int[] originalArray) {

        int[] zerosRightSide = new int[originalArray.length];
        int index = 0;

        for (int each : originalArray) {

            if (each != 0) { //Takes all the elements that are not 0
                zerosRightSide[index++] = each; //Adds non-zero elements to new array and increases the index by 1 after its been added
                //Since zeroRightSide Array is the same length as originalArray, it will naturally fill the rest of the array with zeros
            }

        }



        System.out.println("zerosRightSide = " + Arrays.toString(zerosRightSide));

    }

}

/*

Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]

 */