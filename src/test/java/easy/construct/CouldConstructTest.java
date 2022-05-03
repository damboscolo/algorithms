package easy.construct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CouldConstructTest {

    CouldConstruct t = new CouldConstruct();

    @Test
    public void testRecursive() {
        assertEquals(1, t.recursive("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
        assertEquals(2, t.recursive("purple", new String[] {"pur", "p", "ur", "le", "purpl"}));
        assertEquals(46, t.recursive("eeeeeeeeeeeeeeeeeeeeeeeeeee", new String[] {"e", "e", "e", "ee", "eee", "eeee", "eeee", "eeee", "eeeeeee", "eeeeeeeeeeeeeeeeeeeeeeeeeee"}));
    }

    @Test
    public void testMemoized() {
        assertEquals(1, t.memoized("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
        assertEquals(2, t.memoized("purple", new String[] {"pur", "p", "ur", "le", "purpl"}));
        assertEquals(46, t.memoized("eeeeeeeeeeeeeeeeeeeeeeeeeee", new String[] {"e", "e", "e", "ee", "eee", "eeee", "eeee", "eeee", "eeeeeee", "eeeeeeeeeeeeeeeeeeeeeeeeeee"}));    }

}