package JenTasks.week2;


public class T3_consecutiveNumbers_JN {
    public static void main(String[] args) {

        consecutiveNumbers(27);
    }

    // Defined the consecutiveNumbers method that prints different strings based on the divisibility of numbers from 1 to N
    public static void consecutiveNumbers(int N) {
        // Check if the input number N is negative, and throw an exception if it is.
        // This is to ensure the method works with positive integers only.
        if (N < 0) {
            throw new IllegalArgumentException("Function applicable for positive integers only");
        }

        // Loop from 1 to N, inclusive
        for (int i = 1; i <= N; i++) {
            // Initialize a StringBuilder object to dynamically build the output string
            StringBuilder keyword = new StringBuilder();

            // If 'i' is divisible by 2, append "Codility" to the keyword string
            if (i % 2 == 0) {
                keyword.append("Codility");
            }
            // If 'i' is divisible by 3, append "Test" to the keyword string
            if (i % 3 == 0) {
                keyword.append("Test");
            }
            // If 'i' is divisible by 5, append "Coders" to the keyword string
            if (i % 5 == 0) {
                keyword.append("Coders");
            }
            // If keyword string is empty (i.e., 'i' is not divisible by 2, 3, or 5),
            // then print the number itself
            if (keyword.length() == 0) {
                System.out.println(i);
            } else {
                // If keyword string is not empty, print the keyword string
                System.out.println(keyword);
            }

        }

    }
}

/*
Numbers —— print consecutive numbers

Write a function:

that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2, 3 or 5, it should be
replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
For example: numbers divisible by both 2 and 3 should be replaced by CodilityTest
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