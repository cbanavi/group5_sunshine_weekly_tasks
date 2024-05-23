package PenTasks.Week04;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println((frequencyOfChars1("AABBBCCD")));
        System.out.println("______________________________");
        System.out.println(frequencyOfChar2("AABBBCCD"));
    }
    public static String frequencyOfChars1(String str){

        if (str == null){
            throw new IllegalArgumentException("No input!");
        }

        int[] frequencyArray = new int[256]; //initializing an integer array
//bc 256 is big enough for ASCII assumption
        for (char each : str.toCharArray()){
            frequencyArray[each]++; //counting each character
        }
        StringBuilder freqOfChars = new StringBuilder(); //creating a string
        for (int i = 0; i < frequencyArray.length ; i++) { //analyzing each char
            if (frequencyArray[i]>0){
                freqOfChars.append((char) i).append(frequencyArray[i]);
            }

        }
        return freqOfChars.toString();
    }

    public static String frequencyOfChar2(String str){

        if (str == null){
            throw new IllegalArgumentException("No input!");
        }
        Map<Character, Integer> frequencyMap = new HashMap<>(); //initialization
        for (char each : str.toCharArray()){ //count the characters
            //getOrDefault to get current frequency of  the character
            frequencyMap.put(each, frequencyMap.getOrDefault(each, 0) + 1);
        }
        StringBuilder result = new StringBuilder(); // adding String to print as demanded
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }


}
/*
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

