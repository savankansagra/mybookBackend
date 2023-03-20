package com.mybook.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ab {
	/*
	 * Given a string array words, 
	 * return an array of all characters that show up in all strings 
	 * within the words (including duplicates). 
	 * You may return the answer in any order
	Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
	 */
	
	public static void main(String[] args) {
		String[] input = new String[3];
		input[0] = "bella";  
		input[1] = "label";  
		input[2] = "roller";  
		
		Map<Character, Integer> countCurrent = new HashMap<>();
		Map<Character, Integer> optimalCount = new HashMap<>();
		
		for(Character c:input[0].toCharArray()) {
			if(optimalCount.containsKey(c)) {
				optimalCount.put(c, optimalCount.get(c)+1); 
			} else {
				optimalCount.put(c, 1);
			}
		}
		
		for(String s:input) {
			for(Character c:s.toCharArray()) {
				if(countCurrent.containsKey(c)) {
					countCurrent.put(c, countCurrent.get(c)+1); 
				} else {
					countCurrent.put(c, 1);
				}
			}
			
			// set current to optimal
			for (Map.Entry<Character, Integer> entry : countCurrent.entrySet()) {
				Character key = entry.getKey();
				Integer val = entry.getValue();
				if(optimalCount.containsKey(key) && optimalCount.get(key) > val) {
					optimalCount.put(key, val);
				}
			}
			
			// check that optimal did not contain extra keys.
			Set<Character> keysToRemove = new HashSet<>();
			for (Map.Entry<Character, Integer> entry : optimalCount.entrySet()) {
				Character key = entry.getKey();
				Integer val = entry.getValue();
				if(countCurrent.containsKey(key)) {
					continue;
				} else {
					keysToRemove.add(key);
				}
			}
			
			for(Character c:keysToRemove) {
				optimalCount.remove(c);
			}
			countCurrent = new HashMap<>();
		}
		
		
		
		List<String> output = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : optimalCount.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			while(val-- > 0) {
				output.add(key.toString());
//				System.out.println(key.toString());
			}
		}
		
		
	}
	
}
