package com.practise.datastructuresandalgorithms;

import java.util.Scanner;

public class BinarySearch1 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 6, 8, 9, 11, 15, 19, 22 };
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter value to be searched");
		int target = scr.nextInt();
		int index = binarySearch(arr, target);
		if (index != -1) {
			System.out.println(target + " found at index " + index);
		} else
			System.out.println(target + " not found in an array ");

	}

	private static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

}
