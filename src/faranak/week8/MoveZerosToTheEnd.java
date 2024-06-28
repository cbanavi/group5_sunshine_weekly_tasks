package faranak.week8;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] input = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] output = moveZerosToTheEnd(input);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }

    }
    public static int[] moveZerosToTheEnd(int[] nums) {
        int count = 0;                                              //to keep track of the zeros
        for (int i = 0; i < nums.length; i++) {                     //loops through each element
            if (nums[i] == 0) {                                     //checks if current element is zero
                count++;                                            //so the var is incremented by1
            } else {                                                //if not zero
                nums[i - count] = nums[i];                          //the element is moved to the left of the array
            }
        }
        for (int i = nums.length - count; i < nums.length; i++) {   //loops through the last count elements of the array
            nums[i] = 0;                                            //sets the last count elements to 0
        }
        return nums;                                                //returns the array with 0's moved to the end
    }

}
/*
    Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]

 */