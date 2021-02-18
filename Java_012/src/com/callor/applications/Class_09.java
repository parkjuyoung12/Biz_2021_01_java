package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {
	public static void main(String[] args) {
		System.out.print("숫자 입력  >>  ");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();	
		
		ClassServiceV7 csV7 = new ClassServiceV7();
		csV7.gugu(dan);
		
		
		
	}
}
