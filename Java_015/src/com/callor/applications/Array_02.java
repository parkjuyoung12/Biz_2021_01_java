package com.callor.applications;

import java.util.*;

public class Array_02 {
	public static void main(String[] args) {
		System.out.println("1 ~ 10 숫자를 입력하시오 >> ");
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
			
			boolean bYes = intNums[index] == intNums1;
			
			// 키보드숫자와 랜덤값이 맞은 갯수를 출력하는 코드
			if (bYes) {
				
			} // 2번쨰 if end 
			System.out.printf("intNums[%d]\n", index);

		} // for end
	} // main end
} // class end