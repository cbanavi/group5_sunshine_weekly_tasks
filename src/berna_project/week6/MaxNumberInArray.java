package berna_project.week6;
/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array [1,2,5,9,2]
 */
public class MaxNumberInArray {
    public static void main(String[] args) {

        int[] input= {1,2,5,9,2};
        System.out.println(maxNumOfArray(input));
    }

public static int maxNumOfArray(int[] arr) {

    int max=0;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length - i; j++) {
            if (arr[j] > arr[i]) {
                max=arr[j];

            }
        }
    }
   return max;

}




}








