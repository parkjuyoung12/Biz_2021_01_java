package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	Scanner scan = new Scanner(System.in);
	private List<CartVO> cartList = new ArrayList<CartVO>();
	private CartVO cartVO;

	public void inputCart() {
		this.cartVO = new CartVO();

		System.out.println("==========================");
		System.out.println("구매리스트");
		System.out.println("--------------------------");
		
		System.out.print("1. 구매자 >> ");
		String strName = scan.next();

		System.out.print("2. 품명 >> ");
		String strPName = scan.next();

		int intQty = 0;
		while (true) {
			System.out.print("3. 수량 >> ");
			String strQty = scan.next();

			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 2) {
					System.out.println("2이상 입력하세요.");
					continue;
				}else {
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력가능");

				// TODO: handle exception
			}
			
		}

		int intPrice = 0;
		while (true) {
			System.out.print("4. 단가 >> ");
			String cartPrice = scan.next();

			try {
				intPrice = Integer.valueOf(cartPrice);
				if (intPrice < 1000) {

					System.out.println("1000이상 입력하세요.");
					continue;
				}else {
					break;
				}
			} catch (Exception en) {
				System.out.println("숫자만 입력가능");

			}

		} // end while

		// 카트생성
		cartVO.setCartUserName(strName);
		cartVO.setCartPName(strPName);
		cartVO.setCartQty(intQty);
		cartVO.setCartPrice(intPrice);

		// 카트정보 저장 .add
		cartList.add(cartVO);

	} // end inputCart

	public void printCartList() {

		int size = cartList.size();
		for (int i = 0; i < size; i++) {

			System.out.println("상품정보");
			System.out.println("--------------------------------");
			System.out.println("구매자\t품명\t수량\t단가");
			System.out.printf("%s\t%s\t%d\t%d\n", cartList.get(i).getCartUserName(), cartList.get(i).getCartPName(),
					cartList.get(i).getCartQty(), cartList.get(i).getCartPrice());
			System.out.println("================================");
		} // end for
	} // end printCartList

}
