package com.intr.practice;

public class FindSecondLargestNum {
	public static void main(String[] args) {
		int[] arr={1, 23, 47, 81, 92, 52, 48, 56, 66, 65,105 };
		int largest=arr[0];
		int secLargest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				secLargest=largest;
				largest=arr[i];
				
			}
			else if(arr[i]>secLargest){
			secLargest=arr[i];
			
			}
		}
		System.out.println("Second Largest number is :"+secLargest);
	}

}
