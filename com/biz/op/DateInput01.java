package com.biz.op;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInput01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] dateForm = {
				"yyMMdd", "yy/MM/dd", "yyMM", "yy-MM-dd", "yy.MM.dd"
		};
		
		int index = 0 ;
		while(true) {
			System.out.println("다음형식에 맞도록 날짜 입력");
			System.out.print(dateForm[index++ % 5] + ">>");
			String strDate = scanner.nextLine() ;
			if(strDate.equals("--END")) {break ;}
			
			SimpleDateFormat dcheck = new SimpleDateFormat(dateForm[index++ % 5]) ;
			dcheck.setLenient(false);
			
			try {
				dcheck.parse(strDate);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("날짜가 유효하지 않습니다.");
				index -- ;
				continue ;
			}
			System.out.println("입력한 날짜는 유효합니다.");
		}
		
	}
}
