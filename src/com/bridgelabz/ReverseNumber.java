package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num, reverse = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		sc.close();

		while (num != 0) {
			int x = num % 10;
			reverse = reverse * 10 + x;
			num = num / 10;
		}

		System.out.println("The reverse of the given number is: " + reverse);

	}

}
