package com.callor.shop;

import com.callor.shop.service.MenuService;
import com.callor.shop.service.MenuServiceV1;
import com.callor.shop.service.Impl.ShopService;
import com.callor.shop.service.Impl.ShopServiceV1;

public class ShopManager {
	public static void main(String[] args) {
		
	MenuService sSerivce = new ShopService(); // 구매자
	MenuServiceV1 sV1 = new ShopServiceV1(); // 카트메뉴

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
