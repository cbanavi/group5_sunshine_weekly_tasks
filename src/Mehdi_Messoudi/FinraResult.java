package Mehdi_Messoudi;
/* Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
        print "FIN" instead of the number and
        for numbers which are a multiple of 5, print "RA" instead of the number.
        for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.*/

public class FinraResult {
    public static class Finra {
        public static void finra() {
            for (int i = 1; i <= 30; i++) {
                String Print = "";
                if (i % 3 == 0) Print += "FIN";
                if (i % 5 == 0) Print += "RA";
                System.out.println(Print.isEmpty() ? i : Print);
            }
        }
        public static void main(String[] args) {
            finra();
        }
    }}