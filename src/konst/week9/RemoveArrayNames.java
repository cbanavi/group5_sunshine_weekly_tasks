/*
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
*/
package konst.week9;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayNames {
    public static void removeArrayNames(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Ahmed")) {
                names.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ahmed", "John", "Eric", "Ahmed"));
        removeArrayNames(names);

        System.out.println("Modified list: " + names);
    }
}

