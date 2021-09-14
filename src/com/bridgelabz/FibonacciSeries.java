package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int firstTerm = 0, secondTerm = 1, loopCount;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		loopCount = sc.nextInt();
		sc.close();

		for (int i = 1; i <= loopCount; i++) {

			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
