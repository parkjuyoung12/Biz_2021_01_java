package com.callor.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


public class FileWriter_01 implements FileServie {
	
	private String numFileName;
	protected Random rnd;

	
	public FileWriter_01() {
		rnd = new Random();
		numFileName = "src/com/callor/shop/nums.txt";
	}

	
	@Override
	public void saveCartToFile() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(numFileName);
			for(int i =0; i<1000; i++) {
				int nums = rnd.nextInt();
				
				fileWriter.close();
				printer.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void loadCartFromFile() {
		
	}
	
		
}
