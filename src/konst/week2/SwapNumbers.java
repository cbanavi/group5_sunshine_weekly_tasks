/*
Numbers —— Swap Numbers
Swap two variable' values without using a third variable
*/
package konst.week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int x = 10;  // Initialize variable x with value 10
        int y = 20;  // Initialize variable y with value 20

        System.out.println("Before swap: x = " + x + ", y = " + y);  // Print the values before swapping

        // Swapping logic:
        x = x + y;   // Calculate the sum of x and y, store it in x
        y = x - y;  // Subtract the original value of y from x (the sum), store result in y (effectively the old x)
        x = x - y;  // Subtract the new value of y (the old x) from x (the sum), store result in x (effectively the old y)

        System.out.println("After swap: x = " + x + ", y = " + y);  // Print the values after swapping
    }
}
