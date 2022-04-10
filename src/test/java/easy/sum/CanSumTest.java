package easy.sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CanSumTest {

    CanSum t = new CanSum();

    @Test
    @DisplayName("usingFour - Given a list of int and a target Then return a list of index that sum the target")
    public void testMine() {
        assertEquals(true, t.usingFour(new int[] {2,7,11,15}, 9));
        assertEquals(true, t.usingFour(new int[] {2,11,7,15}, 9));
        assertEquals(true, t.usingFour(new int[] {2,11,15,7}, 9));
        assertEquals(true, t.usingFour(new int[] {3,2,4}, 6));
        assertEquals(true, t.usingFour(new int[] {3,3}, 6));
        assertEquals(true, t.usingFour(new int[] {2,5,5,11}, 10));
        assertEquals(false, t.usingFour(new int[] {6,5,11}, 3));
    }

    @Test
    @DisplayName("hashMap - Given a list of int and a target Then return a list of index that sum the target")
    public void testHashMap() {
        assertEquals(true, t.hashMap(new int[] {2,7,11,15}, 9));
        assertEquals(true, t.hashMap(new int[] {2,11,7,15}, 9));
        assertEquals(true, t.hashMap(new int[] {2,11,11,7,15}, 9));
        assertEquals(true, t.hashMap(new int[] {2,11,15,7}, 9));
        assertEquals(true, t.hashMap(new int[] {3,2,4}, 6));
        assertEquals(true, t.hashMap(new int[] {3,3}, 6));
        assertEquals(true, t.hashMap(new int[] {2,5,5,11}, 10));
        assertEquals(false, t.hashMap(new int[] {5,7,11}, 2));
    }

    @Test
    @DisplayName("recursive - Given a list of int and a target Then return a list of index that sum the target")
    public void testRecursive() {
        assertEquals(true, t.recursive(new int[] {2,7,11,15}, 9));
        assertEquals(true, t.recursive(new int[] {2,11,7,15}, 9));
        assertEquals(true, t.recursive(new int[] {2,11,11,7,15}, 9));
        assertEquals(true, t.recursive(new int[] {2,11,15,7}, 9));
        assertEquals(true, t.recursive(new int[] {3,2,4}, 6));
        assertEquals(true, t.recursive(new int[] {3,3}, 6));
        assertEquals(true, t.recursive(new int[] {2,5,5,11}, 10));
        assertEquals(false, t.recursive(new int[] {5,7,11}, 2));
        // The line above took too much time to run the algorithm
//        assertEquals(false, t.dynamicProgramming(new int[] {7, 14}, 300));
    }

    @Test
    @DisplayName("dynamicProgramming - Given a list of int and a target Then return a list of index that sum the target")
    public void testDynamicProgramming() {
        assertEquals(true, t.dynamicProgramming(new int[] {2,7,11,15}, 9));
        assertEquals(true, t.dynamicProgramming(new int[] {2,11,7,15}, 9));
        assertEquals(true, t.dynamicProgramming(new int[] {2,11,11,7,15}, 9));
        assertEquals(true, t.dynamicProgramming(new int[] {2,11,15,7}, 9));
        assertEquals(true, t.dynamicProgramming(new int[] {3,2,4}, 6));
        assertEquals(true, t.dynamicProgramming(new int[] {3,3}, 6));
        assertEquals(true, t.dynamicProgramming(new int[] {2,5,5,11}, 10));
        assertEquals(false, t.dynamicProgramming(new int[] {5,7,11}, 2));

        // We can add much more values
        assertEquals(false, t.dynamicProgramming(new int[] {7, 14}, 300));
        assertEquals(true, t.dynamicProgramming(new int[] {7, 14}, 301));
        assertEquals(false, t.dynamicProgramming(new int[] {7, 14}, 1000));
    }
}