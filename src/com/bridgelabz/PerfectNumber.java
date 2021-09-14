package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		sc.close();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.print(i+" ");
				sum = sum + i;
			}
		}
		
		System.out.println("");
		
		if (sum == num) {
			System.out.println(num + " is perfect number");
		} else {
			System.out.println(num + " is not perfect number");
		}
	}

}
