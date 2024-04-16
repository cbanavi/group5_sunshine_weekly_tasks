package faranak.week04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

       String input = new String("AAABBBCCC");
       System.out.println(removeDup(input));
    }
    public static String removeDup(String input) {

        //Splits the input string into characters,removes duplicates and joins them back into a single string
        String collect = new HashSet<>(Arrays.stream(input.split("")).collect(Collectors.toList())).stream().collect(Collectors.joining());
        if(input.isEmpty()){
            return input;
        }
        else{
            return collect;
        }
    }
    }
/*
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

 */