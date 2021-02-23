package com.callor.applications;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] intKor = new int[5]; // int intKor[5]
		
		System.out.println("다음 학생들의 국어 점수를 입력하세요");
		for(int i = 0; i<5; i++) { // int i 0 ~ 4까지 1씩 증가
			System.out.printf("%d 번 학생 >> ", i + 1); // i + 1을 함으로써 1번 학생 부터 5번학생까지 출력
			intKor[i] = scan.nextInt(); // intKor[i] 배열에 1번 학생부터 국어 점수 키보드 입력 
		}
		int intKorSum = 0; 
		System.out.println("=================");
		System.out.println("학번\t국어점수");
		System.out.println("-----------------");
		for(int i = 0; i < 5; i++) { 
			System.out.print((i + 1) + "\t");  // i + 1 = 학번
			System.out.println(intKor[i]);
			intKorSum += intKor[i]; // 합계를 위한 함수
		}
		System.out.println("=================");
		System.out.println("합계 : " + intKorSum); // 합계
		System.out.println("-----------------");
	}
}
