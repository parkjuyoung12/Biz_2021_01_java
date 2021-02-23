package com.callor.applications.service;

public class PrimeServiceV1 {
	public void prime(int num) { // prime_02 에서 정수 num 값 받아오기위한 코드
		int pos = 0;
		for ( pos = 2; pos < num ; pos++) { // 2에서부터 받아온 값 -1 까지 pos 1씩 증가
			if(num % pos == 0) { // num과 pos 를 나눴을떄 나머지가 0인가 ? 
				break;
			}
		}
		if(pos < num) {  // 나눴을떄 나머지가 pos 보다 num이 크면 
			System.out.println("소수아님.");// 소수 아님 출력
		} else {
			System.out.println("소수");
		}
	}
}
