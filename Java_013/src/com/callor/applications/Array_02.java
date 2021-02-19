package com.callor.applications;

import java.util.Random;

public class Array_02 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intNum = new int[10];

		for (int i = 0; i < 10; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			System.out.println(intNum[i]);

		}

		int intSum = 0;
		for (int sum = 0; sum < 10; sum++) {
			intSum += intNum[sum];

		} System.out.println("배열에 저장된 값의 합계 : " + intSum);

		/*
		 * int sum = 0;
		 * sum = intScore[0] +intScore[1]+intScore[2];
		 * System.out.println("합계 : " + sum);
		 */
		
		int intSum1 = 0;
		for (int sum1 = 0; sum1 < 10; sum1++) {
			if (intNum[sum1] % 2 == 0) {
				intSum1 += intNum[sum1];
				
			} 
		}System.out.println("짝수의 합계는 : " + intSum1);
		
		
	}
}
