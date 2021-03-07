package com.callor.score;

import java.util.Scanner;

import com.callor.score.service.MenuServiceImplV1;

public class Score_ex1 {
	
	public final static String D_LINE = "==================================================";
	public final static String S_LINE = "--------------------------------------------------";
	
	public static void main(String[] args) {
		
		MenuServiceImplV1 inputChecker = new MenuServiceImplV1();
		
		while(true) {
			// 메뉴 출력
			System.out.println(D_LINE);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(S_LINE);
			System.out.println("1. 학생성적 점수 생성\n"
					+ "2. 학생성적 점수 파일에 저장\n"
					+ "3. 성적결과 확인\n"
					+ "QUIT. 끝내기");
			System.out.println(D_LINE);
			System.out.print("선택 >> ");
			
			int num = inputChecker.selectMenu();
			
			if( num == 0 /* QUIT 입력 때 */ ) {
				break;
			}
			if( num == -1 /* 잘못된 입력 때 */ ) {
				continue;
			}
			
			if( num == 1 ) {
				
			} else if ( num == 2 ) {
				
			} else if ( num == 3 ) {
				
			}
			
			
		}// while(true)
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}// main
	
}//end::publicClass
