package com.biz.op;

public class Operator01 {

	public static void main(String[] args) {

		boolean boolA = (30 == 40);
		boolean boolB = ("korea".equalsIgnoreCase("KOREA"));
		boolean boolC = (30 != 40);
		boolean boolD = !(30 == 40);

		boolean boolE = 30 > 40 ? true : false ;
	
	
		String strEven = (30%2 == 0) ? "true" : "false" ;
		String trueOrFalse = true ? "true" : "false" ;
		System.out.println("RePuBliC oF kOrEa".toUpperCase());
		System.out.println("RePuBliC oF kOrEa".toLowerCase());
		String s1 = "RePuBliC oF kOrEa".toLowerCase() ;
		System.out.println(s1);
	}
}
