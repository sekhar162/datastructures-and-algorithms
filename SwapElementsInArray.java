package com.practise.datastructuresandalgorithms;

import java.util.Arrays;

public class SwapElementsInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 2, 3, 7, 8 };

		int[] arr2 = swap(arr, 1, 3);
		System.out.println(Arrays.toString(arr2));

	}

	private static int[] swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return a;
	}
}
