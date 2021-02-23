package com.callor.applications;

import java.util.Random;

public class Score_03 {
	public static void main(String[] args) {

		Random rnd = new Random();
		

		/*
		 * 변수는 1개의 변수에 1개의 값만 저장할 수 있다. => 3명 학생의 과목 점수를 저장해야 하기 떄문에 각 과목을 배열로 선언 => 몇개의
		 * 배열이 필요한지 명시(알려주기)
		 */

		// [개수] : 필요한 개수만큼 배열을 만들어라.
		String[] strName = new String[3];
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";

		String[] strname2 = new String[3];
		strname2[0] = "국어";
		strname2[1] = "영어";
		strname2[2] = "수학";

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		// 3명 학생의 과목 성적 입력받기
		// 1. 국어 과목의 3학생 점수를 입력받기.
		// 2. 학생별로 국어, 영어, 수학 점수를 각각 입력받기
		int i = 0;
		for (i = 0; i < strname2.length; i++) { // i(반복문)는 strname.length(배열의 길이) 보다 짧아야한다.

			intKor[i] = rnd.nextInt(100) + 1;

			intEng[i] = rnd.nextInt(100) + 1;

			intMath[i] = rnd.nextInt(100) + 1;

		} // for end

		System.out.println("===========================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-------------------------------------------");
		for (i = 0; i < 3; i++) {
			System.out.println(strName[i] + "\t" + intKor[i] + "\t" + intEng[i] + "\t" + intMath[i]);
		}
		System.out.println("-------------------------------------------");
	} // main end

}
