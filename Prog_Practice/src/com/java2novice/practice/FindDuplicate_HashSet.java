package com.java2novice.practice;

import java.util.HashSet;

public class FindDuplicate_HashSet 
{
	public static void main(String[] args) {
		String[] strArray={"abc","def","jkl","mno","pqr","mno","xyz"};
	
	HashSet<String> set= new HashSet<String>();
	for(String arrayElement : strArray)
	{
		if(!set.add(arrayElement)){
			System.out.println("Duplicate Element is : "+arrayElement);
		}
	}

	}
}
