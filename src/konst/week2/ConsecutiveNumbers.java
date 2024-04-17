/*
Numbers —— print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2, 3 or 5,
it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
For example. numbers divisible by both 2 and 3 should be replaced by CodilityTest
and numbers divisible by all three numbers: 2, 3 and 5, should be replaced by CodilityTestCoders.
For example, here is the output for N = 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
*/
package konst.week2;

public class ConsecutiveNumbers {

    public static void main(String[] args) {
        printConsecutive(32);  // Example call to print numbers up to 32
    }

    public static void printConsecutive(int N) {
        // Loop to iterate over numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            StringBuilder output = new StringBuilder(); // Create a StringBuilder for efficiency

            // Check if divisible by 2, append "Codility" if true
            if (i % 2 == 0) output.append("Codility");

            // Check if divisible by 3, append "Test" if true
            if (i % 3 == 0) output.append("Test");

            // Check if divisible by 5, append "Coders" if true
            if (i % 5 == 0) output.append("Coders");

            // If the output StringBuilder has content, print it; otherwise, print the number
            System.out.println(!output.isEmpty() ? output.toString() : i);
        }
    }
}
