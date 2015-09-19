package com.java2novice.practice;

import java.util.ArrayList;
import java.util.List;


public class FindDuplicateFrom1ToN
{
	public int getSum(List<Integer> numbers)
	{
		int sum=0;
		for (int num : numbers) {
			sum+=num;
			
		}
		return sum;
	}
	
	public int findDupNum(List<Integer>numbers)
	{
		int highestNum=numbers.size()-1;
		int total=getSum(numbers);
		int duplicateNum=total-(highestNum*(highestNum+1)/2);
		return duplicateNum;
		
	}
	
	public static void main(String[] args) {
		List<Integer> numbers= new ArrayList<Integer>();
		for(int i=1;i<30;i++)
		{
			numbers.add(i);
			
		}
		numbers.add(22);
		FindDuplicateFrom1ToN fdn=new FindDuplicateFrom1ToN();
		System.out.println("Duplicate Number is : "+fdn.findDupNum(numbers));
		
	}
}
