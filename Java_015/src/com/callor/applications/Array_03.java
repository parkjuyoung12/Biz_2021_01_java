package com.callor.applications;

import java.util.*;

public class Array_03 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		int i = 0;
		
		for(i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10)+1;
			System.out.println(intNums[i]);
		}
		// 키보드 입력을 받기위해 Scanner 클래스를
		// scan 객체로 선언
		// 		scan 객체를 인스턴스화 하기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 1 ~ 10까지 중 숫자 입력!");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();
		
		// intNums 는 어떤 값이 저장되어 있는지 모른다.
		// 단 1 ~ 10 까지의 숫자들이 들어 있을 것이다.
		// intNums 배열에 저장된 숫자들 중에서
		// 키보드로 입력받은 값 (keyNum에 저장되어있다) 과
		// 같은 값들이 몇번(몇개) 저장되어있는지
		// 알고싶다.
		
		for (i = 0; i < intNums.length; i++) {
			// if(intNums[i] == keyNum) { }
			boolean bYes = intNums[i] == keyNum;
			 if(bYes) {
				 System.out.println("최초로 나타나는 위치 : " + i);				 
				 break;
			 } 
		}
	}
}
