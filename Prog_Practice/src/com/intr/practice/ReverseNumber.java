package com.intr.practice;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int n,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed: ");
		n=sc.nextInt();
		
		while(n!=0){
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println("Reverse number is: "+reverse);
	}

}
