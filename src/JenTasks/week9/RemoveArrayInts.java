package JenTasks.week9;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveArrayInts {
    public static void main(String[] args) {
        // Initialized ArrayList with values from 1 to 150 using a loop
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 1; i <= 150; i++) {
            values.add(i);
        }
        removeValuesOver100(values);
        System.out.println("List holding values that are <=100 = " + values);

    }

    public static void removeValuesOver100(ArrayList<Integer> list) {

        // Used lambda expression to remove all elements greater than 100
        list.removeIf(value -> value > 100);

    }
}

/*
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
*/