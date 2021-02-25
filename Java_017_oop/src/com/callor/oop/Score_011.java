package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_011 {
	public static void main(String[] args) {
		
		ScoreVO sVO = new ScoreVO();
		
		Scanner scan = new Scanner(System.in);
	
		while(true) {
			System.out.println("학생의이름을 입력하세요.");
			sVO.strName = scan.nextLine();
			
			while(true ) {
				System.out.println("국어 점수를 입력하세요");
				System.out.print(">> ");
				String strKor = scan.nextLine();
				try {
					int intTemp = Integer.valueOf(strKor);
					sVO.intKor = intTemp;
					System.out.println("국어점수 : " + intTemp);
				}
			}
		try {
			if (sVO.intKor >= 50 && sVO.intKor < 101) {
				
			} else {
				System.out.println("50이상 100이하");
				break;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("숫자를 50이상 100이하 입력 ");
			break;
		}
			
		System.out.println("영어 점수를 입력하세요");
		System.out.print(">> ");
		try {
			if (sVO.intEng >= 50 && sVO.intEng < 101) {
				String temp = scan.nextLine();
				int intTemp = Integer.valueOf(temp);
				System.out.println("영어점수 : " + intTemp);
			}
			
		} catch (NumberFormatException el) {
			System.out.println("영어점수를 50 이상 100이하로 입력하시오.");
			break;
		}
		
		System.out.println("수학 점수를 입력하세요");
		System.out.print(">> ");
		try {
			if (sVO.intMath >= 50 && sVO.intMath < 101) {
				String temp = scan.nextLine();
				int intTemp = Integer.valueOf(temp);
				
				System.out.println("수학점수 : " + intTemp);
			}
		} catch (NumberFormatException ea) {
			System.out.println("수학점수를 50 이상 100이하로 입력하시오.");
			break;
		}


		}
	}
}
