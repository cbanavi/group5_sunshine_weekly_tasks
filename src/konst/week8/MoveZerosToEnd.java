/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array
(Do Not Use Sort Method)
Ex: input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
*/

package konst.week8;

public class MoveZerosToEnd {

    public static void moveZerosToEnd(int[] arr) {
        int boundary = 0; // Index to mark the boundary between non-zeros and zeros

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // If the current element is non-zero, place it before the boundary
                arr[boundary] = arr[i];
                boundary++;
            }
        }

        // Fill the rest of the array with zeros
        while (boundary < arr.length) {
            arr[boundary] = 0;
            boundary++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}

