package JenTasks.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveArrayNames {
    public static void main(String[] args) {

        // Initialized a modifiable list reference of names, including duplicates, holding a new ArrayList
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Emily"));

        removeNameAhmed(names);

        System.out.println(names);
    }

    public static void removeNameAhmed(List<String> names) {

        // Used removeIf with a lambda expression to remove all elements that match the condition
        names.removeIf(name -> name.equals("Ahmed"));
    }
}

/*
2) ArrayList - Remove "Ahmed"
Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/