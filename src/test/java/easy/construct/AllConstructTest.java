package easy.construct;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AllConstructTest {

    AllConstruct t = new AllConstruct();

    @Test
    public void testRecursive() {
        assertEquals(List.of(List.of("ab", "abc", "abcd")), t.recursive("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
        assertEquals(List.of(List.of("purp", "le"), List.of("p", "ur", "p", "le")), t.recursive("purple", new String[] {"pur", "p", "ur", "le", "purpl"}));
    }
}