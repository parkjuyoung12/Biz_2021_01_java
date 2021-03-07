package com.callor.shop;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.shop.service.impl.RndServiceImplV1;

public class FileWriter_05 { // 메인 호출
	public static void main(String[] args) {
		RndServiceImplV1 rsV1 = new RndServiceImplV1();
		rsV1.saveFileRnd();
		rsV1.makeRnd();
	}
}
	
