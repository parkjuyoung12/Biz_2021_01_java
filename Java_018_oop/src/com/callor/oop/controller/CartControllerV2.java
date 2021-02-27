package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {
	public static void main(String[] args) {
		//배열 객체 초기화
		CartVO[] cVO = new CartVO[3];

		cVO[0] = new CartVO(); // 배열 선언
		cVO[0].setCartUserName("홍길동");
		cVO[0].setCartPName("빼빼로");
		cVO[0].setCartStd("쿠키맛");
		cVO[0].setCartDate("2021-02-25");
		cVO[0].setCartTime("11:09:00");
		cVO[0].setCartQty(2000);
		cVO[0].setCartPrice(20);
		cVO[0].setCartTotal(2000*20);
		System.out.println(cVO[0].toString());
		
		cVO[1] = new CartVO();
		cVO[1].setCartUserName("이순신");
		cVO[1].setCartPName("허니버터칩");
		cVO[1].setCartStd("꿀맛");
		cVO[1].setCartDate("2021-02-26");
		cVO[1].setCartTime("12:11:00");
		cVO[1].setCartQty(5000);
		cVO[1].setCartPrice(10);
		cVO[1].setCartTotal(5000*10);
		System.out.println(cVO[1].toString());
		
		cVO[2] = new CartVO();
		cVO[2].setCartUserName("장녹수");
		cVO[2].setCartPName("아이스크림");
		cVO[2].setCartStd("우유맛");
		cVO[2].setCartDate("2021-02-27");
		cVO[2].setCartTime("12:15:00");
		cVO[2].setCartQty(1000);
		cVO[2].setCartPrice(20);
		cVO[2].setCartTotal(1000*20);
		System.out.println(cVO[2].toString());	
		// == cartVO의 개수가 3개인 상태
		// 상품 한가지를 더 카트에 넣고 싶다
		cVO = new CartVO[4];
		
		cVO[3] = new CartVO();
		cVO[3].setCartUserName("홍길동");
		cVO[3].setCartPName("바나나우유");
		
		System.out.println("======================");
		System.out.println("카트 내용");
		System.out.println("----------------------");
		for(int i = 0; i< cVO.length; i++) {
			System.out.println(cVO[i].toString());
		}

	}
}