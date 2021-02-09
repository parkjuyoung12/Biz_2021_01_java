package com.callor.start;

public class Multiple_02 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			int isum = i + 7;
			if ((isum) % 3 != 0) {

				sum += isum;

			}
		}
		System.out.println("3의 배수가 아닌 수들의 합 : " + sum + " 입니다.");

		sum = 0;
		for (int i = 0; i < 100; i++) {
			int isum = i + 7;
			boolean bYes1 = isum % 3 == 1;
			if (bYes1) {
				sum += isum;

			}
		
			boolean bYes2 = isum % 3 == 2;
			if (bYes2) {
				sum += isum;
			}}
			System.out.println("3의 배수가 아닌 수들의 합 : " + sum + " 입니다.");

			sum = 0;

			for (int k = 0; k < 100; k++) {
				int num = k + 7;
				boolean bYes = num % 3 > 0;
				if (bYes) {
					sum += num;
				}
			}
			System.out.println(sum);
			
			
			sum = 0;

			for (int k = 0; k < 100; k++) {
				int num = k + 7;
				boolean bYes = num % 3 == 0;
				if (!bYes) {
					sum += num;
				}
			}

			System.out.println(sum);
		
	}
}
