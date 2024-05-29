package faranak.week7;

import java.util.Arrays;

public class MinNum {

    public static void main(String[] args) {
        int[] arr = {3, 12, 15, 6, 9};
        System.out.println(minNum(arr));
    }
    public static int minNum(int[] arr) {
        Arrays.sort(arr);           //sorts the input array
         return arr[0];            //returns the first element of the sorted array which is the min number
    }
}
//Write a method that can find the minimum number from an int Array