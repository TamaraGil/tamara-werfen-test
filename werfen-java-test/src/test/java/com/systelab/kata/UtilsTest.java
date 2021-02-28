package com.systelab.kata;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UtilsTest {
	
	//TODO UtilTest.java testing is not finished. 
	
    @Test
    @DisplayName("Test isWhiteSpaceChar - String with no white spaces returns false")   
    public void testStringWithNoWhiteSpaceCharReturnsFalse() {
        assertFalse(Utils.isWhiteSpaceChar("hello", 3));
    }

    @Test
    @DisplayName("Test isWhiteSpaceChar - String with white spaces returns false")   
    public void testStringWithWhiteSpaceCharReturnsFalse() {
        assertFalse(Utils.isWhiteSpaceChar("hello Jhon", 3));
    }

    @Test
    @DisplayName("Test isWhiteSpaceChar -  String with white spaces returns true")   
    public void testStringWithWhiteSpaceCharReturnsTrue() {
        assertTrue(Utils.isWhiteSpaceChar("hello Jhon", 5));
    }

    @Test
    @DisplayName("Test isWhiteSpaceChar -  Empty string returns false")   
    public void testEmptyStringReturnsFalse() {
        assertFalse(Utils.isWhiteSpaceChar("", 3));
    }
    
    @Test
    @DisplayName("Test isWhiteSpaceChar -  Null string returns false")   
    public void testNullStringReturnsFalse() {
        assertFalse(Utils.isWhiteSpaceChar(null, 3));
    }
    
    @Test
    @DisplayName("Test getStringLenghtWithoutSpaces - Returns string length")   
    public void testStringReturnsLength() {
        assertEquals(5,Utils.getStringLengthWithoutSpaces("hello"));
    }
    
    @Test
    @DisplayName("Test getStringLenghtWithoutSpaces - String with white spaces returns string length")   
    public void testStringWithWhiteSpacesReturnsLength() {
        assertEquals(9,Utils.getStringLengthWithoutSpaces("hello Mery"));
    }
    
    @Test
    @DisplayName("Test getStringLenghtWithoutSpaces - Empty String returns zero")   
    public void testEmptyStringReturnsZero() {
        assertEquals(0,Utils.getStringLengthWithoutSpaces(""));
    }
    
    @Test
    @DisplayName("Test upperCaseCharInString - Uppercase char")   
    public void testUppercaseChar() {
        assertEquals("heLlo",Utils.upperCaseCharInString(2, "hello"));
    }

    
    @Test
    @DisplayName("Test upperCaseCharInString - Empty string returns empty string")   
    public void testUpperCaseEmptyString() {
        assertEquals("",Utils.upperCaseCharInString(1, ""));
    }
    
    @Test
    @DisplayName("Test upperCaseCharInString - Null string returns null string")   
    public void testNullStringReturnsZero() {
        assertEquals(null,Utils.upperCaseCharInString(1, null));
    }
   
}
