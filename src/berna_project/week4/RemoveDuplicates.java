package berna_project.week4;

import java.util.HashSet;
import java.util.Set;

/*
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        String input = "AAABBBCCC";
        System.out.println(removeDup(input)); // Output: ABC
    }


    public static String removeDup(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            boolean isDuplicate = false;


            // Check if the character is found later in the string
            for (int j = i + 1; j < s.length(); j++) {
                if (currentChar == s.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not found, append to result
            if (!isDuplicate) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}







