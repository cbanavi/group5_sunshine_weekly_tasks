package faranak.week04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SameLetters {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "acb";
        System.out.println(isSameLetters(word1, word2));
    }
    public static boolean isSameLetters(String word1, String word2) {

        if (word1.equals(word2)) {
            return true;
        } else if (word1.length() != word2.length()) {
            return false;
        } else {
            return new HashSet<>(Arrays.stream(word1.split("")).collect(Collectors.toList())).containsAll(Arrays.stream(word2.split("")).toList());
        }
    }
}
/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
