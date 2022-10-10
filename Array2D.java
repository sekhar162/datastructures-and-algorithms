package com.practise.datastructuresandalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scr.nextInt();

			}
			System.out.println();
		}
//		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
