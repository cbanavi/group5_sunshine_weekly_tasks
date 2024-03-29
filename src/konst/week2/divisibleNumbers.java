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
package konst.week2;

public class divisibleNumbers {
    public static void main(String[] args) {
        System.out.println("Divisible By 15");
        printDivisibleBy(15);

        System.out.println("\n\nDivisible By 5");
        printDivisibleBy(5);

        System.out.println("\n\nDivisible By 3");
        printDivisibleBy(3);
    }

    private static void printDivisibleBy(int divisor) {
        for (int i = 1; i <= 100; i++) {
            if (i % divisor == 0) {
                // Exclude numbers divisible by 15 if they've already been printed
                if (divisor == 3 || divisor == 5) {
                    if (i % 15 == 0) continue;
                }
                System.out.print(i + " ");
            }
        }
    }
}
