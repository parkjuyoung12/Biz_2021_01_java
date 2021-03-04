package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceImplV2;
import com.callor.shop.service.impl.MenuServiceImplV1;
import com.callor.shop.values.Values;

public class CartEX_02 {
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV1();
		CartService cService = new CartServiceImplV2();
		
		while(true) {
			Integer menuItem = mService.selectMenu();
			if(menuItem == null) { // 널값 : 아무것도 아닌 값
				break;
			} else if(menuItem == Values.MENU_INPUT) {
				System.out.println("장바구니 추가");
				cService.inputCart();
			} else if(menuItem == Values.MENU_ALL_LIST) {
				// System.out.println("장바구니 리스트 보기");
				cService.printAllCart();
			} else if(menuItem == Values.MENU_USER_LIST) {
				System.out.println("구매자별 리스트 보기");
				cService.printUserCart();
			}
		}
		System.out.println("업무종료");
	}
}
