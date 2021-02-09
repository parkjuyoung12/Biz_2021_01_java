package com.callor.start.jdk;

import java.util.Random;

public class Random_05 {
	public static void main(String[] args) {
		
		// rnd 인스턴스
		Random rnd = new Random();
		// 변수 sum 선언하고 0으로 초기화
		int sum = 0;

		for(int i = 0; i < 100; i++) { // i = 0 ~ 99까지 1씩증가
			int num = rnd.nextInt(100)+1; // num변수에 random 수 1 ~ 100까지 무작위 출력
			if(num % 2 == 0) { //  num 변수에 저장되어있는게 짝수인가 ?
				sum += num; // 짝수면 sum + 짝수의 수 를 sum에 저장
				System.out.println(num + " : 짝수"); // 짝수이면..
			} else {
				System.out.println(num + " : 이거슨 홀수여"); // 짝수가 아니면..
			}
		}
		System.out.println("짝수의 합계 : " + sum); // 16번 라인에 저장된 짝수의 총 합계
	}
}
