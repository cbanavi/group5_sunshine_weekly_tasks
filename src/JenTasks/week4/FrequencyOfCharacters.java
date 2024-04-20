package JenTasks.week4;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String chars = "AAABBCDD";
        System.out.println(freqOfChars(chars));//prints: A3B2C1D2
        System.out.println(frequencyOfChars(chars));//prints: a3b2c1d2

    }

    public static String freqOfChars(String str) {
        StringBuilder result = new StringBuilder();//declares an object that will store resulting string from the for loop

        for (int i = 0; i < str.length(); i++) {//iterates over each character of the input string str
            char ch = str.charAt(i);//retrieves the character at the current index i from the input string str and assigns it to the variable ch
            int count = 1;//represents the initial count of the current character

            while (i + 1 < str.length() && str.charAt(i + 1) == ch) {//starts nested while loop to count consecutive occurrences of the same character
                count++;//increments the count for consecutive occurrences of the same character
                i++;//increments the loop variable i to skip over the consecutive occurrences of the same character
            }
            result.append(ch).append(count);//appends the current character ch and its count to the StringBuilder result
        }
        return result.toString();// returns result after appending all characters and their counts
    }


    /**
     * Option 2
     */
    public static String frequencyOfChars(String str) {
        str = str.toLowerCase();// line converts the input string str to lowercase. This ensures that the method is case-insensitive when counting the frequency of characters.
        String result = "";//store the resulting string containing the frequency of characters
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;//initializes frequency to 0, which will store the frequency of the current character
            char count = str.charAt(i);//retrieves the character at the current index i from the input string str and assigns it to the variable count
            for (int j = 0; j < str.length(); j++) {//starts a nested loop that iterates over each character of the input string str again to count the frequency of the current character
                if (count == str.charAt(j)) {//checks if the current character count is equal to the character at index j in the input string str
                    frequency++;
                }
            }
            if (!result.contains("" + count + frequency)) {//checks if the current character and its frequency are not already present in the result string
                result += "" + count + frequency;//concatenates the current character count and its frequency to the result string

            }

        }
        return result;//returns the resulting string containing the frequency of characters
    }

}
/* NOTES for the methods:
 * In the first method: Starting the count at 1 because we accumulate the count for each character throughout the entire string without resetting it for each new character.
 * In the second method:  Starting the count at 0 would reset frequency to 0 for each new character encountered in the outer loop.

*/



/* TASK
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */