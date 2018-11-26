package com.biz.op;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateValue {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getDate());
		System.out.println(date.getTime());

		Calendar cal = Calendar.getInstance() ;
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy MM dd") ;
		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss") ;
		String nowDate = dateForm.format(date) ;
		String nowTime = timeForm.format(date) ;
		System.out.printf("오늘의 날짜와 지금의 시각은.. %s %s", nowDate, nowTime);
		
		nowDate = dateForm.format(cal.getTime()) ;
		nowDate = timeForm.format(cal.getTime()) ;
	}

}
