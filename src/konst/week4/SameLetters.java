/*
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
*/
package konst.week4;

import static konst.week4.FrequencyOfCharacters.frequencyOfChars;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(isSameLetters("abc", "cab"));
        System.out.println(isSameLetters("abc", "abb"));
    }

    public static boolean isSameLetters(String str1, String str2) {
        // Handle strings of different lengths
        if (str1.length() != str2.length()) {
            return false;
        }

        // Calculate character frequencies
        String freq1 = frequencyOfChars(str1);
        String freq2 = frequencyOfChars(str2);

        // Compare frequency strings
        return freq1.equals(freq2);
    }
}

