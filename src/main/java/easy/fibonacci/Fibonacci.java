package easy.fibonacci;

/*
509. Fibonacci Number
https://leetcode.com/problems/fibonacci-number/
 */

/*
Fibonacci sequence:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765 (fibonacci)
0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10, 11,  12,  13,  14,  15,  16,   17,   18,   19,   20 (index)
Given n, calculate F(n) -> it means, given n, calculate the number on the index n
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    // time: O(n) space: O(1)
    public int common(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;

        while (n-- > 1) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // time: O(2^n) space: O(n)
    public int recursive(int n) {
        if (n <= 1) return n;
        return recursive(n - 1) + recursive(n - 2);
    }

    /* After studied Dynamic Programming
        YouTube: https://www.youtube.com/watch?v=oBt53YbR9Kk&ab_channel=freeCodeCamp.org
        Notion: https://www.notion.so/Dynamic-Programming-32f1c4d15bfd4089aea59a8d7712e362
     */
    public Long memoized(int n) {
        return memoized(n, new HashMap());
    }
    public Long memoized(int n, Map<Integer, Long> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n < 1) return 0L;
        if (n <= 2) return 1L;
        memo.put(n, memoized(n - 1, memo) + memoized(n - 2, memo));
        return memo.get(n);
    }

    public BigInteger memoizedBigInteger(int n) {
        return memoizedBigInteger(n, new HashMap());
    }
    public BigInteger memoizedBigInteger(int n, Map<Integer, BigInteger> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n == 0) return BigInteger.valueOf(0);
        if (n <= 2) return BigInteger.valueOf(1);
        BigInteger result = memoizedBigInteger(n-1, memo).add(memoizedBigInteger(n-2, memo));
        memo.put(n, result);
        return result;
    }

    // Tabled
    public long tabledLong(int n) {
        long[] table = new long[n + 2]; // +2 = to not raise out of bound error when calculate the next 2 numbers
        table[1] = 1; // start point
        for (int i = 0; i < n; i++) {
            table[i + 1] += table[i];
            table[i + 2] += table[i];
        }
        return table[n];
    }

    // TODO:
//    public BigInteger tabledBigInteger(int n) {
//        ArrayList<BigInteger> table = new ArrayList<BigInteger>();
//        while (table.size() <= n) table.add(BigInteger.valueOf(0L)); // fill with zeros
//        return table.get(n);
//    }


    // discussion
    // https://leetcode.com/problems/fibonacci-number/discuss/215992/Java-Solutions/1219401/

    // time O(n) space O(n)
    // I didn't like it, for me, no makes sense create a limited object
    int[] fib_cache = new int[50];
    public int fibDynamicProgrammingTopDown(int N)
    {
        if(N <= 1)
            return N;
        else if(fib_cache[N] != 0)
            return fib_cache[N];
        else
            return fib_cache[N] = fibDynamicProgrammingTopDown(N - 1) + fibDynamicProgrammingTopDown(N - 2);
    }

    // time O(n) space O(n)
    public int fibDynamicProgrammingBottomUp(int N)
    {
        if(N <= 1)
            return N;

        int[] fib_cache = new int[N + 1];
        fib_cache[1] = 1;

        for(int i = 2; i <= N; i++)
        {
            fib_cache[i] = fib_cache[i - 1] + fib_cache[i - 2];
        }
        return fib_cache[N];
    }
}