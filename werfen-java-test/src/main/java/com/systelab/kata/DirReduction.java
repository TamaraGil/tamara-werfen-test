package com.systelab.kata;

import java.util.ArrayList;
import java.util.List;

public class DirReduction {


	private static final String EAST = "EAST";
	private static final String SOUTH = "SOUTH";
	private static final String WEST = "WEST";
	private static final String NORTH = "NORTH";

	public static class Position{
		int x;
		int y;	
	}

	public static String[] dirReduc(String[] arr) {

		if (arr != null && arr.length != 0) {
			Position finalPosition = getFinalPosition(arr);			
			return getSimplifiedPlan(finalPosition);		
		}else {
			return new String[]{};
		}
	}
	

	/**
	 * Returns a list of minimum movements to reach the given position.
	 * @param position
	 * @return
	 */
	private static String[] getSimplifiedPlan(Position position) {

		List<String> result = new ArrayList<String>();

		if (position.x != 0) {
			result = setSimplifiedHorizontalPlan(result, position.x);
		}
		if (position.y != 0) {
			result = getSimplifiedVerticalPlan(result, position.y);
		}
		return Utils.getStringArrayFromStringList(result);

	}

	/**
	 * Returns a list of minimum movements to reach the given vertical position.
	 * @param result
	 * @param Y_Position
	 * @return
	 */
	private static List<String> getSimplifiedVerticalPlan(List<String> result, int Y_Position) {
		for (int i = 0; i < Y_Position; i++) {
			if (Utils.isPositive(Y_Position)) {
				result.add(NORTH);
			} else {
				result.add(SOUTH);
			}
		}
		return result;
	}

	/**
	 * Returns a list of minimum movements to reach the given horizontal position.
	 * @param result
	 * @param X_Position
	 * @return
	 */
	private static List<String> setSimplifiedHorizontalPlan(List<String> result, int X_Position) {
		for (int i = 0; i < X_Position; i++) {
			if (Utils.isPositive(X_Position)) {
				result.add(WEST);
			} else {
				result.add(EAST);
			}
		}
		return result;
	}

	/**
	 * Calculates final position after reading an array of movements.
	 * @param arr
	 * @return
	 */
	private static Position getFinalPosition(String[] arr) {
		Position finalPosition = new Position();
		 
	
		for (int i = 0; i < arr.length; i++) {
			String direction = arr[i];

			switch (direction) {
			case NORTH:
				finalPosition.y++;
				break;
			case WEST:
				finalPosition.x++;
				break;
			case SOUTH:
				finalPosition.y--;
				break;
			case EAST:
				finalPosition.x--;
				break;
			default:
				break;
			}
		}
		return finalPosition;
	}
}