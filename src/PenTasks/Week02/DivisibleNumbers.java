package PenTasks.Week02;

public class DivisibleNumbers {
    public static void main(String[] args) {
printDividedNumbers(100);
    }
// this code can be written by arraylist and Simple nested loop.
    // nested loop doesnt store the data in list or string, therefore it is not flexible.
    // array and StringBuilder store the data in lists or Strings which allows manipulation or processing

    public static void printDividedNumbers(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("\"Given number should be 1 or more.\nNegative numbers and Zero are not allowed!\"");
        }
        StringBuilder divisibleBy15 = new StringBuilder("Divisible by 15: ");
        StringBuilder divisibleBy5 = new StringBuilder("Divisible by 5: ");
        StringBuilder divisibleBy3 = new StringBuilder("Divisible by 3: ");

        for (int i = 1; i <= N; i++) {
            if (i % 15 == 0) {
                divisibleBy15.append(i);
            }
            if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5.append(i);
            }
            if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3.append(i);
            }
        }

        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }
}



/*
Numbers —— Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

      if the number can be divisible by 3, 5 and 15. then it should only be displayed in DivisibelByl5' section

      if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

      if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

ex:

      OutPut:

         Divisible By 15 15 30 45 60 75 90
         Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
         Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

 */