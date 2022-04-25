package easy.sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BestSumTest {

    BestSum t = new BestSum();

    @Test
    @DisplayName("recursive - Given a list of int and a target Then return the shortest sum")
    public void test1() {
        assertArrayEquals(new int[] {7, 2}, t.recursive(new int[] {2,7,11,15}, 9));
        assertArrayEquals(new int[] {3, 4, 2}, t.recursive(new int[] {2,4,3,1}, 9));
        assertArrayEquals(new int[] {7}, t.recursive(new int[] {5, 3, 4, 7}, 7));
        assertArrayEquals(new int[] {5, 3}, t.recursive(new int[] {2,3,5}, 8));
        assertArrayEquals(null, t.recursive(new int[] {6,5,11}, 3));
        assertArrayEquals(new int[] {20, 20, 20, 20, 20}, t.memoized(new int[] {7, 20}, 100));

        // The line above took so much time to run recursively
//        assertArrayEquals(null, t.recursive(new int[] {7, 14}, 300));
    }

    @Test
    @DisplayName("memoized - Given a list of int and a target Then return the shortest sum")
    public void test2() {
        assertArrayEquals(new int[] {7, 2}, t.memoized(new int[] {2,7,11,15}, 9));
        assertArrayEquals(new int[] {3, 4, 2}, t.memoized(new int[] {2,4,3,1}, 9));
        assertArrayEquals(new int[] {7}, t.memoized(new int[] {5, 3, 4, 7}, 7));
        assertArrayEquals(new int[] {5, 3}, t.memoized(new int[] {2,3,5}, 8));
        assertArrayEquals(null, t.memoized(new int[] {6,5,11}, 3));
        assertArrayEquals(new int[] {20, 20, 20, 20, 20}, t.memoized(new int[] {7, 20}, 100));

        // Now we can add a very large number
        assertArrayEquals(null, t.memoized(new int[] {7, 14}, 300));
        assertArrayEquals(null, t.memoized(new int[] {7, 14}, 500));
    }
}