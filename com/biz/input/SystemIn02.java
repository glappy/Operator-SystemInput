package com.biz.input;

import java.io.InputStream;
import java.util.Scanner;

public class SystemIn02 {
	public static void main(String[] args) {
		InputStream input = System.in;
		Scanner scanner = new Scanner(input);
		System.out.println("값을 입력하고 엔터를 누르세요 ");
		String strInput = scanner.nextLine();
		System.out.println(strInput);

	}
}
