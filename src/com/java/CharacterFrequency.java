package com.java;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterFrequency {
	
	
	public static void characterFrequency(String str1){
		
		Map<Character,Integer> count = new HashMap<Character, Integer>();
		for(Character ch:str1.toCharArray()) {
			if(count.containsKey(ch)) {
				count.put(ch, count.get(ch)+1);
			}else {
				count.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:count.entrySet()) {
			System.out.println("Character is-"+entry.getKey()+"Frequency is-"+entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="sundaras";
		characterFrequency(str1);

	}

}
