package faranak.week2;

public class DivisibleNumbers {

    public static void main(String[] args) {

        System.out.println("\nDivisible by 3: ");
        for (int n = 1; n < 101; n++){
            if (n % 3==0 && n % 15!=0)
                System.out.print( n + " ");
            }
        System.out.println("\nDivisible by 5: ");
            for (int n = 1; n < 101; n++) {
                if (n % 5==0 && n % 15!=0)
                    System.out.print(n + " " );
                }
        System.out.println("\nDivisible by 15: ");
            for (int n = 1; n < 101; n++) {
                if (n % 15==0)
                    System.out.print(n + " ");
                }
            }
        }

        /*
     Numbers —— Divisible by 3, 5, 15
     Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
      if the number can be divisible by 3, 5 and 15. then it should only be displayed in DivisibelByl5' section
      if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
      if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

      OutPut:
         Divisible By 15 15 30 45 60 75 90
         Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
         Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */