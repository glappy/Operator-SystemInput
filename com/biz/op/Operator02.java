package com.biz.op;

public class Operator02 {
	public static void main(String[] args) {
		boolean boolA = (30 == 40) && (40 == 50);
		boolean boolB = (30 <= 40) || (40 >= 50);
		boolean boolC = (30 < 40) || (40 >=50) &&(50 > 60) ;
		
		System.out.println(boolC);
	}

}
