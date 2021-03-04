package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.Impl.CartServiceImplV1;
import com.callor.shop.service.Impl.MenuServiceImplV1;

public class CartEx_01 {
	public static void main(String[] args) {
		
	CartService sSerivce = new CartServiceImplV1(); // 구매자
	MenuService sV1 = new MenuServiceImplV1(); // 카트메뉴

	while(true) {
		Integer menu = sV1.selectMenu();
		if(menu == null) {
			break;
		} else if (menu == 1) {
			sSerivce.inputService();
		} else if(menu == 2) {
			sSerivce.printService();
		} else if(menu == 3) {
			sSerivce.printServiceV1();
		}
	}
	}
	
}
