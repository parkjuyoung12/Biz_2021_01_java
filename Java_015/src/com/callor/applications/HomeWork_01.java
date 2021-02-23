package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV22;

/*
 * Homwork_01의 메인 메소드에서 
 * 랜덤클래스를 사용하여 2 이상의 임의의 정수 100개 만들고
 * 
 * 
 * v2의 prime() 메서드 호출하여
 * 임의의 정수 100개 중 소수인 수들의 리스트 출력
 * 
 * 소수인 수들의 합을 계산 후 출력
 */
public class HomeWork_01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int rndSum = 0; // 랜덤 소수의 합
		int num = 0;
		for (int index = 0; index < 100; index++) {

			num = rnd.nextInt(100) + 2; // 2이상의 임의의 정수 100개
			System.out.println(num);
		} // for end

		PrimeServiceV22 psV2 = new PrimeServiceV22();

		int result = psV2.prime(num); // PrimeServiceV2에 있는 prime(num) method를 불러와 result에 할당
		if (result == 0) { // result (num 값을 나눴을때 나머지가 0인가?)
			
		} // if end
		else {

		} // else end

		for (int index = 0; index < 100; index++) { // 소수인 수들의 합계 구하는 반복문

			rndSum += result; // 소수인 수들의 합

		} // for end
		System.out.println("================================");
		System.out.println("소수인 수들의 합 : " + rndSum);
	}// main end
} // class end