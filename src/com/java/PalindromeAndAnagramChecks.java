package com.java;

import java.util.Arrays;

public class PalindromeAndAnagramChecks {
	
	public static String palindrome(String str) {
		
		StringBuffer buf = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			buf.append(str.charAt(i));
		}
		if(buf.toString().equals(str)) {
			return "String is plaindrome "+str;
		}else {
			return "String is not plaindrome"+str;
		}
		
	}
	
	public static String sort(String str) {
		char[] val = str.toCharArray();
		Arrays.sort(val);
		String sorted = new String(val);
		return sorted;
	}
	
	public static String AnagramCheck(String str1,String str2) {
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length()-1;i++) {
				if(sort(str1).equals(sort(str2))){
					return "They are anagrams " +str1+","+str2;
				}else {
					return "They are not anagrams " +str1+","+str2;
				}
			}
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		String str = "RAMAN";
		System.out.println(palindrome(str));
		String str1="silent";
		String str2="listem";
		
		System.out.println(AnagramCheck(str1,str2));
		
	}

}
