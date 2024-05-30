package faranak.week5;

public class UniqueChar {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        String output = unique(str);
        System.out.println(output);
    }

    public static String unique(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            //finds the first occurrence of the current char in the str
            //if indexOf() returns the same value as the lastIndexOf(), then the char is unique
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                //if the char is unique, add it to the result
                result = result + str.charAt(i);
            }

        }
        return result;

    }
}

//Write a return method that can find the unique characters from the String
// Example: unique("AAABBBCCCDEF") ==> "DEF";