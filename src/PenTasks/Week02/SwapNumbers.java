package PenTasks.Week02;

public class SwapNumbers {
    public static void main(String[] args) {
        XORSwap(2, 5);
        System.out.println("========================");
        arthSwap(3,6);
    }




    public static void XORSwap (int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


public static void arthSwap(int a , int b){
    a = a + b;
    b = a - b;
    a = a - b;
;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
}
}










/*
Numbers —— Swap Numbers
Swap two variable' values without using a third variable





 */