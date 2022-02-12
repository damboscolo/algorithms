package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome p = new Palindrome();

    @Test
    @DisplayName("Given palindrome number then true")
    public void testPalindrome() {
        assertEquals(true, p.isPalindromeSolution1(0));
        assertEquals(true, p.isPalindromeSolution1(11));
        assertEquals(true, p.isPalindromeSolution1(121));
        assertEquals(true, p.isPalindromeSolution1(1221));
        assertEquals(true, p.isPalindromeSolution1(12221));

        assertEquals(true, p.isPalindromeSolution2(0));
        assertEquals(true, p.isPalindromeSolution2(11));
        assertEquals(true, p.isPalindromeSolution2(121));
        assertEquals(true, p.isPalindromeSolution2(1221));
        assertEquals(true, p.isPalindromeSolution2(12221));
    }

    @Test
    @DisplayName("Given not palindrome number then false")
    public void testNotPalindrome() {
        assertEquals(false, p.isPalindromeSolution1(10));
        assertEquals(false, p.isPalindromeSolution1(1222));
        assertEquals(false, p.isPalindromeSolution1(-121));
        assertEquals(false, p.isPalindromeSolution1(-1221));

        assertEquals(false, p.isPalindromeSolution2(10));
        assertEquals(false, p.isPalindromeSolution2(1222));
        assertEquals(false, p.isPalindromeSolution2(-121));
        assertEquals(false, p.isPalindromeSolution2(-1221));
    }

}