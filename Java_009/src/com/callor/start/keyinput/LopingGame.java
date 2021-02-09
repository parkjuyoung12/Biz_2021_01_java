package com.callor.start.keyinput;

import java.util.*;

/*
 * 배경설명 : 
 * 
 *  1. Random 클래스를 사용하여 1 ~ 100 까지 임의 수를 
 *  	생성하여 변수에 담아 놓는다.
 *  2. Console 에 "숫자입력 >> " 프롬프트를 보여주고 
 *  3. 1 ~ 100 까지 정수를 입력받는다.
 *  4. 입력받은 정수와 rndNum 변수에 저장된 값을 비교하여
 *  5. 큰가, 작은가를 알려주고
 *  6. rndNum에 저장된 값을 맞추는 게임
 *  7. 2 부터 5까지를 계속 반복 하면서 값을 맞춘다.
 *  8. 만약 정수값에 -1 을 입력하면 게임을 중단한다.
 */
public class LopingGame {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		// 난수 1개 생성
		int rndNum = rnd.nextInt(100) + 1;
		int count;
		int sum = 6;
			for (count = 5; count > 0; count--) {

				while (true) {

					
					System.out.print("숫자입력 (-1 : Quit) >> ");
					int keyNum = scan.nextInt();


					if (keyNum < 0) {
						System.out.println("You Lose");
						break;
					} // while end
					if (keyNum == rndNum) {
						System.out.print(count + " 번 만에 맞췄습니다. ");
						System.out.println("You Win!!!");
						break;
					} else if (keyNum > rndNum) {
						System.out.println("입력값이 크다.");
					} else if (keyNum < rndNum) {
						System.out.println("입력값이 작다.");
					}					System.out.println("남은횟수 : " + (sum=sum-1)+ "\n");

					break;
				}

			
		}
		System.out.println("정답은 : " + rndNum);
		System.out.println("Game Over");
	}
}
