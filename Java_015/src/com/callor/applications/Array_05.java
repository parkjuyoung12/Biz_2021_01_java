package com.callor.applications;

import java.util.Random;

public class Array_05 {
	public static void main(String[] args) {
		Random rnd = new Random();
		// 배열 100개 선언
		int[] intNums = new int[100];
		int sum = 0; // 합계 0 초기화

		for (int index = 0; index < intNums.length; index++) {

			intNums[index] = rnd.nextInt(100) + 1; // 1~100까지의 난수
			System.out.println("1 ~ 100 무작위 수 : " + intNums[index]);

			// intNums 배열에 저장된 난수의 값이 3배수 and 5배수 인 값을 bYes 에 담아라.
			boolean bYes = intNums[index] % 3 == 0 && intNums[index] % 5 == 0;
			if (bYes) {
				System.out.println("3, 5 배수인 숫자 : " + intNums[index]); //
				sum += intNums[index];

			}

		}
		for (int index = 0; index < intNums.length; index++) {

			intNums[index] = rnd.nextInt(100) + 1; // 1~100까지의 난수

			// intNums 배열에 저장된 난수의 값이 3배수 and 5배수 인 값을 bYes 에 담아라.
			boolean bYes = intNums[index] % 3 == 0 && intNums[index] % 5 == 0;
			if (bYes) {
				
				// intNums[index] 변수에 저장된 3과 5배수인 것을 sum에 저장하라.
				sum += intNums[index]; 

			}

		}
		System.out.println("===========================");
		// 3과 5의 배수합을 출력
		System.out.println("3, 5 배수 합 : " + sum);

	}

}
