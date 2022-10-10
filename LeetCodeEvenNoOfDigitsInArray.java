package com.practise.datastructuresandalgorithms;

//{1,2,33,4,55,66,777};
//op:3 // 3 numbers have even no of digits
public class LeetCodeEvenNoOfDigitsInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 33, 4, 55, 66, 777 };
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {

			int count = checkCount(arr[i]);
			if (count == 2) {
				answer++;
			}

		}
		System.out.println(answer);
	}

	private static int checkCount(int value) {
		int count = 0, r;
		while (value > 0) {
			value = value / 10;
			count++;

		}
		return count;
	}
}
