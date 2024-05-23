package PenTasks.Week04;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDup2("AAADDDFFC"));

    }


public static String removeDup2 (String str){

    Set<Character> chars = new HashSet<>();

    StringBuilder removedDup = new StringBuilder();

    for(char each : str.toCharArray()){
        if (!chars.contains(each)){
            chars.add(each);
            removedDup.append(each);
        }

    }
    return removedDup.toString();
}


}

/*
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

 */
/* My attempt to use removeIf but it didnt work
    public static String removeDup1(String str) {
        // Convert the input string to a list of characters
        List<Character> charList = new ArrayList<>();
        for (char each : str.toCharArray()) {
            charList.add(each);
        }

        // using removeIf for dups
        charList.removeIf(ch -> charList.indexOf(ch) != charList.lastIndexOf(ch));

        // making a string
        StringBuilder result = new StringBuilder(charList.size());
        for (Character ch : charList) {
            result.append(ch);
        }

        // StringBuilder to a string
        return result.toString();
    } */
