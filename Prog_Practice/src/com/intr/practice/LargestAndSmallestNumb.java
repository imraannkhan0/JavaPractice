package com.intr.practice;

public class LargestAndSmallestNumb {
	public static void main(String[] args) {
		int[] arr={32,43,53,54,32,65,63,98,43,23};
		int smallest=arr[0];
		int largest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>largest)
				largest=arr[i];
			else if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println("Largest Number is : "+ largest);
		System.out.println("Smallest Number is: "+smallest);
	}
	

}
