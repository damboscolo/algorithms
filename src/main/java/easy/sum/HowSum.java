package easy.sum;

/*
How Sum

Write a function `howSum(int targetSum, int[] numbers)` that takes in a target sum and an array of numbers as arguments.

The function should return an array containing any combination of elements that add up to exactly the target sum.
If there is no combination that adds up to the target sum, then return null.

If there are multiple combinations possible, you may return any single one.
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowSum {

    /*
    m = target sum
    n = numbers.length

    time: O(n^m * m)
        - n^m: looping in n (numbers.length) potentially with the target sum (increase as tree)
        - * m: copy the array every loop (Arrays.copyOf)

    space: O(m)
     */

    public int[] recursive(int[] numbers, int targetSum) {
        if (targetSum == 0) return new int[]{};
        if (targetSum < 0) return null;

        for (int number : numbers) {
            int remainder = targetSum - number;
            int[] remainderResult = recursive(numbers, remainder);

            if (remainderResult != null) {
                int[] array = Arrays.copyOf(remainderResult, remainderResult.length + 1);
                array[array.length - 1] = number;
                return array;
            }
        }
        return null;
    }

    /*
    m = target sum
    n = numbers.length

    time: O(n*m * m) ->  O(n*m^2)
        - n*m: looping in n (numbers.length) at m times (increase linear)
        - * m: copy the array every loop (Arrays.copyOf)

    space: O(m * m) -> O(m^2)
        - at least the recursive space O(m)
        - added a memo: the key will be all the values of targetSum (m)
        - m * m: m times m
     */

    public int[] memoized(int[] numbers, int targetSum) {
        return memoized(numbers, targetSum, new HashMap());
    }
    private int[] memoized(int[] numbers, int targetSum, Map<Integer, int[]> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new int[]{};
        if (targetSum < 0) return null;

        for (int number : numbers) {
            int remainder = targetSum - number;
            int[] remainderResult = memoized(numbers, remainder, memo);

            if (remainderResult != null) {
                int[] array = Arrays.copyOf(remainderResult, remainderResult.length + 1);
                array[array.length - 1] = number;
                memo.put(targetSum, array);
                return array;
            }
        }
        memo.put(targetSum, null);
        return null;
    }
}
