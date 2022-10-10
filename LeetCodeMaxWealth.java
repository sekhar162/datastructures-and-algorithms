package com.practise.datastructuresandalgorithms;

public class LeetCodeMaxWealth {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr[i].length; j++) {
				count += arr[i][j];
			}
			if (count > temp) {
				temp = count;
			}
		}
		System.out.println(temp);

	}

}
