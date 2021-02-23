package com.callor.applications;

import java.util.Scanner;

/*
 * 2부터 그 숫자 -1 부터 해당숫자까지 나누어서 한번이라도 나머지가 0이면
 * 그 수는 프라임수(소수) 가 아니다.
 */
public class Prime_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2 이상의 정수 입력");
		System.out.print(">> ");

		int intNum = 0;
		int keyNum = scan.nextInt();

		for (int b = 2; b < keyNum; b++) {
			boolean bYes = keyNum % b == 0; // bYes = 키보드로 입력 받은 값 % b-- 가 1일경우.
				
			if (bYes) {
				break;
			}
			int pos = 0;
			for ( pos = 2; pos < keyNum ; pos++) {
				if(keyNum % pos == 0) {
					break;
				}
			}
		
			//pos 의 값은?
			// System.out.println(pos);
			
			// for 반복문이 중간에 break 되면
			// 		항상 pos < keyNum 관계가 된다
			if(pos < keyNum) {
				System.out.println(keyNum + " 는 소수가 아님");
			}// for 반복문이 break 없이 모두 완료되었으면
			else {
				System.out.println(keyNum + " 소수임");
			}
		}
		
	}
}