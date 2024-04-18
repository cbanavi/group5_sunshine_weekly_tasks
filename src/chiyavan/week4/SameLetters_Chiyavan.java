package chiyavan.week4;

import java.util.*;

public class SameLetters_Chiyavan {

    public static void main(String[] args) {

        sameLetterChecker("abc", "cab");
        sameLetterChecker("abc", "acc");
        sameLetterChecker("type", "typeu");
        sameLetterChecker("Chiyavan", "navayihc");


    }

    public static void sameLetterChecker(String str, String str2) {

        char[] chr = str.toLowerCase().toCharArray();
        char[] chr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(chr);
        Arrays.sort(chr2);

        System.out.println(Arrays.equals(chr, chr2));

    }
}

/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */