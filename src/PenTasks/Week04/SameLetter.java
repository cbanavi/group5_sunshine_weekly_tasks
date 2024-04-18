package PenTasks.Week04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SameLetter {

        public static void main(String[] args) {
            System.out.println(same1("asd", "sad"));
            System.out.println("_____________________");
            System.out.println(same2("qwe", "asd"));
        }

        public static boolean same1(String str1, String str2){

            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            return Arrays.equals(charArr1, charArr2);
        }
        public static boolean same2(String str1, String str2) {
            Map<Character, Integer> freqMap1 = new HashMap<>();
            Map<Character, Integer> freqMap2 = new HashMap<>();

            for (char each : str1.toCharArray()) {
                freqMap1.put(each, freqMap1.getOrDefault(each, 0) + 1);
            }
            for (char each : str2.toCharArray()) {
                freqMap2.put(each, freqMap1.getOrDefault(each, 0) + 1);
            }
            return  freqMap1.equals(freqMap2);
        }

    }


/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */

