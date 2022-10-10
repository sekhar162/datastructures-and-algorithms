package com.practise.datastructuresandalgorithms;

import java.util.Arrays;

public class ArrayImplementation {

	public static void searchElement(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("  "+key + " found at index" + i);
				break;
			}
		}
	}

	public static int[] deleteElement(int[] arr, int key) {
		int count = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				arr[i] = arr[i + 1];
				count = i;
				break;
			}
		}
		for (int j = count; j < arr.length-1; j++) {
			arr[j] = arr[j + 1];

		}
		return Arrays.copyOf(arr, arr.length - 1);	}

	public static void printElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 4, 5, 3, 6, 8 };
		printElements(arr);

		searchElement(arr, 6);
		int[] arr2 = deleteElement(arr, 6);

		printElements(arr2);
	}

}
