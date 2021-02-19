package com.callor.applications.Service;

import java.util.Scanner;

public class ScoreServiceV1 {
	// 클래스 영역에 선언된 변수들
	// 클래스 영역 : 멤버 영역
	// 인스턴스 변수
	// ScroeServiceV1 scV1 클래스를 객체로 선언하고
	// = new scV1()  : 객체의 초기화
	// 인스턴스 : 객체가 초기화되면
	// 자동으로 사용할 준비가 되는 변수들
	private int intSum ;
	private float floatAvg;
	private int intKor;
	private int intEng;
	private int intMath;
	
	// input() method가 호출되면
	// 키보드를 통해서 국어, 영어, 수학 점수를 입력받고
	// intKor, intEng, ingMath 에 저장
	Scanner scan = new Scanner(System.in);

	
	public void input() {
		
		// input() method의 지역변수
		int intNum = 0;
		
		System.out.print("국어점수를 입력하시오 >> ");
		intKor = scan.nextInt();
		System.out.print("영어점수를 입력하시오 >> ");		
		intEng = scan.nextInt();
		System.out.print("수학점수를 입력하시오 >> ");
		intMath = scan.nextInt();
		
	}

	public void sum() {

		intSum = intKor + intEng + intMath;

	}

	public void avg() {

		floatAvg = (intSum / 3.0F);
	}

	// intKor, intEng, intMath 인스턴스 변수에
	// 저장된 값을 출력
	public void print() {
	// 입력받은 성적을 출력하는 변수	
		sum();
		avg();
		
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("총점 : " + intSum);
		
		System.out.printf("평균 : %3.2f\n ", floatAvg);
	}


}
