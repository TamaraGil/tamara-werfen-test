package com.systelab.kata;

public class MexicanWave {

	public static String[] wave(String str) {

		if (str != null && !str.isEmpty()) {

			int resultArrayLength = Utils.getStringLengthWithoutSpaces(str);
			String[] resultArray = new String[resultArrayLength];

			int resultArrayIndex = 0;
			for (int i = 0; i < str.length(); i++) {
				
				if (!Utils.isWhiteSpaceChar(str, i)) {
					resultArray[resultArrayIndex] = Utils.upperCaseCharInString(i, str);
					resultArrayIndex++;
				}
			}

			return resultArray;

		} else {
			return new String[] {};
		}
	}

}