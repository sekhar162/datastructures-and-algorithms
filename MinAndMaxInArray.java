package com.practise.datastructuresandalgorithms;

public class MinAndMaxInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 2, 4, 8, 9 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		min1(arr, min);

		min2(arr);

		max1(arr, max);

		max2(arr);
	}

	private static void min2(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	private static void min1(int[] arr, int min) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	private static void max1(int[] arr, int max) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	private static void max2(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
