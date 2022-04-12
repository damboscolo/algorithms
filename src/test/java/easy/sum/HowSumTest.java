package easy.sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HowSumTest {

    HowSum t = new HowSum();

    @Test
    @DisplayName("recursive - Given a list of int and a target Then return a list of index that sum the target")
    public void test1() {
        assertArrayEquals(new int[] {7, 2}, t.recursive(new int[] {2,7,11,15}, 9));
        assertArrayEquals(new int[] {1, 2, 2, 2, 2}, t.recursive(new int[] {2,4,3,1}, 9));
        assertArrayEquals(new int[] {4, 3}, t.recursive(new int[] {5, 3, 4, 7}, 7));
        assertArrayEquals(new int[] {2, 2, 2, 2}, t.recursive(new int[] {2,3,5}, 8));
        assertArrayEquals(null, t.recursive(new int[] {6,5,11}, 3));

        // The line above took so much time to run recursively
//        assertArrayEquals(null, t.recursive(new int[] {7, 14}, 300));
    }

    @Test
    @DisplayName("recursive - Given a list of int and a target Then return a list of index that sum the target")
    public void test2() {
        assertArrayEquals(new int[] {7, 2}, t.memoized(new int[] {2,7,11,15}, 9));
        assertArrayEquals(new int[] {1, 2, 2, 2, 2}, t.memoized(new int[] {2,4,3,1}, 9));
        assertArrayEquals(new int[] {4, 3}, t.memoized(new int[] {5, 3, 4, 7}, 7));
        assertArrayEquals(new int[] {2, 2, 2, 2}, t.memoized(new int[] {2,3,5}, 8));
        assertArrayEquals(null, t.memoized(new int[] {6,5,11}, 3));

        // Now we can add a very large number
        assertArrayEquals(null, t.memoized(new int[] {7, 14}, 300));
        assertArrayEquals(null, t.memoized(new int[] {7, 14}, 500));
    }
}