package Victor_Tasks;

public class T1_VC_finra {

    // public static void main(String[] args) {
    public static void fin(int startingNumber, int endingNumber) {

        String result = "";

        for (int i = startingNumber; i <= endingNumber; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("finra " + i + " is a multiple of 3 and 5");
            }
             if (i % 3 == 0) {
                 System.out.println("fin " + i + " is a mulitple of 3");
            }
             if (i % 5 == 0) {
                 System.out.println("ra " + i + " is a multiple of 5");
            }
        }
    }

    public static void main(String[] args) {
        fin(1, 30);
    }
}


//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
//print "FIN" instead of the number and
//for numbers which are a multiple of 5, print "RA" instead of the number.
//for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.