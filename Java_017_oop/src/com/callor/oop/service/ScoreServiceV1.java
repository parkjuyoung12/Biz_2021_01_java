package com.callor.oop.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	Scanner scan = new Scanner(System.in);
	
	public int inputScore(String subject) {

		while(true) {
			System.out.println(subject + "점수를 입력 하세요");
			System.out.print(">> ");
			String strScore = scan.nextLine();
			
			try {
				int intScore = Integer.valueOf(strScore);
				if(intScore > 49 && intScore <= 100) {
					return intScore;
				}else {
					System.out.println(subject + "점수는 50 ~ 100 까지");
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
				// TODO: handle exception
			}
		}
		
		
	}

}
