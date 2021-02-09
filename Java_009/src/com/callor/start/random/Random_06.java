package com.callor.start.random;

import java.util.Random;

public class Random_06 {
	public static void main(String[] args) {

		// rnd 인스턴스
		Random rnd = new Random();
		// 변수 sum 선언하고 0으로 초기화
		int sum = 0;

		for (int i = 0; i < 100; i++) { // i = 0 ~ 99까지 1씩증가
			int num = rnd.nextInt(100) + 1; // num변수에 random 수 1 ~ 100까지 무작위 출력
			if (num > 34) {
				System.out.println(num + " 은(는) 34보다 크므로 " + (i + 1) + " 번째 입니다. ");
				break; // 34 보다 큰 값이 나오면 정지
			}
		}
		int intEnd = 107;
		int count = 0;
		for (count = 0; count < intEnd; count++) {

			int num = rnd.nextInt(100) + 1;
			if (num > 50) {
				break;
			}

		}
		System.out.println(count);
		// count 변수 값을 읽을 수 있다.
		// 만약 for() 반복문이 중단되지 않고
		// 모두 정상적으로 수행되고 나면
		// count와 intEnd는 count == intEnd 가 된다.

		if (intEnd <= count) {
			// for() 가 정상 종료되었다.
		}
		if (intEnd > count) {
			// for() 가 어떤 이유로 중간에 break 되었다.
			System.out.println("for 중단");
			System.out.println((count + 1) + " 번째에서 값 발견");
		} else {
			System.out.println(" for 모두 반복 수행 완료");
			System.out.println("값을 찾을 수 없음");
		}
	}
}
