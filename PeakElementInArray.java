package com.practise.datastructuresandalgorithms;

public class PeakElementInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		int peak = peakIndexInMountainArray(arr);
		System.out.println(peak);
	}

	private static int peakIndexInMountainArray(int[] arr) {
		int max = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				max = arr[i];
			}
		}
		return max;
	}

}
