/* Write a method which prints out the numbers from 1 to 30
but for numbers which are a multiple of 3, print "FIN" instead of the number and
for numbers which are a multiple of 5, print "RA" instead of the number.
For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number */

package konst.week1;

public class finra {
    public static void main(String[] args) {
        printFinra();
    }

    public static void printFinra() {
        // Iterate through numbers from 1 to 30
        for (int i = 1; i <= 30; i++) {
            String output = ""; // Initialize an empty output string

            // Check if the number is divisible by 3
            if (i % 3 == 0) output += "FIN";

            // Check if the number is divisible by 5
            if (i % 5 == 0) output += "RA";

            // If output is empty, print the number itself; otherwise, print the built output
            System.out.println(output.isEmpty() ? i : output);
        }
    }
}
