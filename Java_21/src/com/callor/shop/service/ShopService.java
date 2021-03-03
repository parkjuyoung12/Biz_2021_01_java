package com.callor.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.ServiceVO;

public class ShopService implements MenuService {
	List<ServiceVO> serviceList;
	Scanner scan;

	public ShopService() {
		scan = new Scanner(System.in);
		serviceList = new ArrayList<ServiceVO>();
	}

	public void inputService() {
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
					System.out.println("수량은 1 이상");
					continue; // continue 를 안쓸경우 else { break; }
				}
				break;
			} catch (Exception e) {
				System.out.println("수량은 숫자로만");
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
					continue; // continue 를 안쓸경우 else { break; }
				}
				break;
			} catch (Exception e) {
				System.out.println("단가는 숫자로만");
			}
		}
		

		ServiceVO serviceVO = new ServiceVO();
		serviceVO.setUserName(userName);
		serviceVO.setProductName(productName);
		serviceVO.setPrice(intPrice);
		serviceVO.setQty(intQty);
		serviceVO.setXprice(0);
		serviceVO.setTotal(intPrice);
		serviceList.add(serviceVO);
	}

	@Override
	public void printService() {
		int i=0;
		int nSize = serviceList.size();
		int total = 0;
		System.out.println("========================================");
		System.out.println("구매자\t상품명\t수량\t단가\t합계");
		System.out.println("----------------------------------------");
		for ( i = 0; i < nSize; i++) {
		
			System.out.print(serviceList.get(i).getUserName()+"\t");
			System.out.print(serviceList.get(i).getProductName()+"\t");
			System.out.print(serviceList.get(i).getQty()+"\t");
			System.out.print(serviceList.get(i).getPrice()+"\t");
			System.out.println(serviceList.get(i).getTotal());
			total+= serviceList.get(i).getTotal();
			

			
		}
		
System.out.println("------------------------------------------");	
System.out.println("합계" + "\t" + nSize+"가지"+"\t\t\t"+total);
	}

	@Override
	public void printServiceV1() {
		// TODO Auto-generated method stub
		System.out.println("출력할 구매자 이름을 입력하세요 ");
		System.out.print("이름 >> ");
		String userName = scan.nextLine();
		int total=0;
		for (int i = 0; i < serviceList.size(); i++) {
			try {
				if (serviceList.get(i).getUserName().equals(userName)) {
					System.out.println(serviceList.get(i).getUserName()+" 님의 장바구니");
					System.out.print(serviceList.get(i).getUserName()+"\t");
					System.out.print(serviceList.get(i).getProductName()+"\t");
					System.out.print(serviceList.get(i).getQty()+"\t");
					System.out.print(serviceList.get(i).getPrice()+"\t");
					System.out.println(serviceList.get(i).getTotal());
					total+= serviceList.get(i).getTotal();
				}
				break;
			} catch (Exception e) {
				// TODO: handle exception
		}
	}
	}

}
