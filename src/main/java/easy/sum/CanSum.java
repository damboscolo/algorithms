package easy.sum;

import java.util.HashMap;
import java.util.Map;

/*
Can Sum

Write a function called canSum(targetSum, numbers)
that returns True only if the numbers in the array can sum to the target sum.

All the numbers in the array are positive integers and you can use them more than once for the solution.
 */

public class CanSum {

    // Brute force O(nˆ2)
    public boolean usingFour(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return true;
            }
        }
        return false;
    }

    // O(n)
    public boolean hashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return true;
            map.put(nums[i], i);
        }
        return false;
    }

    /*
     n = numbers array length
     m = targetSum

     O(nˆm) time O(m) space
     */
    public boolean recursive(int[] numbers, int targetSum) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;
        for (int num: numbers) {
            int remainder = targetSum - num;
            if (recursive(numbers, remainder)) return true;
        }
        return false;
    }

    // Linear: O(n) time O(n) space
    public boolean dynamicProgramming(int[] numbers, int targetSum) {
        return dynamicProgramming(numbers, targetSum, new HashMap());
    }
    public boolean dynamicProgramming(int[] numbers, int targetSum, Map<Integer, Boolean> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;
        for (int num: numbers) {
            int remainder = targetSum - num;
            if (dynamicProgramming(numbers, remainder, memo)) {
                memo.put(targetSum, true);
                return true;
            }
        }
        memo.put(targetSum, false);
        return false;
    }
}
