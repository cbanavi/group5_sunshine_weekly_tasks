package chiyavan.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveArrayInts_Chiyavan {

    public static void main(String[] args) {
        ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList(1, 100, 43, 99, 500, 302, 109));
        removeValues(test1);
    }

    public static void removeValues(ArrayList<Integer> originalArrList) {

        ArrayList<Integer> newArrList = new ArrayList<>();

        for (Integer each : originalArrList) {
            if (each <= 100) {
                newArrList.add(each); //If an element of the ArrayList is less than or equal to 100, add to newArrList
            }
        }

        System.out.println("newArrList = " + newArrList);

    }
}

/*
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
*/