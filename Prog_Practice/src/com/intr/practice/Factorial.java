package com.intr.practice;

public class Factorial {
	
	public void fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		
		System.out.println("Factorial of number n is : "+f);
	}
	public static void main(String[] args) {
		new Factorial().fact(5);
	}

}
