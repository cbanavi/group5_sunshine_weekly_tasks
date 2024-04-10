/*
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
*/

package konst.week4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }

    public static String removeDup(String str) {
        // Create a StringBuilder to store the unique characters
        StringBuilder result = new StringBuilder();

        // Create a HashSet to keep track of characters already seen
        Set<Character> seen = new HashSet<>();

        // Iterate over each character in the input string
        for (char c : str.toCharArray()) {
            // Attempt to add the character to the 'seen' set.
            // add() returns true if the character was NOT in the set before (i.e., it's unique)
            if (seen.add(c)) {
                // If the character is unique, append it to the result StringBuilder
                result.append(c);
            }
        }

        // Convert the StringBuilder to a String and return the result
        return result.toString();
    }

}

