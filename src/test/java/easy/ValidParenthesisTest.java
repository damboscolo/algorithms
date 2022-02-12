package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    ValidParenthesis v = new ValidParenthesis();

    @Test
    public void testMySolutionParenthesis() {
        assertTrue(v.mySolution("()"));
        assertTrue(v.mySolution("()[]{}"));
        assertTrue(v.mySolution("{[]}"));
        assertTrue(v.mySolution("{[([{}])]}"));
        assertFalse(v.mySolution("(]"));
        assertFalse(v.mySolution("{}(]"));
        assertFalse(v.mySolution("{[([{]])]}"));
        assertFalse(v.mySolution("["));
        assertFalse(v.mySolution("(("));
        assertFalse(v.mySolution("]"));
        assertFalse(v.mySolution("(){}}{"));
        assertFalse(v.incredibleSolution("<()>"));
    }

    @Test
    public void testIncredibleSolutionParenthesis() {
        assertTrue(v.incredibleSolution("()"));
        assertTrue(v.incredibleSolution("()[]{}"));
        assertTrue(v.incredibleSolution("{[]}"));
        assertTrue(v.incredibleSolution("{[([{}])]}"));
        assertFalse(v.incredibleSolution("(]"));
        assertFalse(v.incredibleSolution("{}(]"));
        assertFalse(v.incredibleSolution("{[([{]])]}"));
        assertFalse(v.incredibleSolution("["));
        assertFalse(v.incredibleSolution("(("));
        assertFalse(v.incredibleSolution("]"));
        assertFalse(v.incredibleSolution("(){}}{"));
        assertFalse(v.incredibleSolution("<()>"));
    }

}