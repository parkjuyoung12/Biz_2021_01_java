package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;

public class MenuServiceImplV1 implements MenuService {

	private Scanner scan = new Scanner(System.in);

//	1) 초보적이지만 비교적 깔끔한 방법
//	@Override
//	public Integer selectMenu() {
//		String strNum ; 
//		strNum = scan.nextLine(); // "1", "2", "3", "QUIT", 그 외
//		if(strNum != null && strNum.equalsIgnoreCase("QUIT")) {
//			return 0;
//		}
//		
//		if(strNum!=null && (
//				strNum.equals("1")
//				|| strNum.equals("2")
//				|| strNum.equals("3") ) ) {
//			return Integer.valueOf(strNum);
//		}
//		
//		return -1;
//		
//	}

	@Override
	public Integer selectMenu() {
		String strNum;
		strNum = scan.nextLine(); // "1", "2", "3", "QUIT", 그 외
		if (strNum != null && strNum.equalsIgnoreCase("QUIT")) {
			return 0;
		}

		// 1. 숫자로 변환 되는지
		// 2-1. 변환된다면 그것이 1~3인지 (맞으면 그대로 반환, 아니면 -1 반환)
		// 2-2. 변환되지 않으면 -1 반환
		try {
			int num = Integer.valueOf(strNum);
			if (num >= 1 && num <= 3) {
				return num;
			} else {
				return -1;
			}
		} catch (Exception e) {
			return -1;
		}
		
	} // selectMenu()
} // public class
