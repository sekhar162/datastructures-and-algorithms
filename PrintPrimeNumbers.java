package com.practise.datastructuresandalgorithms;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("please enter how many prime numbers do u want");
		int c = scr.nextInt();
		int count = 0;
		for (int i = 2; i <= 100; i++) {

			boolean isPrime = checkPrime(i);
			if (isPrime) {
				count++;
				System.out.print(i + " ");
			}

			if (count == c) {
				return;
			}

		}
	}

	private static boolean checkPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}

		}
		return true;
	}

}
