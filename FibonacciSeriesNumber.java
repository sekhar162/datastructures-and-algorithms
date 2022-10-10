package com.practise.datastructuresandalgorithms;

import java.util.Scanner;

//0,1,1,2,3,5,8,13,21....
public class FibonacciSeriesNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter value");
		int n = scr.nextInt();
		scr.close();
		int a = 0;
		int b = 1;
		int count = 2;
		System.out.print(a+" "+b + " ");
		for (; count <= n; count++) {
			int temp = a + b;
			a = b;
			b = temp;
			System.out.print(b + " ");
			
		}

	}

}
