package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

//* Product : 상품코드, 상품명, 
//* item : 품목명, 
//* dept : 거래처, 
//* 단가 : 매입단가, 매출단가 
//* 		* 수량을 곱셈하여 연산을 수행 
public class ProductVO_01 {

	public static void main(String[] args) {

		ProductVO pdVO = new ProductVO();
		System.out.println("toString() : " + pdVO.toString());

		Scanner scan = new Scanner(System.in);

		System.out.println("======================================");
		System.out.println("상품정보 등록(입력) 시스템 V1");
		System.out.println("--------------------------------------");
		System.out.println("상품 정보를 입력하세요");
		System.out.println("--------------------------------------");

		System.out.println("상품코드 입력");
		System.out.print(">> ");
		pdVO.strPCode = scan.nextLine();

		System.out.println("상품명 입력");
		System.out.print(">> ");
		pdVO.strPName = scan.nextLine();

		System.out.println("거래처 입력");
		System.out.print(">> ");
		pdVO.strItem = scan.nextLine();

		System.out.println("품목 입력");
		System.out.print(">> ");
		pdVO.strDName = scan.nextLine();

		System.out.println("매입단가 입력");
		System.out.print(">> ");
		pdVO.iPrice = scan.nextInt();

		System.out.println("매출단가 입력");
		System.out.print(">> ");
		pdVO.oPrice = scan.nextInt();
		
		pdVO.toString();
	}
}
