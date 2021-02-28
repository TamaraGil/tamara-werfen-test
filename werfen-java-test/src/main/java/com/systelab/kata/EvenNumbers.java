package com.systelab.kata;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
	
    public static int[] divisibleBy(int[] numbers, int divider) {
    	
    	if (divider == 0) {
            return new int[] {};
    	}else if (divider == 1) {
    		return numbers;
    	}else {

    		List<Integer> result  = new ArrayList<Integer>(); 	  
    		
    		for ( int i=0; i<numbers.length;i++) {
    			if ( Utils.isDivisibleBy(numbers[i], divider)) {
    				result.add(numbers[i]);	
    			}
    		}
    		return Utils.getIntArrayFromIntegerList(result);
    	}
    	
    }


}
