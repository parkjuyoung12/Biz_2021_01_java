package com.callor.start.keyinput;

import java.util.Scanner;

public class KeyInput_01 {
	
	// 키보드로 숫자 2개를 입력받고
	// 두 숫자의 덧셈을 계산
	public static void main(String[] args) {
		
		System.out.println(); // Console 출력문
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력 >> ");
		int intNum1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력 >> ");
		int intNum2 = scan.nextInt();
		System.out.println("두 수의 덧셈 은 " + (intNum1 + intNum2) + " 입니다.");
		
		
	}

}
