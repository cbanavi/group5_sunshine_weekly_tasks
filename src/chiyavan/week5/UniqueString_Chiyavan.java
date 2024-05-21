package chiyavan.week5;

import java.util.*;

public class UniqueString_Chiyavan {

    public static void main(String[] args) {
        System.out.println(Unique("AAABBBCCCDEF"));
    }

    public static String Unique(String originalString) {

        Set<Character> set = new HashSet<>();
        StringBuilder uniqueString = new StringBuilder();

        for (char each : originalString.toCharArray()) {
            set.add(each);
        }

        for (char each : set) {
            uniqueString.append(each);
        }


        return uniqueString.toString();

    }

}

/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
