package com.practise.datastructuresandalgorithms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);

		int n = 0;

		while (true) {
			System.out.println("Please enter Operator: ");
			char op = scr.next().trim().charAt(0);
			
			if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.out.println("Please enter 2 values: ");
				int num1 = scr.nextInt();
				int num2 = scr.nextInt();
				if (op == '+') {
					n = num1 + num2;
					System.out.println(num1 + " " + op + " " + num2 + " " + " = " + n);
				}
				if (op == '-') {
					n = num1 - num2;
					System.out.println(num1 + " " + op + " " + num2 + " " + " = " + n);
				}

				if (op == '*') {
					n = num1 * num2;
					System.out.println(num1 + " " + op + " " + num2 + " " + " = " + n);
				}
				if (op == '/') {
					n = num1 / num2;
					System.out.println(num1 + " " + op + " " + num2 + " " + " = " + n);
				}
				if (op == '%') {
					n = num1 % num2;
					System.out.println(num1 + " " + op + " " + num2 + " " + " = " + n);
				}
			} else if (op == 'x' || op == 'X') {
				System.out.println("you switched off the calculator");
				break;
			} else {
				System.out.println("Invalid operator");
			}
		}

	}

}
