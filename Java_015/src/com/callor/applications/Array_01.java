package com.callor.applications;

import java.util.*;

public class Array_01 {
	public static void main(String[] args) {

		// 정수 100개를 저장할 배열변수를 선언
		// 생성 (초기화 : 사용할 준비를 하라) 하라
		int[] intNums = new int[100];

		// Random 클래스를 사용하여 rnd 객체를 선언하고
		// = new Random() 명령을 사용하여
		// rnd 객체를 인스턴스화(化..으로 만든다) 시킨다
		// rnd : Random 클래스의 인스턴스
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int intNums1 = scan.nextInt();
		int count=0;
		
		// 0 ~ (intNums.length - 1) 횟수만큼 
		// 반복문을 실행하겠다.
		/*
		 * for(int i = 0; i < intNums.length; i++){
		 *  	intNums의 i번째 위에 정수 100을 저장하라
		 *  	i 값은 0 ~ (intNums.length - 1) 까지
		 *  	값을 갖게 되므로 전체 배열 100개에
		 *  	정수 100을 저장하라
		 *  
		 *  intNums[i] = 100;
		 * }
		 */
	
		/*
		 * 0 ~ intNums.length 까지의 정수를 만들어서 
		 * intNums의 위치값으로 정하고
		 * 
		 * 1 ~ 10까지의 임의 숫자를 생성하여 
		 * intNums의 배열에 채워 넣어라 
		 */
		for (int index = 0; index < intNums.length; index++) {
			
			// rnd 인스턴스의 nextInt() method를 호출(실행)하라
			// 매개변수값으로 10을 전달하라
			// Random  클래스의 nextInt() method에
			//		정수 10을 전달하고 실행하여
			// return 하는 결과를 intNums에 저장하라
			// intNums 변수에는 1 ~ 10 까지 중 1개의 숫자가
			//		저장될 것 이다.
			intNums[index] = rnd.nextInt(10) + 1;
			
			System.out.println(intNums[index]); // intNums[index] 에 저장된 1~10의 무작위 숫자
			
			// 키보드와 랜덤값을 비교하여 저장하는 코드
			if (intNums[index] == intNums1 ) {
				count = count + 1;
				System.out.println("저장할 숫자 " + intNums1);
			} // 1. if end
			
			// 키보드숫자와 랜덤값이 맞은 갯수를 출력하는 코드
			if (intNums[index] == intNums1 ) {
				System.out.printf("intNums[%d] ", index);
				
			} // 2번쨰 if end 
		} // for end
		System.out.println("=======================");
		System.out.println(count + "번 저장되어있습니다.");
		
	} // main end
} // class end