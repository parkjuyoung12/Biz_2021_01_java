package com.callor.shop.service.Impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceImplV1 implements MenuService{
	
	private Scanner scan;
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	@Override
	public Integer selectMenu() { 
		while(true) {
			System.out.println("=================");
			System.out.println("카트 메뉴");
			System.out.println("-----------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("-----------------");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				break;
			} // 끝내기 부분
			
			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if(intMenu == 1 ) { // 입력받은 숫자가 1이냐
					return intMenu;
					
				}else if(intMenu == 2) { // 입력받은 숫자가 2냐
					return intMenu;
					
				}else if(intMenu == 3) { // 입력받은 숫자가 3이냐
					return intMenu;
				}
				
				else {
					System.out.println("메뉴는 1~3까지 선택"); // 1~3이 아니라면
				}
				
			} catch (Exception e) {
				System.out.println("메뉴는 QUIT, 1 ~ 3 까지 정수만 가능"); // 문자열을 입력헀다면
			}
		}
		return null;
}
}
