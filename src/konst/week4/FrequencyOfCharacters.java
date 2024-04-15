/*
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/

package konst.week4;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }

    public static String frequencyOfChars(String str) {
        // Store character counts (could use an array if only dealing with ASCII)
        int[] charCounts = new int[256]; // Assuming standard ASCII characters

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCounts[c]++; // Increment count directly
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) { // Check if character has appeared
                result.append((char) i).append(charCounts[i]); // Append character and count
            }
        }

        return result.toString();
    }


}

