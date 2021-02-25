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
public class HomeWork_011 {
	public static void main(String[] args) {
		PrimeServiceV22 psV2 = new PrimeServiceV22();
		Random rnd = new Random();
		
		// 이 두개의 변수는 for() 반복문에서 수행한 연산
		// 덧셈, 개수세기 를 수행한 후
		// 결과를 출력하는 곳에서 사용해야 할 변수
		// 따라서 for() 반복문이 시작되기 전에
		// 변수를 선언 및 초기화 
		int intPrimeSum = 0;
		int intPrimecount = 0;
		
		for( int i = 0; i < 100; i++) {
			// 0 ~ 99 까지의 난수를 생성하고
			// 생성된 난수에 +2를 수행하라
			// 실제 생성된 수는 
			// 2 ~ 101이다.
			int rndNum = rnd.nextInt(100)+2;
			
			// psV2 클래스의 prime() method 는
			// rndNum가 소수이면 그 수를 그대로 return 
			// 아니면 -1를 return 
			int result = psV2.prime(rndNum);
			
			if(result > 0) {
				System.out.print(rndNum + ", ");
//				intPrimeSum += rndNum;
//				intPrimecount ++ ;
			}
			// 소수들의 합을 계산하기
			// intPrimeSum 변수에 값을 누적하여 합계 계산
			if(result > 0) {
				intPrimeSum += rndNum;
			}
			
			// 소수들의 개수를 세기
			if(result > 0 ) {
				intPrimecount++;
			}
			
		} // end for
		System.out.println("\n합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimecount);
	}// main end
} // class end