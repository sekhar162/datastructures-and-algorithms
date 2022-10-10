package com.practise.datastructuresandalgorithms;

import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter number to check prime or not");
		int n = scr.nextInt();
		int i = 2;
		boolean check = checkPrimeOrNot(i, n);
		if (check)
			System.out.print(" is not a prime number");
		else
			System.out.print(" is  a prime number");

	}

	private static boolean checkPrimeOrNot(int i, int n) {

		while (i < n) {
			if (n % i == 0) {
				return true;
			}

			i++;
		}
		return false;
	}

}
