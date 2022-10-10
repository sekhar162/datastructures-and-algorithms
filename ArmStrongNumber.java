package com.practise.datastructuresandalgorithms;

//153
public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 155;
		int temp = 155;
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

}
