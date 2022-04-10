package easy.sum;

/*
How Sum

Write a function `howSum(int targetSum, int[] numbers)` that takes in a target sum and an array of numbers as arguments.

The function should return an array containing any combination of elements that add up to exactly the target sum.
If there is no combination that adds up to the target sum, then return null.

If there are multiple combinations possible, you may return any single one.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowSum {

    int[] memo;
    public int[] dynamicProgramming(int[] numbers, int targetSum) {
        if (targetSum == 0) return new int[]{};
        if (targetSum < 0) return null;

        for(int number: numbers) {
            int remainder = targetSum - number;
            int[] remainderResult = dynamicProgramming(numbers, remainder);

            if (remainderResult != null) {
                int[] array = Arrays.copyOf(remainderResult, remainderResult.length + 1);
                array[array.length - 1] = number;
                return array;
            }
        }
        return null;
    }
}
