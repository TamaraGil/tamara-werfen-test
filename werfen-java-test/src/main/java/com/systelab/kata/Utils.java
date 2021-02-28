package com.systelab.kata;

import java.util.List;

public class Utils {


	/**
	 * Returns true if the char located in the given index of the string is a white space.
	 * @param str
	 * @param index
	 * @return
	 */
	public static boolean isWhiteSpaceChar(String str, int index) {
		
		if (str == null || str.isEmpty() ) {
			return false;
		}else {
			return Character.isWhitespace(str.charAt(index));			
		}
	}

	/**
	 * Return the length of the given string ignoring white spaces.
	 * 
	 * @param str
	 * @return
	 */
	public static int getStringLengthWithoutSpaces(String str) {
		if (str!= null && !str.isEmpty()) {
			String stringWithoutSpaces = str.replaceAll("\\s", "");
			return stringWithoutSpaces.length();
		} else {
			return 0;
		}
	}

	/**
	 * Returns a string transforming the char located at the given index to
	 * upper case. 
	 * 
	 * @param indexCharToUpperCase 
	 * @param str
	 * @return
	 */
	public static String upperCaseCharInString(int indexCharToUpperCase, String str) {
		
		if ( str!=null && !str.isEmpty()){
			
			String firstPart = str.substring(0,indexCharToUpperCase);
			String secondPart = str.substring(indexCharToUpperCase, str.length());	
			
			return firstPart + upperCaseFirstChar(secondPart);
			
		}else {
			return str;
		}

	}
	
	
	/**
	 * Uppercases the first char of the given string
	 * 
	 * @param indexCharToUpperCase 
	 * @param str
	 * @return
	 */
	public static String upperCaseFirstChar(String str) {
		
		if ( str!=null && !str.isEmpty()){		
			return str.substring(0, 1).toUpperCase() + str.substring(1);			
		}else {
			return str;
		}
		
	}
	
	/**
	 * Returns an array of primitive int from a given Integer List
	 * @param result
	 * @return
	 */
	public static int[] getIntArrayFromIntegerList(List<Integer> result) {
		return result.stream().mapToInt(j -> j).toArray();
	}
	
	
	/**
	 * Returns an array of Strings from a given String List
	 * @param result
	 * @return
	 */
	public static String[] getStringArrayFromStringList(List<String> result) {
		return result.stream().toArray(String[]::new);
	}

	/**
	 * Returns true if the given number is divisible by divider
	 * @param number
	 * @param divider
	 * @return
	 */
	public static boolean isDivisibleBy(int number, int divider) {
		if (divider == 0) {
			return false;
		}else {
			return number % divider == 0;			
		}
	}
	
	/**
	 * Returns true if the given number is a positive number.
	 * @param number
	 * @return
	 */
	public static boolean isPositive (int number) {
		if (number>0) {
			return true;
		}else {
			return false;
		}
	}

}