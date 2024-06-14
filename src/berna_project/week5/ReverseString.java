package berna_project.week5;
/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reversed("ABCD"));

    }

    public static String reversed(String str){

//to store the reversed string
        String reversedString="";

 //Concatenation reversed = str + reversed  D+"", C+D=CD, B+CD=BCD..
        for (int i = str.length()-1 ; i >=0 ; i--) {
            reversedString += str.charAt(i);
            
        }
        return reversedString;


    }




    }


