package com.callor.score.service;

public interface MenuService{
	/** 메뉴 선택 
	 * 키보드로 숫자를 입력받은 값이  숫자 1, 2, 3, QUIT 바교 후
	 * 비교한 값이 맞다면 값에 해당하는 무언가의 조건을 만족시키고, 
	 * 만약 맞지 않다면 문구 출력 후 키보드로 다시 입력받게 되는 구조
	 *  */
	public Integer selectMenu();
	
}

