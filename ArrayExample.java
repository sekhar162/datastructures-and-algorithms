package com.practise.datastructuresandalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			int element = scr.nextInt();
			arr[i] = element;
		}
		System.out.print(Arrays.toString(arr));

		// displaying
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("********");
		// displaying
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
