package com.callor.oop;


import com.callor.oop.model.ScoreVO;
import com.callor.oop.service.ScoreServiceV1;

import java.util.Scanner;

public class Score_03 {
	public static void main(String[] args) {
		

		ScoreVO scoreVO = new ScoreVO();
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		Scanner scan = new Scanner(System.in);
		
	
			System.out.println("학생의이름을 입력하세요.");
			scoreVO.strName = scan.nextLine();
			String strName = scan.nextLine();
		
	
			while(true) {
				System.out.println("국어 점수를 입력하세요");
				System.out.print(">> ");
				String strKor = scan.nextLine();
				scoreVO.setIntKor(strKor);
				
				// intKor에 -1 이 담겨있으면
				// 다시 입력을 하도록 해야한다.
				if(scoreVO.getIntKor() < 0 ) {
					System.out.println("국어점수 유효성 검사 실패");
					continue; 
					}
				break;
			}
			while(true) {
				
			System.out.println("영어점수를 입력하세요");
			System.out.println(">> ");
			String strEng = scan.nextLine();
			scoreVO.setIntEng(strEng);
			if(scoreVO.getIntEng()<0) {
				System.out.println("영어점수 유효성 검사 실패");
				continue;
			}
			break;
			}
			while(true) {
				
				System.out.println("수학점수를 입력하세요");
				System.out.println(">> ");
				String strMath = scan.nextLine();
				scoreVO.setIntEng(strMath);
				if(scoreVO.getIntEng()<0) {
					System.out.println("수학점수 유효성 검사 실패");
					continue;
				}
				break;
				}
			
			}
}
