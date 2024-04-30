package berna_project.week4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */
public class SameLetters {
    public static void main(String[] args) {

        // Test cases
        System.out.println(sameOrNot("abc", "cab"));  // Output: true
        System.out.println(sameOrNot("abc", "abb"));  // Output: false
    }

    public static boolean sameOrNot(String str1, String str2) {

        // Check if the lengths of the strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }


        // Count each letter in both strings
        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (count1.containsKey(c)) {
                count1.put(c, count1.get(c) + 1);
            } else {
                count1.put(c, 1);
            }
        }

        // Count occurrences of each letter in the second string
        for (char c : str2.toCharArray()) {
            if (count2.containsKey(c)) {
                count2.put(c, count2.get(c) + 1);
            } else {
                count2.put(c, 1);

            }

        }
        // Check if the counts of each letter are the same in both strings
        return count1.equals(count2);

    }
}
