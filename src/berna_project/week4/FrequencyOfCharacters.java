package berna_project.week4;

import java.util.HashMap;
import java.util.Map;

/*
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(frequencyOfChars(input)); // Output: A3B2C1D2

    }
    public static String frequencyOfChars(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        // Counting the frequency of each character
        for (char c : s.toCharArray()) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        // Constructing the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }


}





