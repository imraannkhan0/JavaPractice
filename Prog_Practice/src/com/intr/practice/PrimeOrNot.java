package com.intr.practice;

public class PrimeOrNot {
	
	public boolean isPrimeNumber(int number){
		for(int i=2;i<=number/2;i++){
			if(number%i==0){
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		PrimeOrNot pn=new PrimeOrNot();
		System.out.println("Is 17 prime number :"+pn.isPrimeNumber(17));
	}

}
