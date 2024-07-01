package chiyavan.week8;

public class UniqueIntSumZero_Chiyavan {

    public static void main(String[] args) {
        int[] output = sumZero(10);

        //loops through the output and prints
        for (int i = 0; i < output.length; i++) {
            System.out.print(" " + output[i]);
        }

    }

    public static int[] sumZero(int n) {

        //init an array result of size n with all elements initialized to zero
        int[] result = new int[n];

        //declares 2 int var,init them to 0 and result.length-1
        //l represents the leftmost index
        int l = 0, r = result.length - 1;       // r represents the rightmost index(negative numbers)

        while (l < r) {                         //while l is less than r, do the following:

            result[l] = r;                      //assign the value of r to the element at index l of the result var

            result[r] = -r;                     //assign the value of -r to the element at index r of the result var

            l++;                                //increment the leftmost index by 1
            r--;                                //decrement the rightmost index by 1
        }
        return result;
    }

}

/*

Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).

 */