package com.callor.oop;

import com.callor.oop.model.ScoreVO;
import com.callor.oop.service.ScoreServiceV1;
import java.util.Scanner;

public class Score_02 {
	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ScoreVO scoreVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);

		System.out.println("=======================");
		System.out.println("성적입력 시스템 v1");
		System.out.println("=======================");
	
			System.out.println("학생의이름을 입력하세요.");
			String strName = scan.nextLine();
			scoreVO.strName = strName;
			
			scoreVO.setIntKor(ssV1.inputScore("국어")+ "");
			scoreVO.setIntEng(ssV1.inputScore("영어")+"");
//			scoreVO.intKor = ssV1.inputScore("수학");

	}
}
