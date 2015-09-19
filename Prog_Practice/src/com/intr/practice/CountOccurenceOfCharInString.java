package com.intr.practice;

import java.util.HashMap;

public class CountOccurenceOfCharInString {
	
	static void charinString(String inputString){
		HashMap<Character, Integer>wordcount=new HashMap<Character,Integer>();
		char[] strArray=inputString.toCharArray();
		for (char c : strArray) {
			if(wordcount.containsKey(c)){
				wordcount.put(c, wordcount.get(c)+1);
			}
			else
			{
				wordcount.put(c, 1);
			}
			
		}
		System.out.println(wordcount);
	}
	public static void main(String[] args) {
		charinString("Java is a powerful language");
	}

}
