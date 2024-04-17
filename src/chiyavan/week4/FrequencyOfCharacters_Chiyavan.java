package chiyavan.week4;

import java.util.*;

public class FrequencyOfCharacters_Chiyavan {

    public static void main(String[] args) {

        countCharacters("AAABBCDD");

    }

    public static void countCharacters(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer value = map.get(c);
            if (value != null) {
                map.put(c, value + 1);
            } else {
                map.put(c, 1);
            }

        }

        map.forEach((k, v) -> System.out.print(k.toString() + v));

    }
}

/*
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */