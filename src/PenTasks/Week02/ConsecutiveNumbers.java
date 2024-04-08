package PenTasks.Week02;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        consecutiveNumber(24);
    }
//contains two optimal solution in my opinion.
// StringBuilder is better bc using array(which is better for efficiency in big data) and make our String mutable(which is easier for changing the vlues if needed)
// we can use else if, but the lines will be dramatically more.

    public static void consecutiveNumber(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("Given number should be 1 or more.\nNegative numbers and Zero are not allowed!");
        }
        for (int i = 1; i < N; i++) {
            StringBuilder number = new StringBuilder();   //alternative : String number = "";
            if (i % 2 == 0) {
                number.append("Codility"); // alternative:number += "Codility";
            }
            if (i % 3 == 0) {
                number.append("Test"); // alternative:  number += "Test";
            }
            if (i % 5 == 0) {
                number.append("Coders"); // alternative:  number += "Coders";
            }
            System.out.println(!number.isEmpty() ? number : N);

        }
    }
}


/*
Numbers —— print consecutive numbers

Write a function:

that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However,
any number divisible by 2, 3 or 5 should be replaced by the word Codility,
 Test or Coders respectively.
ed by a concatenation of the respective words Codility, Test and Coders in this given order.
For example. numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible
by all three numbers: 2, 3 and 5, should be replaced by CodilityTestCoders.
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
