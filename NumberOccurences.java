package com.practise.datastructuresandalgorithms;

public class NumberOccurences {

	public static void main(String[] args) {
		int n = 1385757879, r, count = 0;

		while (n > 0) {
			r = n % 10;
			if (r == 7) {
				count++;
			}
			n = n / 10;
		}
		System.out.println("7 is repeated " + count + " times");

	}

}
