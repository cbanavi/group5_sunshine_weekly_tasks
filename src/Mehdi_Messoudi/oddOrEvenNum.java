package Mehdi_Messoudi;

public class oddOrEvenNum {

        public static void main(String[] args) {
            oddOrEven(5);
        }
        public static void oddOrEven(int number){
            if (number %2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }

            System.out.println("NUMBER CHECKED, PLEASE ENTER THE NEXT NUMBER");
        }
    }
        //Write  a method which can identifies given number is even or odd
        //1. Numbers -- odd & even
        //Write a method which can identify given number is even or odd
        //Ex: identify(5) -> "Odd"
        //    identify(6) -> "Even"


