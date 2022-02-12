package easy;

/* 13. Roman to Integer
https://leetcode.com/problems/roman-to-integer/

time complexity: O(n)

*/

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public int toInt(String s) throws Exception {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        Integer value = map.get(s.charAt(s.length() - 1));
        int i = s.length() - 1;

        while (i-- > 0) {
            Integer current = map.get(s.charAt(i));
            Integer right = map.get(s.charAt(i + 1));

            if (value == null || current == null || right == null)
                throw new Exception("invalid roman number");

            if (current < right) value -= current;
            else value += current;
        }
        return value;
    }
}
