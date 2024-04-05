package JenTasks.week2;

public class T1_swapNumbers_JN {
    public static void main(String[] args) {
        int x = 77;
        int y = 7;
        swapNumbers(x, y);
    }

    public static void swapNumbers(int x, int y) {

        System.out.println("Before swap: " + "x= " + x + " and " + "y= " + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap: " + " x= " + x + " and " + "y= " + y);


    }
}
/*
Numbers —— Swap Numbers
Swap two variable values without using a third variable
 */