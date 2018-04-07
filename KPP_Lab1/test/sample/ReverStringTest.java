package sample;

import static org.junit.Assert.*;

/**
 * Test class for ReverString class.
 *
 * @author Valentin Studenichnik
 */
final class ReverStringTest {

    /**
     * Test method
     */
    @org.junit.jupiter.api.Test
    void reverse() {
        String input = "ABC 123 ";
        String actual = ReverString.reverse(input);
        String expected = " 321 CBA";

        assertEquals(actual, expected);
    }
}