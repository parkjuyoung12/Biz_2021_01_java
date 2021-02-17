package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV4 {
	
	// 총점과 평균을 전달받는
	//		2개의 매개변수가 있는 score() 메소드
	
	// 총점과 평균을 매개변수로 전달받아서
	//		Console 에 총점과 평균 출력
	public void print(int intKor, int intEng, int intMath) {
		
		int intSum = 0;
		float floatAvg = 0;
		
	
		intSum = intKor + intEng + intMath;
		floatAvg = intSum / 3.0F;
		
		System.out.println("=====================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		System.out.println(intKor+ "\t" + intEng+ "\t"+ intMath+ "\t"+ intSum + "\t" + floatAvg);
		System.out.println("=====================================");
	}
	public void score(int intKor, int intEng, int intMath) {
		
		int intSum = 0;
		float floatAvg = 0;
		
	
		intSum = intKor + intEng + intMath;
		floatAvg = intSum / 3.0F;
		
		System.out.println("=====================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		System.out.println(intKor+ "\t" + intEng+ "\t"+ intMath+ "\t"+ intSum + "\t" + floatAvg);
		System.out.println("=====================================");
	}
}
