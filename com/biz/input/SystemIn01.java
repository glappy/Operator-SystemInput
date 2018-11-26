package com.biz.input;

import java.io.InputStream;
import java.util.Scanner;

public class SystemIn01 {

	public static void main(String[] args) {
	
		int intNum1 = 30 ;
		System.out.println(30);
		
		InputStream input = System.in ;
		
		Scanner scanner = new Scanner(input) ;
		
		System.out.println("키보드 버퍼에서 감시시작...  ");
		String strKeyInput = scanner.nextLine();
		System.out.println("값을 읽기 시작... ");
		System.out.println(strKeyInput);
		
		
		
	}
	
	
}
