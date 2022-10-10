package com.practise.datastructuresandalgorithms;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		int r, temp = 0;
		Scanner scr = new Scanner(System.in);
		System.out.println("please enter value to check polindrome or not");
		int n = scr.nextInt();
		int value=n;
		if (n <= 0) {
			System.out.println("Number should not be lessthan or equalto zero.");
		} else {
			while (n > 0) {
				r = n % 10;
				n = n / 10;
				temp = (temp*10)+r;
			}
			if (temp == value)
				System.out.println("Palindrome");
			else
				System.out.println("Not a palindrome");
		}
	}

}
