package com.intr.practice;

import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		String[] words=str.trim().split(" ");
		System.out.println("Number of words in a given string is : "+words.length);
	}

}
