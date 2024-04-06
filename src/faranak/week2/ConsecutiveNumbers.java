package faranak.week2;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {      //numbers that can be divided by 2,3 and 5
                System.out.println("CodilityTestCoders");

            } else if (i % 2 == 0 && i % 3 == 0) {              //numbers that can be divided by 2 & 3
                System.out.println("CodilityTest");
            } else if (i % 2 == 0) {                            //numbers that can be divided by 2
                System.out.println("Codility");
            } else if (i % 3 == 0) {                             //numbers that can be divided by 3
                System.out.println("Test");
            } else if (i % 5 == 0) {                            //numbers that can be divided by 5
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }
    }
}

// Numbers —— print consecutive numbers

    // that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    // However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    // If a number is divisible by more than one of the numbers: 2, 3 or 5, it should be
    //replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
    //For example: numbers divisible by both 2 and 3 should be replaced by CodilityTest
    //and numbers divisible by all three numbers: 2, 3 and 5, should be replaced by CodilityTestCoders.



