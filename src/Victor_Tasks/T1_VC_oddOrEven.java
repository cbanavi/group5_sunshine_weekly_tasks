package Victor_Tasks;

public class T1_VC_oddOrEven {

    public static void evenOdd(int number){

        if (number % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }

    }

    public static void main(String[] args) {
        evenOdd(103);
    }
}
// //Write  a method which can identifies given number is even or odd