package easy.construct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllConstruct {

    // ESTA TODO COM PROBLEMA
    public ArrayList<String> mapDani(ArrayList<String> entry, String word) {
        entry.add(0, word);
        return entry;
    }
    public ArrayList<ArrayList<String>> recursive(String target, String[] wordBank) {
        // TODO: REMOVER "", está aqui porque nao encontrei outra solução
        // o map do javascript passa mesmo quando tá vazio. O map do java nao
        if (target.equals("")) {
            ArrayList<ArrayList<String>> big = new ArrayList();
            ArrayList<String> inner = new ArrayList();
            inner.add("");
            big.add(inner);
            return big;
        };

        ArrayList<ArrayList<String>> finalList = new ArrayList<ArrayList<String>>();

        for(String word: wordBank) {
            if (target.indexOf(word) == 0) {
                String suffix = target.replace(word, "");
                ArrayList<ArrayList<String>> suffixWays = recursive(suffix, wordBank);
                List<ArrayList<String>> dani = suffixWays.stream().map(way -> mapDani(way,word)).collect(Collectors.toList());
                suffixWays = new ArrayList(dani);
                finalList.addAll(suffixWays);
            }
        }
        return finalList;
    }
}



