package com.java2novice.practice;

public class FindDuplicate_BruteForce 
{
	public static void main(String[] args) 
	{
		String[] strArray={"abc","def","jkl","mno","pqr","mno","xyz"};
		//1. Using BruteForce Method
		
		for (int i = 0; i < strArray.length-1; i++) 
		{
			for (int j = i+1; j < strArray.length; j++) 
			{
				if(strArray[i].equals(strArray[j]) && (i!=j))  
				{
					System.out.println("Duplicate Element is: "+strArray[i]);
				}
				
			}
			
		}
		
	}

}
