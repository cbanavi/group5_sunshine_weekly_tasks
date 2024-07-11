package chiyavan.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class RemoveArrayNames_Chiyavan {

    public static void main(String[] args) {
        ArrayList<String> test1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        removeValues(test1);
    }

    public static void removeValues(ArrayList<String> originalArrList) {

        ArrayList<String> newArrList = new ArrayList<>();

        for (String each : originalArrList) {
            if (!Objects.equals(each, "Ahmed")) {
                newArrList.add(each);
            }
        }

        System.out.println("newArrList = " + newArrList);

    }

}

/*
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
*/