package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testAddition() {
        String result = Main.mathFunction(2, 3, 5);
        assertEquals("+", result);
    }

    @Test
    public void testSubtraction() {
        String result = Main.mathFunction(7, 3, 4);
        assertEquals("-", result);
    }

    @Test
    public void testMultiplication() {
        String result = Main.mathFunction(4, 5, 20);
        assertEquals("*", result);
    }

    @Test
    public void testDivision() {
        String result = Main.mathFunction(10, 2, 5);
        assertEquals("/", result);
    }

    @Test
    public void testNoExpression() {
        String result = Main.mathFunction(4, 3, 2);
        assertEquals("None", result);
    }

    @Test
    public void testZeroDivision() {
        String result = Main.mathFunction(5, 0, 2);
        assertEquals("None", result);
    }


    @Test
    public void testMultipleExpressions() {
        String result = Main.mathFunction(2, 2, 4);
        // I have to use a helper function if the length of the output string is longer than 1 and not "None"
        assertTrue(areAnagrams("*+", result));
    }

    @Test
    public void testMultipleExpressionsReverseOrder() {
        String result = Main.mathFunction(2, 2, 4);
        // I have to use a helper function if the length of the output string is longer than 1 and not 'None'
        assertTrue(areAnagrams("+*", result));
    }

    @Test
    public void testLongerOutput() {
        String result = Main.mathFunction(0, 0, 0);
        // I have to use a helper function if the length of the output string is longer than 1 and not 'None'
        assertTrue(areAnagrams("*+-", result));
    }

    @Test
    public void testLongerOutputWithDifferentOrder() {
        String result = Main.mathFunction(0, 0, 0);
        // I have to use a helper function if the length of the output string is longer than 1 and not 'None'
        assertTrue(areAnagrams("+*-", result));
    }

    @Test
    public void testLongerOutputDifferentLength() {
        String result = Main.mathFunction(0, 0, 0);
        // I have to use a helper function if the length of the output string is longer than 1 and not 'None'
        assertFalse(areAnagrams("*", result));
    }


    public static boolean areAnagrams(String str1, String str2) {
        // The coding challenge didn't specify anything about the order of the operators
        // I'm assuming the output can be in any order
        // That's why I'm using this helper function to test the cases

        // Check if the lengths of both strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // I could have used a method to check if both strings are anagrams
        // with better time complexity, but due to the length is too short it doesn't matter

        // Convert both strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}