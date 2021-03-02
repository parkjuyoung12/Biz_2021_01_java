package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {
	private String numAdd;
	private String numDel;
	private String numList;
	private String numEnd;
	
	/*
	 * 인스턴스 객체변수 선언
	 * 생성자에서 객체변수 초기화하여 사용 할 준비
	 */
	private Scanner scan;
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
		
	}
	public void selectMenu() {
		int numAd;
		numAdd = scan.nextLine();

		while (true) {
			System.out.println("================================");
			System.out.println("Java Menu System v1");
			System.out.println("--------------------------------");

			System.out.println("1. 카트 추가");
			System.out.println("2. 카트 삭제");
			System.out.println("3. 카트 리스트");
			System.out.println("Q. 끝내기");

			System.out.println("-------------------------------");
			System.out.print("선택 >> ");
			
			try {
				
				numAd = Integer.valueOf(numAdd);
				if (numAd != 1) {
				break;
				}
			} catch (Exception e) {
				System.out.println("숫자 1~3 또는 Q를 눌러주세요");
				
			}
		}

		int numDe;
		numDel = scan.nextLine();
		while (true) {
			try {
				numDe = Integer.valueOf(numDel);
				if (numDe != 2) {
					
					break;
				}
			} catch (Exception en) {
				System.out.println("숫자 1~3 또는 Q를 눌러주세요");
				
			}
		}

		int numLi;
		numList = scan.nextLine();
		while (true) {

			try {
				numLi = Integer.valueOf(numList);
				if (numLi != 3) {
					
					break;
				}
			} catch (Exception el) {
				System.out.println("숫자 1~3 또는 Q를 눌러주세요");

			}
		}
		
		numEnd = scan.nextLine();
		while (true) {
			try {
				if (numEnd != "Q") {
					break;
					
				}break;
			} catch (Exception ee) {
				System.out.println("숫자 1~3 또는 Q를 눌러주세요");
			}
		}
		System.out.printf("숫자 %s %s %s 를 입력하였습니다.", numAdd, numDel, numList);
	}

}
