package com.intr.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumb {
	
	public static void main(String[] args) {
		int[] randomintegers={2,3,6,8,4,9,5,1,2,3};
		//int max=Integer.MIN_VALUE;
		//int secmax=Integer.MIN_VALUE;
		List<Integer> list=new ArrayList<>();
		for(int i: randomintegers){
			
			if(!(list.contains(i))){
				list.add(i);
			}
		}
		Collections.sort(list);
		System.out.println(list.size()-1);
	}

}
