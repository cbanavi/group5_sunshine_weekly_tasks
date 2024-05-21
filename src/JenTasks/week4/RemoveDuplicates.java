package JenTasks.week4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str));//prints: ABC
    }

    public static String removeDuplicates(String str) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char each : str.toCharArray()) {// add each character of the string to a LinkedHashSet,which maintains insertion order and removes duplicates
            uniqueChars.add(each);
        }
        StringBuilder result = new StringBuilder();
        for (char each : uniqueChars) {//construct the result string from the unique characters
            result.append(each);
        }
        return result.toString();
    }

}

/*
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

 */