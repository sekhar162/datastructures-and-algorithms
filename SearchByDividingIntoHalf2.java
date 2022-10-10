package com.practise.datastructuresandalgorithms;

public class SearchByDividingIntoHalf2 {

	public static void main(String[] args) {

		int count = 0;
		int x = 9996;
		int end = 10000;
		int start = 0;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (mid == x) {
				System.out.println("mid");
				break;
			}
			if (mid > x) {
				count++;
				// return findNumber(collection, start, mid - 1, x);
				end = mid;
			} else {
				count++;
				start = mid;
				// return findNumber(collection, mid + 1, end, x);
			}
		}
		System.out.println(count);
	}
}
