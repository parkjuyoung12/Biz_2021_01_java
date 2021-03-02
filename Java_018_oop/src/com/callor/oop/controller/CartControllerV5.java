package com.callor.oop.controller;

/*
 * Controller 클래스
 * web application 프로젝트를 수행할 때
 * 처음 시작하는 시작점 Class 
 * 
 * Service 등 모듈클래스를 객체로 선언하고
 * 모듈클래스의 method들을 호출하는 일만 수행
 */
import com.callor.oop.service.CartServiceV1;

public class CartControllerV5 {

	public static void main(String[] args) {

		CartServiceV1 csV1 = new CartServiceV1();  
		// CartServiceV1에서 불러와 csV1 이라는 객체 선언

		csV1.inputCart(); // method호출
		csV1.printCartList();

	}
}
