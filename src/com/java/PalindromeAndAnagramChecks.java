package com.java;

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
	
	public static void main(String[] args) {
		String str = "RAMAN";
		System.out.println(palindrome(str));
		
	}

}
