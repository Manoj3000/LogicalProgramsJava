package com.bridgelabz;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

	public String createRandomCode(int len) {
		char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new SecureRandom();
		
		for (int i = 0; i < len; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();
		return output;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int N = sc.nextInt();
		
		CouponNumbers myObj = new CouponNumbers();
		System.out.println(myObj.createRandomCode(N));
	}
}
