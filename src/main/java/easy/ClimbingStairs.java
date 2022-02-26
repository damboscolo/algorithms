package easy;

/*
70. Climbing Stairs
https://leetcode.com/problems/climbing-stairs/
 */

public class ClimbingStairs {

    // Complexity : Time: O(2^n) ; Space: O(n)
    // Solution did not pass in the test because of the complexity, error `Time exceeded`
    public int climbStairs(int n) {
        if (n <= 2) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // Complexity O(n)
    public int climbStairs2(int n) {
        if (n <= 2) return n;
        int[] mem = new int[n];
        mem[0] = 1;
        mem[1] = 2;
        for (int i = 2; i < n; i++) {
            mem[i] = mem[i - 1] + mem[i - 2];
        }
        return mem[n - 1];
    }
}
