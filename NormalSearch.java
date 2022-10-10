package com.practise.datastructuresandalgorithms;

public class NormalSearch {

	public static void main(String[] args) {
		long startedTime = System.currentTimeMillis();
		int x = 9997;
		int count = 0;
		for (int i = 1; i < 10000; i++) {
			count++;
			if (i == x) {
				break;
			}

		}
		System.out.println("Occured after " + count + "iterations");
		long endedTime = System.currentTimeMillis();
		System.out.println("time taken=" + (endedTime - startedTime));
	}

}
