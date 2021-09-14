package com.bridgelabz;

import java.util.Scanner;

public class SimulateStopwatchProgram {

	public long startTimer = 0;
	public long stopTimer = 0;
	public long diff;

	public void startTime() {
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
	}

	public void stopTime() {
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);
	}

	public long getTimeDifference() {
		diff = stopTimer - startTimer;
		return diff;
	}

	public static void main(String[] args) {

		int startNum = 0, stopNum = 0;

		SimulateStopwatchProgram stopWatch = new SimulateStopwatchProgram();

		System.out.print("Press 1 to Start Time: ");
		Scanner sc = new Scanner(System.in);
		startNum = sc.nextInt();
		if (startNum == 1) {
			stopWatch.startTime();
		}

		System.out.print("Press 2 to Stop Time: ");
		stopNum = sc.nextInt();
		if (stopNum == 2) {
			stopWatch.stopTime();
		}
		System.out.println();
		long dis = stopWatch.getTimeDifference();
		System.out.println("Total Time Difference in millisec :" + dis);
	}

}
