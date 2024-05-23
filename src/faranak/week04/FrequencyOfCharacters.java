package faranak.week04;

import java.util.HashMap;
import java.util.Map;

public record FrequencyOfCharacters() {

    public static void main(String[] args) {
        String input = "AAABBCDDD";
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char ch : input.toCharArray())
            frequencies.merge(ch, 1, Integer::sum);
        System.out.println(frequencies);
    }
}
/*
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
