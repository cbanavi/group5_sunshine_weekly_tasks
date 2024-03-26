package Sami_MLK.Week1;

public class T3_JN_FINRA {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            multiples(i);
        }
    }
    private static void multiples(int n) {
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("FINRA");
        } else if (n % 3 == 0) {
            System.out.println("FIN");
        } else if ((n % 5 == 0)) {
            System.out.println("RA");
        }

    }
}

//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
//print "FIN" instead of the number and
//for numbers which are a multiple of 5, print "RA" instead of the number.
//for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

