package com.biz.input.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemIn06 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList();
		Scanner scanner = new Scanner(System.in);

		int intNum = 0;
		while (true) {
			System.out.print(++intNum);
			System.out.println("번 >> ");

			String strNum = scanner.nextLine();
			if (strNum.equals("--END")) {
				break;
			}
			try {
				int intScore = Integer.valueOf(strNum);
				intList.add(intScore);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println((intNum) + "번째에서 오류가 났습니다.");
				System.out.println("다시 입력하세요");
				intNum--;
				continue;
			}
		}
		System.out.println(intList);

	}

}