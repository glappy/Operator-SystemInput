package com.biz.op;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate01 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("오늘의날짜 : " + localDate);
		System.out.println("지금은.. " + localTime);
		System.out.println("날짜와 시각 : " + localDateTime);

		LocalDate xmas = LocalDate.of(2018, 12, 25);
		System.out.println("올해 크리스마스 : " + xmas);

		LocalDate xMas100 = xmas.minusDays(100);
		System.out.println("D-100 : " + xMas100);
		LocalDate xMas2021 = xmas.plusYears(3);
		System.out.println(xMas2021);

		LocalDate newClass = xmas.plusMonths(3);
		System.out.println(newClass);

		LocalTime newTime = localTime.plusHours(1);
		System.out.println(newTime);

	}
}