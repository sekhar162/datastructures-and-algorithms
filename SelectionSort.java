package com.practise.datastructuresandalgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 5, 2 };
		for (int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr.length - 1;
			int min = getMinIndex(arr, start+i, end);
			int arr2[] = sort(arr, start + i, min);
			System.out.println(Arrays.toString(arr2));

		}

	}

	private static int[] sort(int[] arr, int start, int min) {
		int temp = arr[start];
		arr[start] = arr[min];
		arr[min] = temp;
		return arr;
	}

	private static int getMinIndex(int[] arr, int start, int end) {
		int index = start;
		
		for (int i = start+1;  i<= end; i++) {
	
			if (arr[i] < arr[index]) {
				index = i;
			} 
		}
		return index;
	}

}
