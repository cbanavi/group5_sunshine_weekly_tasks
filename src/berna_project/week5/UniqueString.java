package berna_project.week5;
/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */

public class UniqueString {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBDEF"));
    }

    public static String unique(String str){

        String uniqueString = "";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){    //first and last time char appears (unique)
                uniqueString += ch;
            }

        }
     return uniqueString;

    }
}
