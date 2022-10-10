package com.practise.datastructuresandalgorithms;

import java.util.Scanner;

//Find the element in an array when the array in Descending order and in Ascending order.
public class BinarySearch2 {

	public static void main(String[] args) {

		// ascending order.
//		int[] arr = { 2, 4, 5, 6, 8, 9, 11, 15, 19, 22 };

		// descending order
		int[] arr = { 42, 34, 25, 16, 8, 7, 6, 4, 3, 2, 1 };

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
		boolean isAsc = false;

		if (arr[0] < arr[arr.length - 1]) {
			isAsc = true;
		}
		if (isAsc) {
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
		} else {

			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (arr[mid] > target) {
					start = mid + 1;
				} else if (arr[mid] < target) {
					end = mid - 1;
				} else {
					return mid;
				}
			}

		}
		return -1;

	}

}
