package com.callor.shop.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceImplV1 implements CartService {
	// 인스턴스 변수 선언
	private List<CartVO> serviceList;
	private Scanner scan; // Scanner 클래스를 사용해서 scan 객체를 선언
	// private = 메모리 관리 차원에서 사용

	public CartServiceImplV1() { // 초기화
		// 위에서 선언된 scan 객체를 사용하기 위한 준비
		// scan객체를 초기화 한 것 (or scan객체를 생성)
		scan = new Scanner(System.in); // 메모리 관리때문에 선언문과 생성문을 분리
		
		
		serviceList = new ArrayList<CartVO>();
	}

	public void inputService() { // 구매정보를 입력받는 부분
		System.out.println("============================");
		System.out.println("빛나라 쇼핑몰 2021");
		System.out.println("----------------------------");
		System.out.print("구매자 >> ");
		String userName = scan.nextLine();

		System.out.print("상품명 >> ");
		String productName = scan.nextLine();

		int intQty = 0;
		while (true) {
			System.out.println("수량>> ");
			String qty = scan.nextLine();
			try {
				intQty = Integer.valueOf(qty);
				if (intQty < 1) {
					System.out.println("수량은 1 이상"); // 만약 수량이 1보다 작다면 print문 출력
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("수량은 숫자로만"); // 문자열을 입력했을경우 print
			}
		}

		int intPrice = 0;
		while (true) {
			System.out.println("단가>> ");
			String price = scan.nextLine();
			try {
				intPrice = Integer.valueOf(price);
				if (intPrice < 50) {
					System.out.println("단가는 50원 이상");
					// 사용자 입력이 50보다 작으면 다시 입력하게끔 continue
					continue;
				}
				break; // 50보다 크면 if 문 빠져나온다.
			} catch (Exception e) {
				System.out.println("단가는 숫자로만"); // 만약 정수가아닌 문자열을 입력했다면 print
			}
		}

		CartVO serviceVO = new CartVO(); // CartVO 를 serviceVO로 선언
		serviceVO.setUserName(userName);
		serviceVO.setProductName(productName);
		serviceVO.setPrice(intPrice);
		serviceVO.setQty(intQty);
		serviceVO.setXprice(0);
		serviceVO.setTotal(intPrice);
		serviceList.add(serviceVO); // 저장
	}

	@Override
	public void printService() { // 장바구니 출력
		int i = 0;
		int nSize = serviceList.size();
		int total = 0;
		System.out.println("========================================");
		System.out.println("구매자\t상품명\t수량\t단가\t합계");
		System.out.println("----------------------------------------");
		for (i = 0; i < nSize; i++) {

			System.out.print(serviceList.get(i).getUserName() + "\t");
			System.out.print(serviceList.get(i).getProductName() + "\t");
			System.out.print(serviceList.get(i).getQty() + "\t");
			System.out.print(serviceList.get(i).getPrice() + "\t");
			System.out.println(serviceList.get(i).getTotal());
			total += serviceList.get(i).getTotal();
		}

		System.out.println("------------------------------------------");
		System.out.println("합계" + "\t" + nSize + "가지" + "\t\t\t" + total);
	}

	@Override
	public void printServiceV1() { // 해당 사용자의 장바구니 내역
		System.out.println("출력할 구매자 이름을 입력하세요 ");
		System.out.print("이름 >> ");
		String userName = scan.nextLine();
		int nameTotal = 0;
		int count = 0;
		for (int i = 0; i < serviceList.size(); i++) {
			try {
				if (serviceList.get(i).getUserName().equals(userName)) {
					System.out.println(serviceList.get(i).getUserName() + " 님의 장바구니");
					System.out.print(serviceList.get(i).getUserName() + "\t");
					System.out.print(serviceList.get(i).getProductName() + "\t");
					System.out.print(serviceList.get(i).getQty() + "\t");
					System.out.print(serviceList.get(i).getPrice() + "\t");
					System.out.println(serviceList.get(i).getTotal());
					nameTotal += serviceList.get(i).getTotal();

				}
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
