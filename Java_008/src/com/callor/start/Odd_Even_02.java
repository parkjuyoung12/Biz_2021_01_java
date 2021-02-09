package com.callor.start;

public class Odd_Even_02 {

	public static void main(String[] args) {

		int sumeve = 0;
		int sumword = 0;

		for (int num = 0; num < 101; num++) {
			if (num % 2 == 0) {
				sumeve += num;
			}

		}
		System.out.println("짝수의 합 : " + sumeve);

		for (int num = 0; num < 101; num++) {

			if (num % 2 == 1) {
				sumword += num;
			}
		}
		System.out.println("홀수의 합 : " + sumword);

		
		System.out.println("-----------------------------");
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			boolean bYes = i % 2 == 0;
			if (bYes) {
				sum += i+2;
			}
		}
		System.out.println("짝수의 값 : " + sum);
		
		
		sum = 0;
		for (int i = 0; i < 100; i++) {
			boolean bYes = i % 2 == 1;
			if (bYes) {
				sum += i;
			}
		}
		System.out.println("홀수의 값 : " + sum);
	}
}
