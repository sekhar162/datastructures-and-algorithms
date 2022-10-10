package com.practise.datastructuresandalgorithms;

public class PrintFirstNNumberOfPrimeNumbers {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {

			boolean isPrime = checkPrime(i);
			if (isPrime)
				System.out.print(i + " ");

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
