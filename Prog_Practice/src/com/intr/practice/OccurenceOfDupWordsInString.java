package com.intr.practice;

import java.util.HashMap;
import java.util.Set;


public class OccurenceOfDupWordsInString {
	
	static void duplicateWords(String inputString){
		String[] words=inputString.split(" ");
		HashMap<String, Integer> wrdcount=new HashMap<String, Integer>();
		
		for (String strwrd : words) {
			
			if(wrdcount.containsKey(strwrd.toLowerCase())){
				wrdcount.put(strwrd.toLowerCase(), wrdcount.get(strwrd.toLowerCase()+1));
				
			}
			else{
				wrdcount.put(strwrd.toLowerCase(), 1);
				
			}
		}
		Set<String> wordsInString=wrdcount.keySet();
		for (String str : wordsInString) {
			if(wrdcount.get(str)>1){
				System.out.println(str+" : "+wrdcount.get(str));
			}
			
		}
	}
	public static void main(String[] args) {
		duplicateWords("Java is java is java is java agian");
	}

}
