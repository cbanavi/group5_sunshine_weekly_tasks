package chiyavan.week5;

import java.util.*;

public class UniqueString_Chiyavan {

    public static void main(String[] args) {
        System.out.println(Unique("AAABBBCCCDEF"));
    }

    public static String Unique(String originalString) {

        StringBuilder uniqueString = new StringBuilder();

        for (char each : originalString.toCharArray()) {
            if (originalString.indexOf(each) == originalString.lastIndexOf(each)) {
                uniqueString.append(each);
            }
        }

        return uniqueString.toString();

    }

}

/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
