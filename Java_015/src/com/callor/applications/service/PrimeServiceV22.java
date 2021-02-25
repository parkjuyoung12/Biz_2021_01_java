package com.callor.applications.service;

public class PrimeServiceV22 {
	/*
	 * Homwork_01의 메인 메소드에서 랜덤클래스를 사용하여 2 이상의 임의의 정수 100개 만들고
	 * 
	 * v2의 prime() 메서드 호출하여 임의의 정수 100개 중 소수인 수들의 리스트 출력
	 * 
	 * 소수인 수들의 합을 계산 후 출력
	 */
	public int prime(int num) {
		// num = 2부터 시작해서 num1 < ?? 보다 작으면 num을 1증가 (for)
		int num1 = 0;
		for (num1 = 2; num1 < num; num1++) {
			
			if (num % num1 == 0) { // num % ?? == 0
				return -1;
			}
			
	
	}
		return num1;
}
}
