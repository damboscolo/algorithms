package easy;

import easy.construct.CanConstruct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanConstructTest {

    CanConstruct t = new CanConstruct();

    @Test
    public void testRecursive() {
        assertEquals(true, t.recursive("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"} ));
        assertEquals(false, t.recursive("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"} ));

        // Above will take too long to run
        //assertEquals(false, t.recursive("eeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {"e", "eee", "eeeee", "ee"} ));
    }

    @Test
    public void testMemoized() {
        assertEquals(true, t.memoized("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"} ));
        assertEquals(false, t.memoized("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"} ));

        // Runs fast
        assertEquals(false, t.memoized("eeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {"e", "eee", "eeeee", "eeeeeeee", "eeeee"} ));
    }

}