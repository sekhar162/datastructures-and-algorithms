package com.practise.datastructuresandalgorithms;

public class SearchByUsingEvenAndOdd {

	public static void main(String[] args) {
		long startedTime = System.currentTimeMillis();
		int x = 9997;
		int count = 0;
		boolean even;
		if (x % 2 == 0) {
			for (int i = 1; i < 10000 / 2; i++) {
				count++;
				if (i == x) {
					break;
				}

			}
		} else {
			for (int i = 1; i < (10000 / 2) - 1; i++) {
				count++;
				if (i == x) {
					break;
				}

			}
		}

		System.out.println("Occured after " + count + "iterations");
		long endedTime = System.currentTimeMillis();
		System.out.println("time taken=" + (endedTime - startedTime));
	}

}
