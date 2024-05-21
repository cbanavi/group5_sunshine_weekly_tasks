package JenTasks.week4;

import java.util.HashSet;
import java.util.Set;

public class SameLetters {
    public static void main(String[] args) {
        String str1 = "calm";
        String str2 = "clam";
        System.out.println(areSameLetters(str1, str2));//prints:true

    }

    public static boolean areSameLetters(String str1, String str2) {
        if (str1.length() != str2.length()) {//if lengths are different, strings cannot have the same letters
            return false;
        }
        Set<Character> set1 = new HashSet<>();//set for characters in str1
        Set<Character> set2 = new HashSet<>();//set for characters in str2

        for (char each : str1.toCharArray()) {
            set1.add(each);//add each character of str1 to set1
        }
        for (char each : str2.toCharArray()) {//add each character of str2 to set2
            set2.add(each);
        }
        return set1.equals(set2);//returns true if both sets contain the same elements

    }


}


/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */