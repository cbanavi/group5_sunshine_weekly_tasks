package berna_project.week1;
//Write  a method which can identifies given number is even or odd
public class oddOrEven {
    public static void main(String[] args) {

        int n= 12345;
        evenOrOddNums(n);

    }

    private static int evenOrOddNums (int n){


        if (n %2 == 0){
            System.out.println("Even number.");
        } else if (n %2 == 1) {
            System.out.println("Odd number.");

        }
        return  n;

    }
}
