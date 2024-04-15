package chiyavan.week4;

import java.util.ArrayList;


public class RemoveDuplicates_Chiyavan {

    public static void main(String[] args) {

        duplicateChecker("AAABBBCCC");

    }

    public static void duplicateChecker(String str) {

        char[] originalString = str.toCharArray();          //Create Char array to store each char of the string
        ArrayList<Character> noDuplicates = new ArrayList<>();      //Initialize an ArrayList

        for (char each : originalString) {                  //Sort through each char of the string
            if (!noDuplicates.contains(each)) {                     //If the arraylist does NOT contain the character from originalString
                noDuplicates.add(each);                             // Add to ArrayList
            }
        }
        System.out.println(noDuplicates);                           //Print noDuplicates


    }

}

/*
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

 */