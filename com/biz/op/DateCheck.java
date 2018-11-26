package com.biz.op;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {

	public static void main(String[] args) {

		String date1 = "1991/01/01";
		String date2 = "1991/02/29";
		String date3 = "2018/11/31";

		SimpleDateFormat dateCheck = new SimpleDateFormat("yyyy MM dd");

		dateCheck.setLenient(false);
		try {
			dateCheck.parse(date1);
			System.out.println(date1);
			dateCheck.parse(date2);
			System.out.println(date2);
			dateCheck.parse(date3);
			System.out.println(date3);
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("예외발생");

		}

	}
}
