package easy;

/*
20. Valid Parenthesis

https://leetcode.com/problems/valid-parentheses/

O(n)

*/

import java.util.*;

public class ValidParenthesis {
    public boolean incredibleSolution(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public boolean mySolution(String s) {
        Map<Character, Character> parenthesis = new HashMap();
        parenthesis.put('(', ')');
        parenthesis.put('{', '}');
        parenthesis.put('[', ']');

        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (parenthesis.containsKey(c)) {
                stack.push(parenthesis.get(c));
            } else {
                if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }
        return stack.isEmpty(); // the BIG catch!!
    }
}
