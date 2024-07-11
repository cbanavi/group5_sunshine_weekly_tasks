/*
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
*/
package konst.week9;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayInts {
    public static void removeArrayInts(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 100) {
                numbers.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 101, 120, 99, 5, 2, 4));
        removeArrayInts(numbers);

        System.out.println("Modified list: " + numbers);
    }
}

