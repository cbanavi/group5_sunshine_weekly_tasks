package chiyavan.week1;

public class finra_Chiyavan {
    public static void finra(int number) {
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        finra(30);
    }

}

