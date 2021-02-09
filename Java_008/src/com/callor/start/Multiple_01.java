package com.callor.start;

public class Multiple_01 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if ((i + 7) % 3 == 0) {

				sum += i + 7;

				System.out.println("3의 배수 : " + (i + 7) + " 입니다.");
			}
		}
		System.out.println("3의 배수의 합계 : " + sum + " 입니다.");

		System.out.println("");
		
		// 2번째 방법
		System.out.println("--------- 절취선 ---------");
		
		System.out.println("");
		
		sum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			if (num % 3 == 0) {

				sum += num;

				System.out.println("3의 배수 : " + num + " 입니다.");
			}
		}
		System.out.println("3의 배수의 합계 : " + sum + " 입니다.");

		int intSumOdd = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			boolean bYes = num % 2 == 0;

			// if(bYes == false) {

			// bYes 가 true 가 아니면
			if (!bYes) {
				intSumOdd += num;
			}
		}
		System.out.println("홀수의 합 : " + intSumOdd);
	}
}
