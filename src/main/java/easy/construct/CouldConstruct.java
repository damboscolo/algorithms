package easy.construct;

import java.util.HashMap;

public class CouldConstruct {

    public int recursive(String target, String[] wordBank) {
        if (target.equals("")) return 1;

        int count = 0;
        for(String word: wordBank) {
            if(target.indexOf(word) == 0) {
                String suffix = target.replace(word, "");
                count += recursive(suffix, wordBank);
            }
        }
        return count;
    }

    public int memoized(String target, String[] wordBank) {
        return memoized(target, wordBank, new HashMap());
    }
    public int memoized(String target, String[] wordBank, HashMap<String, Integer> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.equals("")) return 1;

        int totalCount = 0;
        for(String word: wordBank) {
            if(target.indexOf(word) == 0) {
                String suffix = target.replace(word, "");
                totalCount += memoized(suffix, wordBank, memo);
                memo.put(target, totalCount);
            }
        }
        memo.put(target, totalCount);
        return totalCount;
    }

}


// wordBank
// target

