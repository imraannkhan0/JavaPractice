package com.intr.practice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {
	
	static void duplicateWords(String inputstring)
	{
		String[] words=inputstring.split(" ");
		HashMap<String, Integer>count=new HashMap<String, Integer>();
		for (String strWrd : words) {
			if(count.containsKey(strWrd.toLowerCase()))
			{
				count.put(strWrd.toLowerCase(), count.get(strWrd.toLowerCase()));
				
			}
			else
			{
				count.put(strWrd.toLowerCase(), 1);
			}
			
		}
		Set<String> wordsinString=count.keySet();
		for (String stringword : wordsinString) {
			if(count.get(stringword)>1)
			{
				System.out.println(stringword+" : "+count.get(stringword));
			}
			
		}
	}

	public static void main(String[] args) {
		//duplicateWords("I am a Programmer");
		duplicateWords("Java is java again java");
	}
}
