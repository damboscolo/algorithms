package easy;

import easy.fibonacci.Fibonacci;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci f = new Fibonacci();

    @Test
    @DisplayName("Given a number then return the fibonacci sum")
    public void fibCommon() {
        assertEquals(0, f.common(0));
        assertEquals(1, f.common(1));
        assertEquals(1, f.common(2));
        assertEquals(2, f.common(3));
        assertEquals(3, f.common(4));
        assertEquals(8, f.common(6));
        assertEquals(13, f.common(7));
        assertEquals(21, f.common(8));
        assertEquals(34, f.common(9));
        assertEquals(55, f.common(10));
        assertEquals(6765, f.common(20));
    }

    @Test
    @DisplayName("Given a number then return the fibonacci sum")
    public void testRecursive() {
        assertEquals(0, f.recursive(0));
        assertEquals(1, f.recursive(1));
        assertEquals(1, f.recursive(2));
        assertEquals(2, f.recursive(3));
        assertEquals(3, f.recursive(4));
        assertEquals(8, f.recursive(6));
        assertEquals(13, f.recursive(7));
        assertEquals(21, f.recursive(8));
        assertEquals(34, f.recursive(9));
        assertEquals(55, f.recursive(10));
        assertEquals(6765, f.recursive(20));
        // More tha 20 it takes too much time because of the O(2^2)
    }

    @Test
    @DisplayName("Given a number then return the fibonacci sum")
    public void tesMemoized() {
        assertEquals(0, f.memoized(0));
        assertEquals(1, f.memoized(1));
        assertEquals(1, f.memoized(2));
        assertEquals(2, f.memoized(3));
        assertEquals(3, f.memoized(4));
        assertEquals(8, f.memoized(6));
        assertEquals(13, f.memoized(7));
        assertEquals(21, f.memoized(8));
        assertEquals(34, f.memoized(9));
        assertEquals(55, f.memoized(10));
        assertEquals(6765, f.memoized(20));
        // here we can calculate much more values because of the memo
        assertEquals(2971215073L, f.memoized(47));
        assertEquals(12586269025L, f.memoized(50));

        // PS: Long/long can't handle the number 31940434634990099905 because it is too large. Need to use BigInteger
        // assertEquals(31940434634990099905L, f.fibDynamicProgrammingStudy(95));
    }

    @Test
    @DisplayName("Given a number then return the fibonacci sum")
    public void testMemoizedBigInteger() {
        assertEquals(BigInteger.valueOf(0), f.memoizedBigInteger(0));
        assertEquals(BigInteger.valueOf(1), f.memoizedBigInteger(1));
        assertEquals(BigInteger.valueOf(1), f.memoizedBigInteger(2));
        assertEquals(BigInteger.valueOf(2), f.memoizedBigInteger(3));
        assertEquals(BigInteger.valueOf(3), f.memoizedBigInteger(4));
        assertEquals(BigInteger.valueOf(8), f.memoizedBigInteger(6));
        assertEquals(BigInteger.valueOf(13), f.memoizedBigInteger(7));
        assertEquals(BigInteger.valueOf(21), f.memoizedBigInteger(8));
        assertEquals(BigInteger.valueOf(34), f.memoizedBigInteger(9));
        assertEquals(BigInteger.valueOf(55), f.memoizedBigInteger(10));
        assertEquals(BigInteger.valueOf(6765), f.memoizedBigInteger(20));
        // here we can calculate much more values because of the memo
        assertEquals(BigInteger.valueOf(2971215073L), f.memoizedBigInteger(47));
        assertEquals(new BigInteger("12586269025"), f.memoizedBigInteger(50));

        // BigInteger can handle the number 31940434634990099905!
        assertEquals(new BigInteger("31940434634990099905"), f.memoizedBigInteger(95));
    }

    @Test
    @DisplayName("Given a number then return the fibonacci sum")
    public void testTabledInt() {
        assertEquals(0, f.tabledLong(0));
        assertEquals(1, f.tabledLong(1));
        assertEquals(1, f.tabledLong(2));
        assertEquals(2, f.tabledLong(3));
        assertEquals(3, f.tabledLong(4));
        assertEquals(8, f.tabledLong(6));
        assertEquals(13, f.tabledLong(7));
        assertEquals(21, f.tabledLong(8));
        assertEquals(34, f.tabledLong(9));
        assertEquals(55, f.tabledLong(10));
        assertEquals(6765, f.tabledLong(20));
//        // here we can calculate much more values because of the memo
        assertEquals(2971215073L, f.tabledLong(47));
        assertEquals(12586269025L, f.tabledLong(50));

        // PS: Long/long can't handle the number 31940434634990099905 because it is too large. Need to use BigInteger
        // assertEquals(31940434634990099905L, f.fibDynamicProgrammingStudy(95));
    }

    @Test
    @DisplayName("Given a number then return the fibonacci sum")
    public void testFibDynamicProgrammingTopDown() {
        assertEquals(0, f.fibDynamicProgrammingTopDown(0));
        assertEquals(1, f.fibDynamicProgrammingTopDown(1));
        assertEquals(1, f.fibDynamicProgrammingTopDown(2));
        assertEquals(2, f.fibDynamicProgrammingTopDown(3));
        assertEquals(3, f.fibDynamicProgrammingTopDown(4));
        assertEquals(8, f.fibDynamicProgrammingTopDown(6));
        assertEquals(13, f.fibDynamicProgrammingTopDown(7));
        assertEquals(21, f.fibDynamicProgrammingTopDown(8));
        assertEquals(34, f.fibDynamicProgrammingTopDown(9));
        assertEquals(55, f.fibDynamicProgrammingTopDown(10));
        assertEquals(6765, f.fibDynamicProgrammingTopDown(20));
    }

    @Test
    @DisplayName("Given a number then return the fibonacci sum")
    public void testFibDynamicProgrammingBottomUp() {
        assertEquals(0, f.fibDynamicProgrammingBottomUp(0));
        assertEquals(1, f.fibDynamicProgrammingBottomUp(1));
        assertEquals(1, f.fibDynamicProgrammingBottomUp(2));
        assertEquals(2, f.fibDynamicProgrammingBottomUp(3));
        assertEquals(3, f.fibDynamicProgrammingBottomUp(4));
        assertEquals(8, f.fibDynamicProgrammingBottomUp(6));
        assertEquals(13, f.fibDynamicProgrammingBottomUp(7));
        assertEquals(21, f.fibDynamicProgrammingBottomUp(8));
        assertEquals(34, f.fibDynamicProgrammingBottomUp(9));
        assertEquals(55, f.fibDynamicProgrammingBottomUp(10));
        assertEquals(6765, f.fibDynamicProgrammingBottomUp(20));
    }
}