package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		boolean isPrime = true;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		sc.close();

		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(num + " is Prime Number");
		} else {
			System.out.println(num + " is not Prime Number");
		}

	}

}
