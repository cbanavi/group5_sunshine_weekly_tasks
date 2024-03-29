/*
Numbers —— Swap Numbers
Swap two variable' values without using a third variable
*/
package konst.week2;


public class swapNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Before swap: x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
