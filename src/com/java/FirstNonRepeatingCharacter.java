package com.java;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	
	
	public static Character nonRepeatingCharacter(String str) {
		
		Character c= str.chars().mapToObj(ch->(char)ch)
				     .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				     .entrySet().stream().filter(s->s.getValue()==1)
				     .map(m->m.getKey()).findFirst().orElse(null);
		
		return c;
	}
	
	public static void main(String[] args) {
		String str1="sundaras";
		
		
		System.out.println(nonRepeatingCharacter(str1));
	}

}
