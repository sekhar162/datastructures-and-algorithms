package com.practise.datastructuresandalgorithms;

import java.util.Scanner;

//0,1,1,2,3,5,8,13,21....
public class FibonacciOrNot {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter value to check fibonacci or not");
		int n = scr.nextInt();
		scr.close();
		int a = 0;
		int b = 1;
		int count = 2;
		for (; count <= n; count++) {
			int temp = a + b;
			a = b;
			b = temp;
			if(b>=n) {
				break;
			}
		}
		if (n == b)
			System.out.println("Fibonacci number");
		else
			System.out.println("Not a Fibonacci Number");

//		System.out.println(b);

	}

}
