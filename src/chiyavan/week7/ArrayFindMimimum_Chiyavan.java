package chiyavan.week7;

public class ArrayFindMimimum_Chiyavan {

    public static void main(String[] args) {
        int[] test = {1, 5, 10, 300, -5};
        minimumArray(test);
    }

    public static void minimumArray(int[] originalArray) {

        int min = originalArray[0]; //Sets minimum number as first index from the array, which is 1

        for (int each : originalArray) { //Iterates using for each loop

            if (each < min) { //If each value, (starting from index 1 since min is index 0), 5, the elements in the array, is less than the first element of the array, 1,  then
                min = each; //Assign each to min value
            }


        }

        System.out.println("The minimum number from the array = " + min); //1 is not greater than 5, 1 is not greater than 10, ... 1 is greater than -5, so -5 is the minimum number in the array

    }

}

/*
Write a method that can find the minimum number from an int Array
 */