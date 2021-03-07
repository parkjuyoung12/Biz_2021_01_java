package com.callor.score.service;

import java.util.Scanner;

public class MenuServiceImplV1 implements MenuService{
	
	private static Scanner scan = new Scanner(System.in);


	/**
	 * 1, 2, 3, QUIT 중 하나만 입력받도록 유효성 체크.
	 * 
	 * @return 
	 * 1, 2, 3이 입력되면 그 정수를 그대로 반환한다.
	 * QUIT가 입력되면 0을 반환한다.
	 * 그 외 문자나 값이 입력되면 -1을 반환한다.
	 */
	@Override
	public Integer selectMenu() {
		String strNum = "";

		// 선택지 입력
		try {
			strNum = scan.nextLine();
			int num = Integer.parseInt(strNum);
			
			// 유효성 체크(if~return)
			if( num<1 || num>3 ) {
				System.out.println(" ※ 숫자 1~3입력 ※ ");
				return -1; // if~return, if~break
			}
			
			// else ( 즉, num이 1~3일 때 )
			return num;
			
		} catch (NumberFormatException e) {
			if( strNum.equalsIgnoreCase("QUIT") ) {
				return 0;
			} else {
				// QUIT가 아닌 다른 문자열일 때
				// e.printStackTrace(); // 빨간 글씨 띄우는 것.
				System.out.println(" ※ 숫자 1~3입력 ※ ");
				return -1;
			}
		}
		
	}//selectMenu()

}//END::publicClass
