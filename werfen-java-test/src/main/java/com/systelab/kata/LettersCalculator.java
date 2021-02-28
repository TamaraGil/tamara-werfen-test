package com.systelab.kata;

import java.util.Arrays;

public class LettersCalculator {

	static final String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

	static final int MAX_SUM = alphabet.length;

	public static String addLetters(String... letters) {
		
		if (letters.length == 0) {
			return "z";
		} else if (letters.length == 1) {
			return letters[0];
		} else {

			int sumaGlobal = 0;
			for (int i = 0; i < letters.length; i++) {
				int nextSuma = sumaGlobal + getIndexInAlphabet(letters[i]) + 1;
				if (isOverflow(nextSuma)) {
					sumaGlobal = nextSuma - MAX_SUM;
				} else {
					sumaGlobal = nextSuma;
				}

			}
			return alphabet[sumaGlobal - 1];
		}
	}

	/**
	 * Returns true if the given int is greater than alphabet length.
	 * 
	 * @param nextSuma
	 * @return
	 */
	private static boolean isOverflow(int nextSuma) {
		return nextSuma >= MAX_SUM;
	}

	/**
	 * Finds the given string in alphabet array and returns its index.
	 * 
	 * @param string
	 * @return
	 */
	private static int getIndexInAlphabet(String string) {
		return Arrays.asList(alphabet).indexOf(string);		
    }
		

}
