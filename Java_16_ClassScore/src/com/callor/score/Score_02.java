//package com.callor.score;
//
//import java.util.Random;
//
//import com.callor.score.service.ScoreServiceV1;
//
//public class Score_02 {
//	public static void main(String[] args) {
//
//		Random rnd = new Random();
//		ScoreServiceV1 ssV1 = new ScoreServiceV1();
//		
//		String strName[] = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
//		String strGwa[] = new String[] { "국어", "영어", "수학" };
//
//		int arrLen = strName.length;
//
//		int intKor[] = new int[arrLen];
//		int intEng[] = new int[arrLen];
//		int intMath[] = new int[arrLen];
//		
//		int sum[] = new int[arrLen];
//		float avg[] = new float[arrLen];
//		
//		int index = 0;
//		// 점수 난수
//		for (index = 0; index < strName.length; index++) {
//			intKor[index] = rnd.nextInt(100) + 1;
//			intEng[index] = rnd.nextInt(100) + 1;
//			intMath[index] = rnd.nextInt(100) + 1;
//			// 총점
//			for(index = 0; index < strName.length; index++) {
//				sum[index] = intKor[index];
//				sum[index] += intEng[index];
//				sum[index] += intMath[index];
//				for(index = 0; index < strName.length; index++) {
//					avg[index] = sum[index] / 3.0F;
//				}
//			}
//			
//			System.out.println("이름\t과목\t성적\t총점\t평균");
//			System.out.println("========================================");
//		for(int i=0; i<strName.length; i++) {
//			System.out.println(strName[i]+"\t"+strGwa[i] +"\t"+intKor[i]+"\t"+intEng[i]+"\t"+intMath[i] );
//		ssV1.scoreSum(intSum[i]);
//		ssV1.scoreAvg(index);
//		ssV1.scorePrint();
//		}
//		}
//	}
//}
