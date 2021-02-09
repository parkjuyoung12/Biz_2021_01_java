package com.callor.start;

public class Multiple_01 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < 100; i++) {

			int k = i + 1;

			if (k % 3 == 0 && k % 9 == 0) {
				
				sum += k;
				
				System.out.println("3 && 9 배수 : " + k);
			}

		}
		System.out.println("3의 배수 and  9의 배수의 합 : " + sum);
		
		sum = 0;
		
		for (int i = 0; i<100; i++) {

			int d = i +1;
			boolean bYes1 = d % 3 == 0;
			boolean bYes2 = d % 9 == 0;
			
			if( bYes1 && bYes2) {
				sum += d;
				System.out.println(d);
				
			}
			
		} System.out.println(sum);
		
		System.out.println("\n==============================");
		for(int i= 0; i < 100; i++) {
			
		
		int num1 = i + 1;
		
		boolean bYes3M = num1 % 3 == 0;
		boolean bYes9M = num1 % 9 == 0;
		int intsum = 0;
		if(bYes3M) {
			if(bYes9M) {
				intsum += num1;
				System.out.println(num1);
			}
		}
	}
}
}