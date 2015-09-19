package com.intr.practice;

import java.util.Scanner;

public class ReverseString {
	 public static void main(String[] args) {
		
	
	String reverse="",original="";
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string to be reversed: ");
	original=sc.nextLine();
	int length=original.length();
	for(int i=length-1;i>=0;i--){
		reverse=reverse+original.charAt(i);
	}
	System.out.println("Reverse strign is : "+reverse);
	 }
}
