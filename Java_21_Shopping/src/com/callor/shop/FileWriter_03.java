//package com.callor.shop;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class FileWriter_03 {
//	public static void main(String[] args) {
//		String numsFile = "src/com/callor/shop/files/nums.txt";
//		Random rnd = new Random();
//
//		// 리스트를 만들어서 Random수를 저장하기
//		List<Integer> intList = new ArrayList<Integer>();
//		for(int i = 0; i < 100; i++) {
//			// 1번 코드
//			Integer num = rnd.nextInt(1000)+1;
//			intList.add(num);
//			
//			// 2번 코드
//			intList.add(rnd.nextInt(1000)+1);
//			
//		}
//		
//		
//		int[] nums = new int[100];
//		for(int i =0; i<nums.length; i++) {
//			nums[i] = rnd.nextInt(1000)+1;
//			
//		}
//		
//		FileWriter fileWriter = null;
//		PrintWriter printer = null;
//		
//		try {
//			fileWriter = new FileWriter(numsFile);
//			printer = new PrintWriter(fileWriter);
//		
//			// intList 에 담긴 전체리스트를 
//			// 향상된 for로반복하면서 파일에 기록
//			for(int n : intList) {
//				printer.println(n);
//			}
//			
//			// 표준형 for로 반복하면서 파일에 출력
//			int nSize = intList.size();
//			for(int i=0; i<nSize; i++) {
//				Integer n = intList.get(i);
//				printer.println(n);
//			}
//			
//			printer.close();
//			fileWriter.close();
//			System.out.println("Mission Complete!!!");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}