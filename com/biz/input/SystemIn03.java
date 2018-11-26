package com.biz.input;

import java.io.InputStream;
import java.util.Scanner;

public class SystemIn03 {
	public static void main(String[] args) {

		InputStream input = System.in;

		Scanner scanner = new Scanner(System.in);

		System.out.print("번호를 입력하세요 >> ");
		String strInput = scanner.nextLine();
		System.out.println(strInput);

		
		
	}
}
