package konst.week5;
/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
*/

public class UniqueString {
    public static String unique(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // str.indexOf(ch) finds the first occurrence of ch in the string.
            // str.lastIndexOf(ch) finds the last occurrence of ch in the string.
            // If both indexOf and lastIndexOf return the same index, it means the character appears only once in the entire string
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }
}

