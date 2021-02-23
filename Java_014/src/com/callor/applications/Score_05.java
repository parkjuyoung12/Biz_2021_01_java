package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Score_05 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		/*
		 * 변수는 1개의 변수에 1개의 값만 저장할 수 있다. => 3명 학생의 과목 점수를 저장해야 하기 떄문에 각 과목을 배열로 선언 => 몇개의
		 * 배열이 필요한지 명시(알려주기)
		 */

		// [개수] : 필요한 개수만큼 배열을 만들어라.
		String[] strName = new String[3];
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";

		String[] strname2 = new String[strName.length];
		strname2[0] = "국어";
		strname2[1] = "영어";
		strname2[2] = "수학";

		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		
		int[] sum = new int[strName.length];
		float[] avg = new float[strName.length];

		// 3명 학생의 과목 성적 입력받기
		// 1. 국어 과목의 3학생 점수를 입력받기.
		// 2. 학생별로 국어, 영어, 수학 점수를 각각 입력받기
		int i = 0;
		for (i = 0; i < strname2.length; i++) { // i(반복문)는 strname.length(배열의 길이) 보다 짧아야한다.

			intKor[i] = rnd.nextInt(100) + 1;

			intEng[i] = rnd.nextInt(100) + 1;

			intMath[i] = rnd.nextInt(100) + 1;
			
		
		} // for end

		// 학생별로 총점을 계산하는 코드
		for(i = 0; i<3; i++) {
			sum[i] += intKor[i];
			sum[i] += intEng[i]; 
			sum[i] += intMath[i];
			
		}
		
		// 학생별로 평균을 계산하는 코드
		for(i = 0; i < strName.length; i++)
		{
			avg[i] = sum[i] / 3.2F;	
		}
		
		// 성적 리스트 출력
		System.out.println("=================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		for (i = 0; i < 3; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n",strName[i] ,intKor[i],intEng[i],intMath[i],sum[i],avg[i]);
		}
		System.out.println("-------------------------------------------------");
	} // main end
}