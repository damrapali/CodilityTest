package com.test;

public class Question19 {
	
	//What is stable algorithm? write an algorithm for quicksort. 
	//sort the fallowing using quicksort. is quick sort is stable algorithm. 
	//if not give reason. 50 70 10 40 50
	
	public static void main(String[] args) {
		int[] arr = {10,2,4,5,62,34,67,34,12,4,7,8};
		int start = 0;
		int end = arr.length-1;
		quickSort(arr, start, end);
		
		for(int i: arr) {
			System.out.print(i+ ", ");
		}
	}
	
	public static void quickSort(int[] arr, int start, int end){
		
		int index = partition(arr, start, end);
		if(start<index-1) {
			quickSort(arr, start, index-1);
		}
		if(index < end) {
			quickSort(arr, index, end);
		}		
	}
	
	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		
		while(start<=end) {
			while(arr[start] < pivot) 
				start++;
			while(arr[end]>pivot)
				end--;
			
			if(start<= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;	
			start ++;
			end --;
			}
		}
		return start;
	}
}
