package easy.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BestSum {

    /*
    m = target sum
    n = numbers.length

    time: O(n^m * m)
        - n^m: looping in n (numbers.length) potentially with the target sum (increase as tree)
        - * m: copy the array every loop (Arrays.copyOf)

    space: O(m^2)
        - m: the height of the recursion
        - *m: store the value in the array in every recursion
     */

    public int[] recursive(int[] numbers, int targetSum) {
        if (targetSum == 0) return new int[]{};
        if (targetSum < 0) return null;

        int[] shortestCombination = null;

        for (int number : numbers) {
            int remainder = targetSum - number;
            int[] remainderCombination = recursive(numbers, remainder);

            if (remainderCombination != null) {
                int[] combination = Arrays.copyOf(remainderCombination, remainderCombination.length + 1);
                combination[combination.length - 1] = number;

                // Added this part different from "HowSum"
                if (shortestCombination == null || combination.length < shortestCombination.length) {
                    shortestCombination = combination;
                }
            }
        }
        return shortestCombination;
    }


    public int[] memoized(int[] numbers, int targetSum) { return memoized(numbers, targetSum, new HashMap()); }
    private int[] memoized(int[] numbers, int targetSum, Map<Integer, int[]> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new int[]{};
        if (targetSum < 0) return null;

        int[] shortestCombination = null;

        for (int number : numbers) {
            int remainder = targetSum - number;
            int[] remainderCombination = memoized(numbers, remainder, memo);

            if (remainderCombination != null) {
                int[] combination = Arrays.copyOf(remainderCombination, remainderCombination.length + 1);
                combination[combination.length - 1] = number;

                // Added this part different from "HowSum"
                if (shortestCombination == null || combination.length < shortestCombination.length) {
                    shortestCombination = combination;
                }
            }
        }
        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }

}
