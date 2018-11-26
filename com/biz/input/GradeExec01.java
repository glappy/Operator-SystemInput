package com.biz.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.input.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<GradeVO> gradeList = new ArrayList();

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 이름 >> ");
			String strName = scanner.nextLine();

			System.out.print("국어 >> ");
			String strKor = scanner.nextLine();

			System.out.print("영어 >> ");
			String strEng = scanner.nextLine();

			System.out.print("수학 >> ");
			String strMath = scanner.nextLine();
			
			GradeVO vo = new GradeVO();
			vo.setIntNum(i + 1);
			vo.setStrName(strName);

			try {
				int intKor = Integer.valueOf(strKor);
				int intEng = Integer.valueOf(strEng);
				int intMath = Integer.valueOf(strMath);

				vo.setIntKor(intKor);
				vo.setIntEng(intEng);
				vo.setIntMath(intMath);

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println((i + 1) + "th score error");
				System.out.println("please do it again");
				i--;
				continue;
			}
			gradeList.add(vo);

		}

		for (GradeVO vo : gradeList) {
			System.out.println(vo.toString());
		}
		
	}

}