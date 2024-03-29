/* Write a method which prints out the numbers from 1 to 30
but for numbers which are a multiple of 3, print "FIN" instead of the number and
for numbers which are a multiple of 5, print "RA" instead of the number.
For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number */

package konst.week1;

public class finra {
    public static void finra() {
        for (int i = 1; i <= 30; i++) {
            String output = "";
            if (i % 3 == 0) output += "FIN";
            if (i % 5 == 0) output += "RA";
            System.out.println(output.isEmpty() ? i : output);
        }
    }
    public static void main(String[] args) {
        finra();
    }
}

