package com.practise.datastructuresandalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D2 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		Scanner scr = new Scanner(System.in);

		// 1 displaying
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("************************");

		// 2 displaying
		for (int i = 0; i < arr.length; i++) {

			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("************************");

		// 3 displaying
		for (int[] i : arr) {

			System.out.println(Arrays.toString(i));
		}
	}

}
