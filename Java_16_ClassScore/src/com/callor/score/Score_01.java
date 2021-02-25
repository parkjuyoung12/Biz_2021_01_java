package com.callor.score;

import java.util.Random;

public class Score_01 {
	public static void main(String[] args) {
		String strName[] = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String strAddr[] = { "서울시", "익산시", "남원시", "한양시", "함흥시" };
		String strGwa[] = new String[] { "국어", "영어", "수학" };

		int arrLen = strName.length;

		int[] intKor = new int[arrLen];
		int[] intEng = new int[arrLen];
		int[] intMath = new int[arrLen];

		int intSum[] = new int[arrLen];
		float floatAvg[] = new float[arrLen];

		Random rnd = new Random();

		// 점수 생성
		for (int index = 0; index < strName.length; index++) {
			intKor[index] = rnd.nextInt(100) + 1;
			intEng[index] = rnd.nextInt(100) + 1;
			intMath[index] = rnd.nextInt(100) + 1;

			// 총점
			for (int i = 0; i < strName.length; i++) {
				intSum[i] = intKor[i];
				intSum[i] += intEng[i];
				intSum[i] += intMath[i];

				// 평균 계산
				for (i = 0; i < strName.length; i++) {

					floatAvg[i] = (float) intSum[i] / 3;

				}

				System.out.println("이름\t주소\t과목\t점수\t총점\t평균");
				System.out.println("====================================================");
			}

			for (int i = 0; i < strName.length; i++) {
				System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %3.2f\n", strName[index], strAddr[i], intKor[i],
						intEng[i], intMath[i], intSum[i], floatAvg[i]);
			}
		}
	}
}
