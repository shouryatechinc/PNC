package com.java;

public class CharactersCount {
	
	public static int totalCharactersInString(String str) {
		
		str=str.replace(" ","");
		System.out.println(str);
		int count =0;
		for(char c: str.toCharArray()) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to count all the characters
        String str = "Java is a beautiful langauage";
        int val = totalCharactersInString(str);
        System.out.println(val);
	}

}
