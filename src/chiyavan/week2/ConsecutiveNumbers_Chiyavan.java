package chiyavan.week2;

public class ConsecutiveNumbers_Chiyavan {

    public static void main(String[] args) {
        numbers_method(17);
    }

    public static void numbers_method(int n) {


        for (int i = 1; i <= n; i++) {
            StringBuilder result = new StringBuilder();
            if (i % 2 == 0) {
                result.append("Codility");
            }

            if (i % 3 == 0) {
                result.append("Test");
            }

            if (i % 2 == 0) {
                result.append("Coders");
            }

            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}



/*
Numbers —— print consecutive numbers

Write a function:

that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2, 3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
For example. numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2, 3 and 5, should be replaced by CodilityTestCoders.
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