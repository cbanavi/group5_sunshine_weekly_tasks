package PenTasks.Week01;

public class OddAndEven {
    public static void main(String[] args) {
        oddEven(6);
    }
    public static void oddEven(int num){
        if (num%2 == 0){
            System.out.println(num + " is even.");
        }else {
            System.out.println(num + " is odd.");
        }
    }
}
