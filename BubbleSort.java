package com.practise.datastructuresandalgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 2, 4, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr.length - i-1; j++) {
				int max = 0;
				if (arr[j] < arr[j - 1]) {
					max = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = max;
				}
				// arr[arr.length - i] = max;
				System.out.println(Arrays.toString(arr));
			}
		}

	}

}
