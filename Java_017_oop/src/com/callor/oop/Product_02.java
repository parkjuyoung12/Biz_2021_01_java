//package com.callor.oop;
//
//import java.util.Scanner;
//
//import com.callor.oop.model.ProductVO;
//
//public class Product_02 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		ProductVO[] pVO = new ProductVO[5];
//		
//		for(int i = 0; i<5; i++) {
//			
//		pVO[i] = new ProductVO();
//
//		}
//		
//		for(int i = 0; i<5; i++) {
//		System.out.println("상품코드 : ");	
//		pVO[i].strPCode1 = scan.nextLine();
//		
//		System.out.println("상품명 : ");	
//		pVO[i].strPName1[i] = scan.nextLine();
//		
//		System.out.println("품목명 : ");	
//		pVO[i].strItem1[i] = scan.nextLine();
//
//		System.out.println("거래처 : ");	
//		pVO[i].strDName1[i] = scan.nextLine();
//
//		System.out.println("매입단가 : ");	
//		pVO[i].iPrice1[i] = scan.nextInt();
//		
//		System.out.println("매출단가 : ");	
//		pVO[i].oPrice1[i] = scan.nextInt();
//		
//		
//		System.out.println(pVO[i].strPCode1[i] + pVO[i].strPName1[i] + pVO[i].strItem1[i] + pVO[i].strDName1[i] + 
//				pVO[i].iPrice1[i] + pVO[i].oPrice1[i]);
//		}
//		
//		pVO.toString();
//	}
//}
