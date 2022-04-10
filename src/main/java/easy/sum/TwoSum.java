package easy.sum;

/*
1. Two Sum

https://leetcode.com/problems/two-sum/

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] usingFour(int[] nums, int target) {
        // O(n2)
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public int[] hashMap(int[] nums, int target) {
        // O(n)
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return null;
    }
}
