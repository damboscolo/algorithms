package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    ClimbingStairs c = new ClimbingStairs();

    @Test
    public void testClimbStairs() {
        // 1 + 1
        // 2
        assertEquals(2, c.climbStairs(2));

        // 1 + 1 + 1
        // 1 + 2
        // 2 + 1
        assertEquals(3, c.climbStairs(3));

        // 1 + 1 + 1 + 1
        // 1 + 1 + 2
        // 1 + 2 + 1
        // 2 + 1 + 1
        // 2 + 2
        assertEquals(5, c.climbStairs(4));

        assertEquals(8, c.climbStairs(5));
    }

    @Test
    public void testClimbStairs2() {
        assertEquals(2, c.climbStairs2(2));
        assertEquals(3, c.climbStairs2(3));
        assertEquals(5, c.climbStairs2(4));
        assertEquals(8, c.climbStairs2(5));
    }
}