package easy.construct;

import java.util.HashMap;

public class CanConstruct {

    public boolean recursive(String target, String[] wordBank) {
        if (target.equals("")) return true;

        for (String word : wordBank) {
            if (target.indexOf(word) == 0) { // if word is the prefix
                String suffix = target.replaceFirst(word, "");
                if (recursive(suffix, wordBank)) return true;
            }
        }
        return false;
    }

    public boolean memoized(String target, String[] wordBank) {
        return memoized(target, wordBank, new HashMap());
    }
    private boolean memoized(String target, String[] wordBank, HashMap<String, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.equals("")) return true;

        for (String word : wordBank) {
            if (target.indexOf(word) == 0) {
                String suffix = target.replaceFirst(word, "");
                if (memoized(suffix, wordBank, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }
        memo.put(target, false);
        return false;
    }
}