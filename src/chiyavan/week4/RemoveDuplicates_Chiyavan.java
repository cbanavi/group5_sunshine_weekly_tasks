package chiyavan.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicates_Chiyavan {

    public static void main(String[] args) {

        duplicateChecker("AAABBBCCC");

    }

    public static void duplicateChecker(String str) {

        char[] originalString = str.toCharArray();          //Create Char array to store each char of the string
//        ArrayList<Character> noDuplicates = new ArrayList<>();      //Initialize an ArrayList
//
//        for (char each : originalString) {                  //Sort through each char of the string
//            if (!noDuplicates.contains(each)) {                     //If the arraylist does NOT contain the character from originalString
//                noDuplicates.add(each);                             // Add to ArrayList
//            }
//        }
//        System.out.println(noDuplicates.toString().replace("[", "").replace("]", "").replaceAll(",", "").
//                replaceAll(" ", ""));

        Set<String> noDuplicates = new HashSet<>();
        for (char each : originalString) {
            noDuplicates.addAll(Arrays.asList(String.valueOf(each)));
        }

        System.out.println(noDuplicates.toString().replace("[", "").replace("]", "").replaceAll(",", "").
                replaceAll(" ", ""));

    }

}

/*
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

 */