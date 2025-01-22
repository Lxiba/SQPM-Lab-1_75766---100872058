package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest {
    /**
     * Test the constructor with a valid binary value.
     */
    @Test
    public void normalConstructor() {
        Binary binary = new Binary("1001001");
        assertEquals("1001001", binary.getValue());
    }

    /**
     * Test the constructor with an invalid binary value of out-of-range digits.
     */
    @Test
    public void constructorWithInvalidDigits() {
        Binary binary = new Binary("1001001211");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test the constructor with an invalid binary value of alphabetic characters.
     */
    @Test
    public void constructorWithInvalidChars() {
        Binary binary = new Binary("1001001A");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test the constructor with an invalid binary value that has a sign.
     */
    @Test
    public void constructorWithNegativeSign() {
        Binary binary = new Binary("-1001001");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test the constructor with a zero-tailing valid binary value.
     */
    @Test
    public void constructorWithZeroTailing() {
        Binary binary = new Binary("00001001");
        assertTrue(binary.getValue().equals("1001"));
    }

    /**
     * Test the constructor with an empty string.
     */
    @Test
    public void constructorEmptyString() {
        Binary binary = new Binary("");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test the AND function with two binary numbers of the same length.
     */
    @Test
    public void andSameLength() {
        Binary binary1 = new Binary("1100");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("1000"));
    }
    /**
     * Test the OR function with two binary numbers of the same length.
     */
    @Test
    public void orSameLength() {
        Binary binary1 = new Binary("1100");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1110"));
    }
    /**
     * Test the Multiplication function with two binary numbers of the same length.
     */
    @Test
    public void multiplySameLength() {
        Binary binary1 = new Binary("1100");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("1111000"));
    }

    /**
     * Test the AND function where the first binary number is shorter than the second.
     */
    @Test
    public void andShorterFirst() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("10"));
    }
    /**
     * Test the OR function where the first binary number is shorter than the second.
     */
    @Test
    public void orShorterFirst() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1011"));
    }
    /**
     * Test the Multiplication function where the first binary number is shorter than the second.
     */
    @Test
    public void multiplyShorterFirst() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("11110"));
    }

    /**
     * Test the AND function where the first binary number is longer than the second.
     */
    @Test
    public void andLongerFirst() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("10"));
    }
    /**
     * Test the OR function where the first binary number is longer than the second.
     */
    @Test
    public void orLongerFirst() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1011"));
    }
    /**
     * Test the Multiplication function where the first binary number is longer than the second.
     */
    @Test
    public void multiplyLongerFirst() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("11110"));
    }

    /**
     * Test the AND function where one of the binary numbers is zero.
     */
    @Test
    public void andWithZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1101");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
    /**
     * Test the OR function where one of the binary numbers is zero.
     */
    @Test
    public void orWithZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1101");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1101"));
    }
    /**
     * Test the Multiplication function where one of the binary numbers is zero.
     */
    @Test
    public void multiplyWithZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1101");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }

    /**
     * Test the AND function where both binary numbers are zero.
     */
    @Test
    public void andBothZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
    /**
     * Test the OR function where both binary numbers are zero.
     */
    @Test
    public void orBothZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
    /**
     * Test the Multiplication function where both binary numbers are zero.
     */
    @Test
    public void multiplyBothZero() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
}