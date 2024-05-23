package JenTasks.week5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueString {
    public static String isUnique(String str) {
        Set<Character> moreThenOnce = new HashSet<>();
        Set<Character> onlyOnce = new HashSet<>();
        for (char each : str.toCharArray()) {
            if (!onlyOnce.add(each)) {//checks if the character is in the set
                moreThenOnce.add(each);//If add(each) returns false, the character is added to the moreThenOnce set, indicating it has been seen more than once.
            }
        }
        StringBuilder uniqueCharsBuilder = new StringBuilder();
        for (char each : str.toCharArray()) {
            if (!moreThenOnce.contains(each)){
                uniqueCharsBuilder.append(each);
            }
        }
        return uniqueCharsBuilder.toString();
    }

    public static String isUniqueUsingMap(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for (char each : str.toCharArray()) {
            map.put(each, map.getOrDefault(each, 0) + 1);//If the key each is present in the map, it returns the current count of each
            //If the key each is not present in the map, it returns the default value 0
            //The + 1 adds 1 to the retrieved count. This process repeats for each character in the string, updating (adding 1) the count for each character.
        }
        StringBuilder builder = new StringBuilder();
        for (char each : str.toCharArray()) {
            if (map.get(each) == 1) {
                builder.append(each);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String sample = "AAABBBCCCDEF";
        System.out.println("isUnique(sample) = " + isUnique(sample));
        System.out.println("isUniqueUsingMap(sample) = " + isUniqueUsingMap(sample));
    }
}

/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
