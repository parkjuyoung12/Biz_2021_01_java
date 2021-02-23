package com.callor.applications;

public class Numbers_02 {
	public static void main(String[] args) {
		int intNum1 = 33;
		int intNum2 = 77;
		int temp = 0;
		
		System.out.println("기존의 intNum1 : " + intNum1);
		System.out.println("기존의 intNum2 : " + intNum2);
		
		// 1. (임시)로 사용할 intTemp를 만들고
		// 2. num1 변수값을 복사해 둔다(백업)
		// 		33을 temp에 복사
		// 		temp == num1
		temp = intNum1;

		// 3. num1 변수에 num2 의 값을 복사
		// num1 == num2 상태가 된다.
		//		77을 num1 에 복사
		//		num1은 77로 변경
		intNum1 = intNum2;

		// 4. 임시로(temp == 33) 에 백업해둔 num1의 값을
		// 		num1 == 33
		//		temp == 33
		//	num2에 복사
		intNum2 = temp;
		
		// 5. num1 과 num2 의 값이 서로 바뀐다.
		// 변수값의 swap 코드
		
		

		System.out.println();
		System.out.println("교체후 intNum1 : " + intNum1);
		System.out.println("교체후 intNum2 : " + intNum2);
	}
}