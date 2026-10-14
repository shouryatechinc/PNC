package com.java;

public class ReverseOfString {
	
	public static String reverseOfString(String str) {
		
		StringBuilder strs = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			strs.append(str.charAt(i));
		}
		
		
		return strs.toString();
	}
	
	public static void main(String[] args) {
		String str= "Java is the best language";
		System.out.println(reverseOfString(str));
		
	}

}
