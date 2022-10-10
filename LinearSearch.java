package com.practise.datastructuresandalgorithms;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 2, 4, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				System.out.println("Element 2 is fount at index " + i);
			}
		}
	}

}
