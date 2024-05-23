package faranak.week6;

import java.util.Arrays;

public class MaxNum {

    public static void main(String[] args) {

        int[] arr = {3, 7, 6, 9,12};
        int output = maxNum(arr);
        System.out.println(output);

    }
    public static int maxNum(int[] arr) {
        Arrays.sort(arr);           //sorts the input array
        return arr[arr.length - 1]; //returns the last element of the sorted array which is the max number
    }

}
//Write a method that can find the maximum number from an int Array