package com.callor.start.keyinput;

import java.util.Scanner;

public class KeyInput_02 {
	public static void main(String[] args) {

		// Scanner 클래스를 객체로 생성하면서
		// 운영체제의 키보드 시스템과 연결한다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력 >> ");
		int num = scan.nextInt();
		
		boolean intNum1 = num % 2 == 0;
		if (intNum1) {
			System.out.print(num + " 은(는) 짝수 ");
		} else {
			System.out.print(num + " 은(는) 홀수 ");
		}
	}
}