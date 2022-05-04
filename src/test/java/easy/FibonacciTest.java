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
    public void testFibRecursion() {
        assertEquals(0, f.fibRecursion(0));
        assertEquals(1, f.fibRecursion(1));
        assertEquals(1, f.fibRecursion(2));
        assertEquals(2, f.fibRecursion(3));
        assertEquals(3, f.fibRecursion(4));
        assertEquals(8, f.fibRecursion(6));
        assertEquals(13, f.fibRecursion(7));
        assertEquals(21, f.fibRecursion(8));
        assertEquals(34, f.fibRecursion(9));
        assertEquals(55, f.fibRecursion(10));
        assertEquals(6765, f.fibRecursion(20));
        // More tha 20 it takes too much time because of the O(2^2)
    }

    @Test
    @DisplayName("Given a number then return the fibonacci sum")
    public void fibNotRecursive() {
        assertEquals(0, f.fibNotRecursive(0));
        assertEquals(1, f.fibNotRecursive(1));
        assertEquals(1, f.fibNotRecursive(2));
        assertEquals(2, f.fibNotRecursive(3));
        assertEquals(3, f.fibNotRecursive(4));
        assertEquals(8, f.fibNotRecursive(6));
        assertEquals(13, f.fibNotRecursive(7));
        assertEquals(21, f.fibNotRecursive(8));
        assertEquals(34, f.fibNotRecursive(9));
        assertEquals(55, f.fibNotRecursive(10));
        assertEquals(6765, f.fibNotRecursive(20));
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
    public void tesFibDynamicProgrammingStudy() {
        assertEquals(0, f.fibDynamicProgrammingStudy(0));
        assertEquals(1, f.fibDynamicProgrammingStudy(1));
        assertEquals(1, f.fibDynamicProgrammingStudy(2));
        assertEquals(2, f.fibDynamicProgrammingStudy(3));
        assertEquals(3, f.fibDynamicProgrammingStudy(4));
        assertEquals(8, f.fibDynamicProgrammingStudy(6));
        assertEquals(13, f.fibDynamicProgrammingStudy(7));
        assertEquals(21, f.fibDynamicProgrammingStudy(8));
        assertEquals(34, f.fibDynamicProgrammingStudy(9));
        assertEquals(55, f.fibDynamicProgrammingStudy(10));
        assertEquals(6765, f.fibDynamicProgrammingStudy(20));
        // here we can calculate much more values because of the memo
        assertEquals(2971215073L, f.fibDynamicProgrammingStudy(47));
        assertEquals(12586269025L, f.fibDynamicProgrammingStudy(50));

        // PS: Long/long can't handle the number 31940434634990099905 because it is too large. Need to use BigInteger
//        assertEquals(31940434634990099905L, f.fibDynamicProgrammingStudy(95));
    }
    @Test
    @DisplayName("Given a number then return the fibonacci sum")
    public void tesFibBigInteger() {
        assertEquals(BigInteger.valueOf(0), f.fibBigInteger(0));
        assertEquals(BigInteger.valueOf(1), f.fibBigInteger(1));
        assertEquals(BigInteger.valueOf(1), f.fibBigInteger(2));
        assertEquals(BigInteger.valueOf(2), f.fibBigInteger(3));
        assertEquals(BigInteger.valueOf(3), f.fibBigInteger(4));
        assertEquals(BigInteger.valueOf(8), f.fibBigInteger(6));
        assertEquals(BigInteger.valueOf(13), f.fibBigInteger(7));
        assertEquals(BigInteger.valueOf(21), f.fibBigInteger(8));
        assertEquals(BigInteger.valueOf(34), f.fibBigInteger(9));
        assertEquals(BigInteger.valueOf(55), f.fibBigInteger(10));
        assertEquals(BigInteger.valueOf(6765), f.fibBigInteger(20));
        // here we can calculate much more values because of the memo
        assertEquals(BigInteger.valueOf(2971215073L), f.fibBigInteger(47));
        assertEquals(new BigInteger("12586269025"), f.fibBigInteger(50));

        // BigInteger can handle the number 31940434634990099905!
        assertEquals(new BigInteger("31940434634990099905"), f.fibBigInteger(95));
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