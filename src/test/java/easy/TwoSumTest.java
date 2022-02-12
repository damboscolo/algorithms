package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum t = new TwoSum();

    @Test
    @DisplayName("usingFour - Given a list of int and a target Then return a list of index that sum the target")
    public void testMine() {
        assertArrayEquals(new int[] {0, 1}, t.usingFour(new int[] {2,7,11,15}, 9));
        assertArrayEquals(new int[] {0, 2}, t.usingFour(new int[] {2,11,7,15}, 9));
        assertArrayEquals(new int[] {0, 3}, t.usingFour(new int[] {2,11,15,7}, 9));
        assertArrayEquals(new int[] {1, 2}, t.usingFour(new int[] {3,2,4}, 6));
        assertArrayEquals(new int[] {0, 1}, t.usingFour(new int[] {3,3}, 6));
        assertArrayEquals(new int[] {1, 2}, t.usingFour(new int[] {2,5,5,11}, 10));
        assertArrayEquals(null, t.usingFour(new int[] {6,5,11}, 3));
    }

    @Test
    @DisplayName("hashMap - Given a list of int and a target Then return a list of index that sum the target")
    public void testHashMap() {
        assertArrayEquals(new int[] {0, 1}, t.hashMap(new int[] {2,7,11,15}, 9));
        assertArrayEquals(new int[] {0, 2}, t.hashMap(new int[] {2,11,7,15}, 9));
        assertArrayEquals(new int[] {0, 3}, t.hashMap(new int[] {2,11,11,7,15}, 9));
        assertArrayEquals(new int[] {0, 3}, t.hashMap(new int[] {2,11,15,7}, 9));
        assertArrayEquals(new int[] {1, 2}, t.hashMap(new int[] {3,2,4}, 6));
        assertArrayEquals(new int[] {0, 1}, t.hashMap(new int[] {3,3}, 6));
        assertArrayEquals(new int[] {1, 2}, t.hashMap(new int[] {2,5,5,11}, 10));
        assertArrayEquals(null, t.hashMap(new int[] {5,7,11}, 2));
    }
}