package com.biz.input.vo;

import java.util.Scanner;

public class SystemIn05 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int[] arrNum = new int[5];
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.print(i);
			System.out.print("번");
			String in = scanner.nextLine();
			in = in.trim();
		
			try {
				arrNum[i] = Integer.valueOf(in);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println( i + "번째에서 오류가 났습니다.");
				System.out.println("다시 입력하세요");
				i--;
				continue;
			}
		}
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}
}