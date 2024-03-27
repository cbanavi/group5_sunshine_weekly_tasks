package PenTasks.Week01;

public class Finra_Do_While {

    public static void main(String[] args) {
printFinra(30,1);
    }
public static void printFinra(int maxNum, int num){
        do {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print(" FINRA ");
            }else if ( num % 3 == 0) {
                System.out.print(" FIN ");
            }else if (num % 5 == 0) {
                System.out.print(" RA ");
            }else {
                System.out.print(num + " ");
            }
            num++;
        }while (num <= maxNum);
    }
}
