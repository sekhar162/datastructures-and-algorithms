package com.practise.datastructuresandalgorithms;

import java.util.Scanner;

//Check Whether a day is week day or Weekend
public class SwitchCasesold {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter a number between 1 to 7");
		int day = scr.nextInt();

		switch (day) {
		case 1:
			System.out.println("WeekDay");
			break;
		case 2:
			System.out.println("WeekDay");
			break;
		case 3:
			System.out.println("WeekDay");
			break;
		case 4:
			System.out.println("WeekDay");
			break;
		case 5:
			System.out.println("WeekDay");
			break;
		case 6:
			System.out.println("Weekend");
			break;
		case 7:
			System.out.println("Weekend");
			break;

		}

	}

}
