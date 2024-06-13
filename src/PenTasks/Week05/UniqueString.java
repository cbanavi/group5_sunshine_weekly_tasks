package PenTasks.Week05;

public class UniqueString {
    public static void main(String[] args) {
        System.out.println(uniqueChars("AAABBBCCCDEF"));
    }

    public static String uniqueChars(String str) {
        //create a StringBuilder
        StringBuilder uniqueChars = new StringBuilder();
        //loop through the string and check if the current character is unique
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //check if the current character is unique
            //the index of 'A' is 0 bc it will return the first character index all the time
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                uniqueChars.append(ch);
            }
        }
        return uniqueChars.toString();
    }
}



/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */

