package PenTasks.Week01;

public class Finra_Neste_Loop {
    public static void main(String[] args) {
printFinra(30);
    }
    //Write a method which prints out the numbers from 1 to 30 but for numbers
public static void printFinra(int givenNum){
        for (int i = 1; i <= givenNum; i++) {
            //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
            if (i%3==0 && (i&5)==00) {
                System.out.print("FINRA ");
                //print "FIN" instead of the number for numbers which are a multiple of 3
            } else if (i%3==0) {
                System.out.print("FIN ");
                //for numbers which are a multiple of 5, print "RA" instead of the number.
            }else if (i%5==0) {
                System.out.print("RA ");
            }else{
                System.out.print(i + " ");

            }

        }
    }
}
