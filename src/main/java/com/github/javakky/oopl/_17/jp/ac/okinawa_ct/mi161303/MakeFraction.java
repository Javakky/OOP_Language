package com.github.javakky.oopl._17.jp.ac.okinawa_ct.mi161303-ct.mi161303;

public class MakeFraction{
	
	public static void main(String[] args){
		
		//error
		Fraction f1 = new Fraction(1, 0);
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator());
	}
	
}
